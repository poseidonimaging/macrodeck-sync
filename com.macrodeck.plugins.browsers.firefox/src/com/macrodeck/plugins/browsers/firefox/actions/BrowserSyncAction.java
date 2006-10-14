package com.macrodeck.plugins.browsers.firefox.actions;

import java.io.File;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import com.macrodeck.lca.sync.SyncPlugin;
import com.macrodeck.lca.sync.actions.SyncAction;
import com.macrodeck.plugins.browsers.firefox.FirefoxSyncPlugin;
import com.macrodeck.plugins.browsers.firefox.PreferencePage;
import com.macrodeck.plugins.browsers.firefox.model.Bookmarks;

/**
 * Our sample action implements workbench action delegate. The action proxy will be created by the workbench and shown in the UI.
 * When the user tries to use the action, this delegate will be created and execution will be delegated to it.
 * 
 * @see IWorkbenchWindowActionDelegate
 */
public class BrowserSyncAction extends SyncAction {

    /**
     * The action has been activated. The argument of the method represents the 'real' action sitting in the workbench UI.
     * 
     * @see IWorkbenchWindowActionDelegate#run
     */
    public void run(IAction action) {
        if (FirefoxSyncPlugin.getDefault().getPreferenceStore().getBoolean(PreferencePage.P_BOOKMARKS)) {
            Bookmarks bookmarks = readBookmarksFromHTML(getProfileLocation());
            //getDataService().sync(bookmarks);
            MessageDialog.openInformation(this.window.getShell(), FirefoxSyncPlugin.PLUGIN_ID, "Sync done.\n"+bookmarks.toString());
        }
    }

    private File getProfileLocation() {
        File location = new File("D:/Dokumente und Einstellungen/m/Anwendungsdaten/Mozilla/Firefox/Profiles");
        if (!location.exists()) {
            SyncPlugin.getDefault().logError(FirefoxSyncPlugin.PLUGIN_ID, "Firefox profile location is incorrect");
            // go to settings dialog ...
        }
        String[] list = location.list();
        // pick first profile...
        // offer profile selector
        File firstProfileLocation = null;
        if (list.length > 0) {
            firstProfileLocation = new File(location+File.separator+list[0]);
        }
        return firstProfileLocation;
    }

    /**
     * reads bookmarks from HTML file: bookmarks.html
     * 
     * @param profileLocation
     * @return bookmarks object
     */
    private Bookmarks readBookmarksFromHTML(File profileLocation) {
        File bookmarksFile = new File(profileLocation + File.separator+ "bookmarks.html");
        if (!bookmarksFile.exists()) {
            SyncPlugin.getDefault().logError(FirefoxSyncPlugin.PLUGIN_ID, "Firefox bookmarks.html file not found. Incorrect profile or newer version.");
            return null;
        } else {
            return new Bookmarks(bookmarksFile);
        }
    }

}