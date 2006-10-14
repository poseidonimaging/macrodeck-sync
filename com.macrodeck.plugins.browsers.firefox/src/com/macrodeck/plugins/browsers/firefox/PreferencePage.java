package com.macrodeck.plugins.browsers.firefox;

import org.eclipse.jface.preference.IPreferenceStore;

import com.macrodeck.lca.sync.ui.settings.CheckPreferencePage;


public class PreferencePage extends CheckPreferencePage {

	public static final String P_PROFILE = "Profile";
    public static final String P_COOKIES = "Cookies";
    public static final String P_BOOKMARKS = "Bookmarks";
    
    public static String[] CHECK_LABELS = new String[] {
		P_BOOKMARKS, P_COOKIES, P_PROFILE };
	
    /**
     * set default values for prefernce properties
     */
    public PreferencePage() {
    }
    
	protected IPreferenceStore doGetPreferenceStore() {
		return FirefoxSyncPlugin.getDefault().getPreferenceStore();
	}

    public String[] getLabels() {
        return CHECK_LABELS;
    }

    protected void savePluginPreferences() {
        FirefoxSyncPlugin.getDefault().savePluginPreferences();
    }
}
