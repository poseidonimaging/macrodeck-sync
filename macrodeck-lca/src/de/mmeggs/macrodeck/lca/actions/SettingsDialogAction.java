package de.mmeggs.macrodeck.lca.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.preference.PreferenceManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.ui.internal.dialogs.WorkbenchPreferenceDialog;
import org.eclipse.ui.internal.intro.impl.model.url.IntroURLParser;

import de.mmeggs.macrodeck.lca.LCActivator;
import de.mmeggs.macrodeck.lca.ui.ICommandIds;
import de.mmeggs.macrodeck.lca.ui.settings.UserSettingsPage;

/**
 * Action to invoke the Update install wizard.
 * 
 * @since 3.0
 */
public class SettingsDialogAction extends Action implements
		IWorkbenchAction {

	public static String ID = ICommandIds.SETTINGS;

	private IWorkbenchWindow window;

	private boolean fromWelcomePage = false;
	
	public SettingsDialogAction(){
		this(Workbench.getInstance().getActiveWorkbenchWindow(), "Startup Settings");
		this.fromWelcomePage = true;
	}
			
	public SettingsDialogAction(IWorkbenchWindow window, String text) {
		super(text);
		this.fromWelcomePage = false;
		this.window = window;
		// The id is used to refer to the action in a menu or toolbar
		setId(ID);
		// Associate the action with a pre-defined command, to allow key
		// bindings.
		setActionDefinitionId(ICommandIds.SETTINGS);
		setImageDescriptor(de.mmeggs.macrodeck.lca.LCActivator
				.getImageDescriptor("/icons/settings.gif"));
	}

	public void run() {
		try {
			final PreferenceManager preferenceManager = LCActivator.getDefault().getPreferenceManager();
			Shell parentShell = window.getShell();
			if (parentShell == null) {
				// Determine a decent parent shell.
				final IWorkbench workbench = PlatformUI.getWorkbench();
				final IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
				if (workbenchWindow != null) {
					parentShell = workbenchWindow.getShell();
				} else {
					parentShell = null;
				}
			}
			WorkbenchPreferenceDialog dialog = new WorkbenchPreferenceDialog(parentShell, preferenceManager);
			dialog.setSelectedNode(UserSettingsPage.ID);
			dialog.create();
			dialog.open();
			if (fromWelcomePage)
				new IntroURLParser("http://org.eclipse.ui.intro/switchToLaunchBar").getIntroURL().execute();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run(IAction action) {

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
