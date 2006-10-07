package de.mmeggs.macrodeck.lca.actions;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.ui.internal.intro.impl.model.url.IntroURLParser;
import org.eclipse.update.internal.search.SiteSearchCategory;
import org.eclipse.update.internal.ui.UpdateUI;
import org.eclipse.update.internal.ui.wizards.InstallWizard;
import org.eclipse.update.search.BackLevelFilter;
import org.eclipse.update.search.UpdateSearchRequest;
import org.eclipse.update.search.UpdateSearchScope;

import de.mmeggs.macrodeck.lca.ui.ICommandIds;

/**
 * Action to invoke the Update install wizard.
 * 
 * @since 3.0
 */
public class InstallUpdateWizardAction extends Action implements
		IWorkbenchAction {

	public static String ID = ICommandIds.INSTALL_UPDATE;

	private IWorkbenchWindow window;

	private boolean fromWelcomePage = false;
	
	public InstallUpdateWizardAction() {
		this(Workbench.getInstance().getActiveWorkbenchWindow(), "Install synchronization features");
		this.fromWelcomePage = true;
	}
		
	public InstallUpdateWizardAction(IWorkbenchWindow window, String text) {
		super(text);
		this.fromWelcomePage = false;
		this.window = window;
		// The id is used to refer to the action in a menu or toolbar
		setId(ID);
		// Associate the action with a pre-defined command, to allow key
		// bindings.
		setActionDefinitionId(ICommandIds.INSTALL_UPDATE);
		setImageDescriptor(de.mmeggs.macrodeck.lca.LCActivator
				.getImageDescriptor("/icons/weblookup.gif"));
	}

	public void run() {
		openInstaller(PlatformUI.getWorkbench().getActiveWorkbenchWindow());
		if (fromWelcomePage)
			new IntroURLParser("http://org.eclipse.ui.intro/switchToLaunchBar").getIntroURL().execute();
	}

	public void run(IAction action) {
		openInstaller(window);
	}

	private void openInstaller(final IWorkbenchWindow window) {
		BusyIndicator.showWhile(window.getShell().getDisplay(), new Runnable() {
			public void run() {
				try {
//					if (InstallWizard.isRunning()) {
//						MessageDialog.openInformation(window.getShell(), UpdateUIMessages.InstallWizard_isRunningTitle, UpdateUIMessages.InstallWizard_isRunningInfo);
//						return;
//					}
					UpdateSearchScope searchScope = new UpdateSearchScope();
					searchScope.addSearchSite(
									"Macrodeck Update Site",
									new URL("file:///C:/dev/ws/openaw/de.mmeggs.macrodeck.lca.updatesite/"),
									new String[] {});
					UpdateSearchRequest searchRequest = new UpdateSearchRequest(
							new SiteSearchCategory(true), searchScope);
					searchRequest.addFilter(new BackLevelFilter());
					IDialogSettings settings = UpdateUI.getDefault().getDialogSettings();
					settings.put("new-features-mode", false);
					InstallWizard wizard = new InstallWizard(searchRequest);
					wizard.performFinish();
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
