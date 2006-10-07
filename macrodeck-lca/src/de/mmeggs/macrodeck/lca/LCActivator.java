package de.mmeggs.macrodeck.lca;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.PreferenceManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.mmeggs.macrodeck.lca.ui.settings.SettingsManager;

/**
 * The activator class controls the plug-in life cycle
 */
public class LCActivator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.mmeggs.macrodeck.lca";

	// The shared instance
	private static LCActivator plugin;

	private static PreferenceManager prefsManager;

	/**
	 * The constructor
	 */
	public LCActivator() {
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static LCActivator getDefault() {
		if (prefsManager == null) {
			prefsManager = new SettingsManager(PlatformUI.getWorkbench()
					.getPreferenceManager());
		}
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in
	 * relative path
	 * 
	 * @param path
	 *            the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	public PreferenceManager getPreferenceManager() {
		return prefsManager;
	}

	/**
	 * get filtered plugin config elements
	 * 
	 * @param tag filter
	 * @return
	 */
	public List getAllPluginConfigs(String tagName) {
		List allPluginConfigs = new ArrayList();
		IExtensionPoint extensionPoint = Platform.getExtensionRegistry()
				.getExtensionPoint("de.mmeggs.macrodeck.lca.sync");
		IExtension[] extensions = extensionPoint.getExtensions();
		// get through all plugins which extend the sync ep.
		for (int i = 0; i < extensions.length; i++) {
			IExtension plugin = extensions[i];
			IConfigurationElement[] confElems = plugin
					.getConfigurationElements();
			for (int j = 0; j < confElems.length; j++) {
				if (tagName.equals(confElems[j].getName())) {
					allPluginConfigs.add(confElems[j]);
				}
			}
		}
		return allPluginConfigs;
	}
}
