/**
 * 
 */
package de.mmeggs.macrodeck.lca.ui;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import de.mmeggs.macrodeck.lca.ui.SyncPluginManager.TreeObject;

class ViewContentProvider implements IStructuredContentProvider,
		ITreeContentProvider {

	
	private SyncPluginManager manager;

	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		this.manager = (SyncPluginManager) newInput;
	}

	public void dispose() {
		manager = null;
	}

	public Object[] getElements(Object parent) {
		return getChildren(((SyncPluginManager)parent).getRoot());
	}

	public Object getParent(Object child) {
		if (child instanceof TreeObject) {
			return ((TreeObject) child).getParent();
		}
		return null;
	}

	public Object[] getChildren(Object parent) {
		if (parent instanceof TreeObject) {
			return ((TreeObject) parent).getSubNodes();
		}
		return new Object[0];
	}

	public boolean hasChildren(Object parent) {
		if (parent instanceof TreeObject)
			return ((TreeObject) parent).getSubNodes().length > 0;
		return false;
	}
	
	
}