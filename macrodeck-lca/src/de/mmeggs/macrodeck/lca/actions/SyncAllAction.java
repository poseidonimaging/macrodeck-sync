package de.mmeggs.macrodeck.lca.actions;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.internal.WorkbenchMessages;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.eclipse.ui.internal.registry.IWorkbenchRegistryConstants;

import de.mmeggs.macrodeck.lca.LCActivator;

public class SyncAllAction extends SyncAction {

	public void run(IAction action) {
		List configElems = LCActivator.getDefault().getAllPluginConfigs("syncAction");
		if (configElems != null) {
			for (Iterator iter = configElems.iterator(); iter.hasNext();) {
				IConfigurationElement element = (IConfigurationElement) iter
						.next();
				executeAction(element);
			}
		}
		MessageDialog.openInformation(window.getShell(), Platform.getProduct()
				.getName(), "All Sync done");
	}

	private void executeAction(IConfigurationElement element) {
		SyncAction action = null;
		try {
			action = (SyncAction) WorkbenchPlugin.createExtension(element,
					IWorkbenchRegistryConstants.ATT_CLASS);
			action.init(window);
			action.run(null);
		} catch (CoreException e) {
			ErrorDialog.openError((Shell) null,
					WorkbenchMessages.PreferenceNode_errorTitle,
					WorkbenchMessages.PreferenceNode_errorMessage, e
							.getStatus());
		}

	}
}
