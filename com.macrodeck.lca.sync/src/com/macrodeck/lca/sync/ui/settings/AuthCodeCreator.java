/*
 * AuthCodeCreator.java 14.10.2006
 * 
 * Copyright (c) 2006 Manfred Mayer. All rights reserved.
 */
package com.macrodeck.lca.sync.ui.settings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class AuthCodeCreator {
    
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

    public static String sha512(String string) {
        if (instance==null){
            instance = new AuthCodeCreator("SHA-512");
        }
        return instance.hash(string).toLowerCase();
    }
}
