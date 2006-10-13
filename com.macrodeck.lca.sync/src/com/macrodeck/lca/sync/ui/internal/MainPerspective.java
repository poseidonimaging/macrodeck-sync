package com.macrodeck.lca.sync.ui.internal;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import com.macrodeck.lca.sync.LCActivator;

public class MainPerspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);
		
		layout.addStandaloneView(MainView.ID,  false, IPageLayout.LEFT, 1f, editorArea);
		layout.addFastView(LCActivator.PLUGIN_ID+".standby");
		/*IFolderLayout folder = layout.createFolder("plugins", IPageLayout.TOP, 0.5f, editorArea);
		folder.addPlaceholder(View.ID + ":*");
		folder.addView(View.ID);
		*/
		layout.getViewLayout(MainView.ID).setCloseable(false);
	}
}
