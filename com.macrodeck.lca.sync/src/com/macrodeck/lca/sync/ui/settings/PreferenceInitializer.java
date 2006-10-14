package com.macrodeck.lca.sync.ui.settings;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import com.macrodeck.lca.sync.SyncPlugin;


/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = SyncPlugin.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.P_USERNAME,"");
		store.setDefault(PreferenceConstants.P_PASSWD,"");
	}

}
