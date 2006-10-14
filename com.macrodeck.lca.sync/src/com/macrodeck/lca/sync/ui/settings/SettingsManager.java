package com.macrodeck.lca.sync.ui.settings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.jface.preference.IPreferenceNode;
import org.eclipse.jface.preference.PreferenceManager;

public class SettingsManager extends PreferenceManager {

	private final PreferenceManager preferenceManager;

	public SettingsManager(PreferenceManager preferenceManager) {
		this.preferenceManager = preferenceManager;
        Set notDisplayedPrefPages = new HashSet();
        notDisplayedPrefPages.add("org.eclipse.update.internal.ui.preferences.MainPreferencePage");
        notDisplayedPrefPages.add("org.eclipse.ui.preferencePages.Workbench");
		
		IPreferenceNode[] nodes  = preferenceManager.getRootSubNodes();
		for (int i = 0; i < nodes.length; i++) {
			if (!notDisplayedPrefPages.contains(nodes[i].getId())){
				getRoot().add(nodes[i]);	
			}
		} 
		
	}

	public boolean addTo(String path, IPreferenceNode node) {
		return preferenceManager.addTo(path, node);
	}

	public void addToRoot(IPreferenceNode node) {
		preferenceManager.addToRoot(node);
	}

	public boolean equals(Object obj) {
		return (this == obj);
	}

	public IPreferenceNode find(String path) {
		return preferenceManager.find(path);
	}

	public List getElements(int order) {
		return preferenceManager.getElements(order);
	}

	public int hashCode() {
		return preferenceManager.hashCode();
	}

	public boolean remove(IPreferenceNode node) {
		return preferenceManager.remove(node);
	}

	public IPreferenceNode remove(String path) {
		return preferenceManager.remove(path);
	}

	public void removeAll() {
		preferenceManager.removeAll();
	}
}
