package com.macrodeck.lca.sync.ui.settings;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.macrodeck.lca.sync.LCActivator;


/**
 * This class represents a preference page that
 * is contributed to the Preferences dialog. By 
 * subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows
 * us to create a page that is small and knows how to 
 * save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They
 * are stored in the preference store that belongs to
 * the main plug-in class. That way, preferences can
 * be accessed directly via the preference store.
 */

public class UserSettingsPage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public static final String ID = LCActivator.PLUGIN_ID+".preferences.UserSettingsPage";

	public UserSettingsPage() {
		super(GRID);
		setPreferenceStore(LCActivator.getDefault().getPreferenceStore());
		setDescription("Please provide your username and password to login to Macrodeck web service:\n");
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {

        addField(new StringFieldEditor(PreferenceConstants.P_USERNAME, "&Username:", getFieldEditorParent()));
		addField(new PasswordFieldEditor(PreferenceConstants.P_PASSWD, "&Password:", getFieldEditorParent()));
        
        addField(new StringFieldEditor(PreferenceConstants.P_UPDATE_SITE, "Update&Site:", getFieldEditorParent()));
        addField(new StringFieldEditor(PreferenceConstants.P_DATA_SERVICE_URL, "&DataServiceURL:", getFieldEditorParent()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
		
	}
	
}