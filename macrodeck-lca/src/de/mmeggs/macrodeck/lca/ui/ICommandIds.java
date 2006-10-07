package de.mmeggs.macrodeck.lca.ui;

/**
 * Interface defining the application's command IDs.
 * Key bindings can be defined for specific commands.
 * To associate an action with a command, use IAction.setActionDefinitionId(commandId).
 *
 * @see org.eclipse.jface.action.IAction#setActionDefinitionId(String)
 */
public interface ICommandIds {

	public static final String INSTALL_UPDATE = "de.mmeggs.macrodeck.lca.sync.installUpdate";
	public static final String SETTINGS = "de.mmeggs.macrodeck.lca.sync.settings";
    
}
