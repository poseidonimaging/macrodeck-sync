package de.mmeggs.macrodeck.lca.ui;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.update.ui.UpdateManagerUI;

/**
 * Action to invoke the Update install wizard.
 * 
 * @since 3.0
 */
public class InstallUpdateWizardAction extends Action implements IWorkbenchAction {

    private IWorkbenchWindow window;

    public InstallUpdateWizardAction(IWorkbenchWindow window, String text, String id) {
        super(text);
        this.window = window;
        // The id is used to refer to the action in a menu or toolbar
        setId(ICommandIds.CMD_OPEN_MESSAGE);
        // Associate the action with a pre-defined command, to allow key bindings.
        setActionDefinitionId(ICommandIds.CMD_OPEN_MESSAGE);
        setImageDescriptor(de.mmeggs.macrodeck.lca.LCActivator.getImageDescriptor("/icons/sample3.gif"));    }

    public void run() {
        openInstaller(PlatformUI.getWorkbench().getActiveWorkbenchWindow());
    }

    public void run(IAction action) {
        openInstaller(window);
    }

    private void openInstaller(final IWorkbenchWindow window) {
        BusyIndicator.showWhile(window.getShell().getDisplay(), new Runnable() {
            public void run() {
                UpdateManagerUI.openInstaller(window.getShell());
            }
        });
    }

    public void selectionChanged(IAction action, ISelection selection) {
        // do nothing
    }

    public void dispose() {
        // do nothing
    }

    public void init(IWorkbenchWindow window) {
        this.window = window;
    }
}
