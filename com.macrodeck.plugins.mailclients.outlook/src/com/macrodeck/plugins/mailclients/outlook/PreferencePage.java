package com.macrodeck.plugins.mailclients.outlook;

import org.eclipse.jface.preference.IPreferenceStore;

import com.macrodeck.lca.sync.ui.settings.CheckPreferencePage;


public class PreferencePage extends CheckPreferencePage {

    public static final String P_CONTACTS = "Contacts";
    public static final String P_MESSAGES = "Messages";
    public static final String P_CALENDERS = "Calenders";
    public static final String P_EVENTS = "Events";
    
    public static String[] CHECK_LABELS = new String[] { P_CONTACTS,
        P_MESSAGES, P_CALENDERS, P_EVENTS };

    /**
     * set default values for prefernce properties
     */
    public PreferencePage() {
        getPreferenceStore().setDefault(P_CONTACTS, false);
        getPreferenceStore().setDefault(P_MESSAGES, false);
        getPreferenceStore().setDefault(P_CALENDERS, false);
        getPreferenceStore().setDefault(P_EVENTS, false);
    }
    
    protected IPreferenceStore doGetPreferenceStore() {
        return OutlookSyncPlugin.getDefault().getPreferenceStore();
    }

    public String[] getLabels() {
        return CHECK_LABELS;
    }

    protected void savePluginPreferences() {
        OutlookSyncPlugin.getDefault().savePluginPreferences();
    }
}