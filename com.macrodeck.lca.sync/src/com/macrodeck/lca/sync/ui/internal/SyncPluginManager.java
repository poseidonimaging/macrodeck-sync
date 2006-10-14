package com.macrodeck.lca.sync.ui.internal;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.IPreferenceNode;
import org.eclipse.jface.preference.IPreferencePage;
import org.eclipse.jface.preference.PreferenceNode;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.eclipse.ui.internal.registry.IWorkbenchRegistryConstants;

import com.macrodeck.lca.sync.SyncPlugin;
import com.macrodeck.lca.sync.ui.settings.EmptyPreferencePage;



public class SyncPluginManager {

	private static SyncPluginManager instance;

	private TreeObject root;

	private Map categories = new HashMap();

	class TreeObject extends PreferenceNode {

		private IPreferenceNode parent;

		private final IConfigurationElement settingsPageClassElement;

		/**
		 * constructor
		 * 
		 * @param id
		 * @param name
		 * @param settingsPageClass
		 */
		public TreeObject(String id, String name,
				IConfigurationElement settingsPageClassElement) {
			super(id, name, null, "");
			this.settingsPageClassElement = settingsPageClassElement;
		}

		/**
		 * root tree object
		 */
		public TreeObject() {
			super("");
			settingsPageClassElement = null;
		}

		public void setParent(IPreferenceNode parent) {
			this.parent = parent;
		}

		public IPreferenceNode getParent() {
			return parent;
		}

		public void createPage() {
			IPreferencePage page = null;
			try {
				page = (IPreferencePage) WorkbenchPlugin.createExtension(
						settingsPageClassElement,
						IWorkbenchRegistryConstants.ATT_CLASS);
			} catch (CoreException e) {
				// Just inform the user about the error. The details are
				// written to the log by now.
				/*ErrorDialog.openError((Shell) null,
						WorkbenchMessages.PreferenceNode_errorTitle,
						WorkbenchMessages.PreferenceNode_errorMessage, e
								.getStatus());*/
				page = new EmptyPreferencePage();
			}

			// page.init(PlatformUI.getWorkbench());
			if (getLabelImage() != null) {
				page.setImageDescriptor(getImageDescriptor());
			}
			page.setTitle(getLabelText());
			setPage(page);
		}

		public String toString() {
			return getLabelText();
		}

	}

	/**
	 * create model for navigation view from existing plugins
	 * 
	 * @return
	 */
	private TreeObject createModel() {
		// colecting all macrodeck lca plugins
		root = new TreeObject();
		IExtensionPoint extensionPoint = Platform.getExtensionRegistry()
				.getExtensionPoint(SyncPlugin.EXT_POINT_SYNC);
		IExtension[] extensions = extensionPoint.getExtensions();
		// get through all plugins which extend the sync ep.
		for (int i = 0; i < extensions.length; i++) {
			IExtension plugin = extensions[i];
			IConfigurationElement[] confElems = plugin
					.getConfigurationElements();
			// get through all categories
			TreeObject category = null;
			IConfigurationElement settingsPageClass = null;
			String pluginLabel = getPluginLabel(plugin);
			String pluginId = plugin.getNamespaceIdentifier();

			for (int j = 0; j < confElems.length; j++) {
				if (confElems[j].getName().equals("category")) {
					String catId = confElems[j].getAttribute("id");
					if (!categories.containsKey(catId)) {
						String catName = confElems[j].getAttribute("label");
						category = new TreeObject(pluginId, catName,
								confElems[j]);
						categories.put(catId, category);
						root.add(category);
					} else {
						category = (TreeObject) categories.get(catId);
					}
				} else if (confElems[j].getName().equals("settingsPage")) {
					settingsPageClass = confElems[j];// .getAttribute("class");

				}
			}
			if (settingsPageClass != null && category != null) {
				TreeObject to = new TreeObject(pluginId, pluginLabel,
						settingsPageClass);
				category.add(to);
			} else {
				System.err.println("Error creating settingsPage for plugin: "
						+ pluginId);
			}
		}
		return root;
	}

	private String getPluginLabel(IExtension plugin) {
		String pluginLabel = plugin.getLabel();
		if (pluginLabel.equals("")) {
			pluginLabel = plugin.getNamespaceIdentifier().substring(
					plugin.getNamespaceIdentifier().lastIndexOf('.') + 1);
		}
		return pluginLabel;
	}

	public static SyncPluginManager getInstance() {
		if (instance == null) {
			instance = new SyncPluginManager();
		}
		instance.createModel();
		return instance;
	}

	public TreeObject getRoot() {
		return root;
	}
}
