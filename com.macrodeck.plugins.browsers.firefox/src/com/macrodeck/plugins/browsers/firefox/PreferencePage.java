package com.macrodeck.plugins.browsers.firefox;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import com.macrodeck.lca.sync.ui.settings.EmptyPreferencePage;


public class PreferencePage extends EmptyPreferencePage {

	public static final String P_PROFILE = "Profile";
    public static final String P_COOKIES = "Cookies";
    public static final String P_BOOKMARKS = "Bookmarks";
    
    public static String[] CHECK_LABELS = new String[] {
		P_BOOKMARKS, P_COOKIES, P_PROFILE };
	
    /**
     * set default values for prefernce properties
     */
    public PreferencePage() {
        getPreferenceStore().setDefault(P_BOOKMARKS, false);
        getPreferenceStore().setDefault(P_COOKIES, false);
        getPreferenceStore().setDefault(P_PROFILE, false);
    }
    
	protected void createMainContents(Composite mainComposite) {
		for (int i = 0; i < CHECK_LABELS.length; i++) {
			final int index = i;
			final Button checkbox = new Button(mainComposite, SWT.CHECK | SWT.LEFT);

			checkbox.setSelection(getPreferenceStore().getBoolean(
					CHECK_LABELS[index]));

			checkbox.setText(CHECK_LABELS[index]);
			GridData gd = new GridData(GridData.FILL_HORIZONTAL);
			gd.horizontalSpan = 2;
			checkbox.setLayoutData(gd);
			checkbox.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					getPreferenceStore().setValue(CHECK_LABELS[index],
							checkbox.getEnabled());
                    FirefoxSyncPlugin.getDefault().savePluginPreferences();     
				}
			});
		}
	}

	protected IPreferenceStore doGetPreferenceStore() {
		return FirefoxSyncPlugin.getDefault().getPreferenceStore();
	}
}
