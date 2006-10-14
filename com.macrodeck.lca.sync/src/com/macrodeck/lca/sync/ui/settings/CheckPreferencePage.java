/*
 * ChecKPreferencePage.java 14.10.2006
 * 
 * Copyright (c) 2006 Manfred Mayer. All rights reserved.
 */
package com.macrodeck.lca.sync.ui.settings;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public abstract class CheckPreferencePage extends WorkbenchPreferencePage {

    protected void createMainContents(Composite mainComposite) {
        for (int i = 0; i < getLabels().length; i++) {
            final int index = i;
            final Button checkbox = new Button(mainComposite, SWT.CHECK | SWT.LEFT);

            checkbox.setSelection(getPreferenceStore().getBoolean(
                    getLabels()[index]));

            checkbox.setText(getLabels()[index]);
            GridData gd = new GridData(GridData.FILL_HORIZONTAL);
            gd.horizontalSpan = 2;
            checkbox.setLayoutData(gd);
            checkbox.addSelectionListener(new SelectionAdapter() {
                public void widgetSelected(SelectionEvent e) {
                    getPreferenceStore().setValue(getLabels()[index],
                            checkbox.getSelection());
                    savePluginPreferences();     
                }
            });
        } 
    }
    
    protected abstract void savePluginPreferences();

    public abstract String[] getLabels();
    
}
