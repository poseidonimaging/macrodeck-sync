package com.macrodeck.lca.sync.ui.settings;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.macrodeck.lca.sync.SyncPlugin;


public class EmptyPreferencePage extends PreferencePage {

	protected Control createContents(Composite parent) {
		noDefaultAndApplyButton();
		Composite mainComposite = new Composite(parent, SWT.NULL);
		mainComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout layout = new GridLayout();
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		layout.numColumns = 2;
		mainComposite.setLayout(layout);

		setDescription("synchronization set up");
		setImageDescriptor(SyncPlugin.getImageDescriptor("icons/sync.gif"));
		createMainContents(mainComposite);

		return mainComposite;

	}

	protected void createMainContents(Composite mainComposite) {
		// setMessage(getMessage()+" synchronisation settings");

	}

}
