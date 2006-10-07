package de.mmeggs.macrodeck.lca.ui;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);
		
		layout.addStandaloneView(MainView.ID,  false, IPageLayout.LEFT, 1f, editorArea);
		layout.addFastView("de.mmeggs.macrodeck.lca.standby");
		/*IFolderLayout folder = layout.createFolder("plugins", IPageLayout.TOP, 0.5f, editorArea);
		folder.addPlaceholder(View.ID + ":*");
		folder.addView(View.ID);
		*/
		layout.getViewLayout(MainView.ID).setCloseable(false);
	}
}
