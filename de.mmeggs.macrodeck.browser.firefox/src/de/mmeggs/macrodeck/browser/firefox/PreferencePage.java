package de.mmeggs.macrodeck.browser.firefox;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import de.mmeggs.macrodeck.lca.ui.settings.EmptyPreferencePage;

public class PreferencePage extends EmptyPreferencePage {

	public static String[] CHECK_LABELS = new String[] {
		"Bookmarks", "Cookies", "Profile" };
	
	protected void createMainContents(Composite mainComposite) {
		for (int i = 0; i < CHECK_LABELS.length; i++) {
			final int index = i;
			final Button checkbox = new Button(mainComposite, SWT.CHECK | SWT.LEFT);

			checkbox.setSelection(getPreferenceStore().getBoolean(
					CHECK_LABELS[index].toLowerCase()));

			checkbox.setText(CHECK_LABELS[index]);
			GridData gd = new GridData(GridData.FILL_HORIZONTAL);
			gd.horizontalSpan = 2;
			checkbox.setLayoutData(gd);
			checkbox.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					getPreferenceStore().setValue(CHECK_LABELS[index].toLowerCase(),
							checkbox.getEnabled());
				}
			});
		}
	}

	protected IPreferenceStore doGetPreferenceStore() {
		return Activator.getDefault().getPreferenceStore();
	}
}
