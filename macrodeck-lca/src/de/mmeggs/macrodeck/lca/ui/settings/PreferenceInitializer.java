package de.mmeggs.macrodeck.lca.ui.settings;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import de.mmeggs.macrodeck.lca.LCActivator;

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
		IPreferenceStore store = LCActivator.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.P_USERNAME,"");
		store.setDefault(PreferenceConstants.P_PASSWD,"");
	}

}
