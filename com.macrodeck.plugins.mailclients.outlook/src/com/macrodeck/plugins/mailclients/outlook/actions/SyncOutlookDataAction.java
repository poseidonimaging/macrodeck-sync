package com.macrodeck.plugins.mailclients.outlook.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import com.macrodeck.lca.sync.actions.SyncAction;


/**
 * Our sample action implements workbench action delegate.
 * The action proxy will be created by the workbench and
 * shown in the UI. When the user tries to use the action,
 * this delegate will be created and execution will be 
 * delegated to it.
 * @see IWorkbenchWindowActionDelegate
 */
public class SyncOutlookDataAction extends SyncAction {
	/**
	 * The constructor.
	 */
	public SyncOutlookDataAction() {
	}

	/**
	 * The action has been activated. The argument of the
	 * method represents the 'real' action sitting
	 * in the workbench UI.
	 * @see IWorkbenchWindowActionDelegate#run
	 */
	public void run(IAction action) {
		MessageDialog.openInformation(
			window.getShell(),
			"Outlook Plug-in",
			"Sync done");
	}
}