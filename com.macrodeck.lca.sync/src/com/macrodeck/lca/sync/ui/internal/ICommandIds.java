package com.macrodeck.lca.sync.ui.internal;

import com.macrodeck.lca.sync.SyncPlugin;

/**
 * Interface defining the application's command IDs.
 * Key bindings can be defined for specific commands.
 * To associate an action with a command, use IAction.setActionDefinitionId(commandId).
 *
 * @see org.eclipse.jface.action.IAction#setActionDefinitionId(String)
 */
public interface ICommandIds {

	public static final String INSTALL_UPDATE = SyncPlugin.PLUGIN_ID+".installUpdate";
	public static final String SETTINGS = SyncPlugin.PLUGIN_ID+".settings";
    
}
