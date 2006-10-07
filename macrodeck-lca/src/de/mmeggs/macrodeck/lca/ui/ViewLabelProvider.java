/**
 * 
 */
package de.mmeggs.macrodeck.lca.ui;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import de.mmeggs.macrodeck.lca.ui.SyncPluginManager.TreeObject;

class ViewLabelProvider extends LabelProvider {

	public String getText(Object obj) {
		return obj.toString();
	}

	public Image getImage(Object obj) {
		String imageKey = ISharedImages.IMG_OBJ_ELEMENT;
		if (obj instanceof TreeObject
				&& ((TreeObject) obj).getSubNodes().length > 0) {
			imageKey = ISharedImages.IMG_OBJ_FOLDER;
		}
		return PlatformUI.getWorkbench().getSharedImages().getImage(imageKey);
	}
}