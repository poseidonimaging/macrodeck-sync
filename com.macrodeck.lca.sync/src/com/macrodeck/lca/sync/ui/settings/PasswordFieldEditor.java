package com.macrodeck.lca.sync.ui.settings;

import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import com.macrodeck.lca.sync.AuthCodeCreator;
import com.macrodeck.lca.sync.SyncServiceImpl;

public class PasswordFieldEditor extends StringFieldEditor {

	
	public PasswordFieldEditor(String prefId, String label, Composite fieldEditorParent) {
		super(prefId, label, fieldEditorParent);
	}

	public Text getTextControl(Composite parent) {
        Text textField = null; 
		if (getTextControl() == null) {
            textField = new Text(parent, SWT.PASSWORD | SWT.SINGLE | SWT.BORDER);
            textField.setFont(parent.getFont());
            textField.addDisposeListener(new DisposeListener() {
                public void widgetDisposed(DisposeEvent event) {
                    getTextControl().dispose();
                }
            });
        } else {
            checkParent(textField, parent);
        }
        return textField;
	}
    
    protected void doStore() {
        String text = getTextControl().getText();
        getPreferenceStore().setValue(getPreferenceName(), text);
        SyncServiceImpl.getInstance().setPassword(text);
    }
}
