/*
 * AuthCodeCreator.java 14.10.2006
 * 
 * Copyright (c) 2006 Manfred Mayer. All rights reserved.
 */
package com.macrodeck.lca.sync;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.RemoteException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.macrodeck.www.xmlns.services._1_0.MacroDeckUserServicePort;

public class AuthCodeCreator {
    
    private static final String SALT = "giomullyoxonoind:";
    
    private static AuthCodeCreator instance;
    
    private MessageDigest md;

    private byte[] digest;

    public AuthCodeCreator(String algorithm) {
        try {
            md = MessageDigest.getInstance(algorithm);
        } catch (NoSuchAlgorithmException nsae) {
            nsae.printStackTrace();
        }
    }

    public String toHexString(byte b) {
        int value = (b & 0x7F) + (b < 0 ? 128 : 0);

        String ret = (value < 16 ? "0" : "");
        ret += Integer.toHexString(value).toUpperCase();

        return ret;
    }

    public String hash(String data) {
        StringBuffer strbuf = new StringBuffer();

        md.update(data.getBytes(), 0, data.length());
        digest = md.digest();

        for (int i = 0; i < digest.length; i++) {
            strbuf.append(toHexString(digest[i]));
        }

        return strbuf.toString();
    }

    public static void main(String[] args) {
        AuthCodeCreator md5 = new AuthCodeCreator("SHA-512");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        String input = "";

        if (args.length == 1) {
            try {
                num = Integer.parseInt(args[0]);
            } catch (NumberFormatException nfe) {
                nfe.printStackTrace();
            }

            try {
                while (num-- > 0) {
                    input = br.readLine();

                    System.out.println(input + "\t-\t" + md5.hash(input) + "\n");
                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }

    
    /**
     * The idea will be like this:
     * 1) Get an authCookie. This will change each time you request one and each time you login and will be used to get an authCode. 
     *    Randomly generated and has no security significance other than it prevents a hashed password from transferring over the network. 
     *    It will be a salted, hashed, password. 
     * 2) Request an authCode using an authToken. 
     *    authToken = sha512(authCookie + ":" + sha512(password)). 
     *    The server will check that it gets the same result, if so, you'll get the authCode and can perform all actions on that user's behalf. 
     * @return authcode from preferenceStore
     */
    private String createAuthToken(String password, String authCookie) {
        // String password = SyncPlugin.getDefault().getPreferenceStore().getString(PreferenceConstants.P_PASSWD);
        String authToken = sha512(authCookie + ":" + sha512(SALT + password));
        //System.out.println("SALT:password: "+SALT + password);
        //System.out.println("sha512(SALT:password): "+AuthCodeCreator.sha512(SALT + password));
        //System.out.println("authToken: "+authToken.toLowerCase());
        return authToken.toLowerCase();
    }
    
    /**
     * @param userService
     * @param userName
     * @param userService 
     * @return authCookie
     * @throws RemoteException
     */
    private String getAuthCookie(MacroDeckUserServicePort userService, String userName) throws IOException {
        String authCookie = null;
        File file = new File("./authCookie");
        if (!file.exists() || System.currentTimeMillis() - file.lastModified() > 60000) {
            // fetch new cookie
            authCookie = userService.getAuthCookie(userName);
            BufferedWriter w = new BufferedWriter(new FileWriter(file));
            w.write(authCookie);
            w.close();
        } else {
            // read from file
            BufferedReader r = new BufferedReader(new FileReader(file));
            authCookie = r.readLine();
            r.close();
        }
        return authCookie;
    }
    
    public String getAuthCode(MacroDeckUserServicePort userService, String userName, String password) throws IOException {
        String authCookie = getAuthCookie(userService, userName);
        String authToken = createAuthToken(password, authCookie);
        String authCode = userService.getAuthCode(userName, authToken);
        return authCode;
    }
        
    
    public String sha512(String string) {
        return hash(string).toLowerCase();
    }
    
    public static AuthCodeCreator getInstance(){
        if (instance==null){
            instance = new AuthCodeCreator("SHA-512");
        }
        return instance;
    }
}
