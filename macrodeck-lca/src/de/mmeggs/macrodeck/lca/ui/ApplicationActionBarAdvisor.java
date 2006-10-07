package de.mmeggs.macrodeck.lca.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.ToolBarContributionItem;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.internal.IntroAction;

import de.mmeggs.macrodeck.lca.actions.InstallUpdateWizardAction;
import de.mmeggs.macrodeck.lca.actions.SettingsDialogAction;

/**
 * An action bar advisor is responsible for creating, adding, and disposing of
 * the actions added to a workbench window. Each window will be populated with
 * new actions.
 */
public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	// Actions - important to allocate these only in makeActions, and then use
	// them
	// in the fill methods. This ensures that the actions aren't recreated
	// when fillActionBars is called with FILL_PROXY.
	private IWorkbenchAction exitAction;

	private IWorkbenchAction aboutAction;

	// private IWorkbenchAction helpAction;
	private IWorkbenchAction prefsAction;

	private IWorkbenchAction findAndInstallAction;

	private IWorkbenchAction welcomeAction;

	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}

	protected void makeActions(final IWorkbenchWindow window) {
		// Creates the actions and registers them.
		// Registering is needed to ensure that key bindings work.
		// The corresponding commands keybindings are defined in the plugin.xml
		// file.
		// Registering also provides automatic disposal of the actions when
		// the window is closed.

		exitAction = ActionFactory.QUIT.create(window);
		register(exitAction);

		aboutAction = ActionFactory.ABOUT.create(window);
		register(aboutAction);

		// helpAction = ActionFactory.HELP_CONTENTS.create(window);
		// register(helpAction);

		findAndInstallAction = new InstallUpdateWizardAction(window,
				"&Install new features");
		register(findAndInstallAction);

		welcomeAction = new IntroAction(window);
		welcomeAction.setId(IWorkbenchActionConstants.HELP_START);
		register(welcomeAction);

		prefsAction = new SettingsDialogAction(window, "&Settings");// ActionFactory.PREFERENCES.create(window);
		register(prefsAction);
	}

	protected void fillMenuBar(IMenuManager menuBar) {
		MenuManager fileMenu = new MenuManager("&File",
				IWorkbenchActionConstants.M_FILE);
		MenuManager helpMenu = new MenuManager("&Help");

		menuBar.add(fileMenu);
		// Add a group marker indicating where action set menus will appear.
		IContributionItem syncMenu = new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS);
		menuBar.add(syncMenu);
		
		menuBar.add(helpMenu);

		// File
		fileMenu.add(findAndInstallAction);
		fileMenu.add(new Separator());
		fileMenu.add(exitAction);

		// Help
		// helpMenu.add(welcomeAction);
		// helpMenu.add(helpAction);
		helpMenu.add(welcomeAction);
		helpMenu.add(aboutAction);
		helpMenu.add(new Separator());
		helpMenu.add(prefsAction);
	}

	protected void fillCoolBar(ICoolBarManager coolBar) {
		IToolBarManager toolbar = new ToolBarManager(SWT.FLAT | SWT.RIGHT);
		coolBar.add(new ToolBarContributionItem(toolbar, "main"));
	}

	private List getConfigElems() {
		List confElemList = new ArrayList();
		IExtensionPoint extensionPoint = Platform.getExtensionRegistry()
				.getExtensionPoint("de.mmeggs.macrodeck.lca.sync");
		IExtension[] extensions = extensionPoint.getExtensions();
		// get through all plugins which extend the sync ep.
		for (int i = 0; i < extensions.length; i++) {
			IExtension plugin = extensions[i];
			IConfigurationElement[] confElems = plugin
					.getConfigurationElements();
			for (int j = 0; j < confElems.length; j++) {
				if (confElems[j].getName().equals("syncAction")) {
					confElemList.add(confElems[j]);
				}
			}
		}
		return confElemList;
	}

}
