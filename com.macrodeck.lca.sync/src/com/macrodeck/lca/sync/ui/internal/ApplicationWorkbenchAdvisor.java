package com.macrodeck.lca.sync.ui.internal;

import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

import com.macrodeck.lca.sync.SyncPlugin;

/**
 * This workbench advisor creates the window advisor, and specifies
 * the perspective id for the initial window.
 */
public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {
	
	private static final String PERSPECTIVE_ID = SyncPlugin.PLUGIN_ID+".perspective";

    public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        return new ApplicationWorkbenchWindowAdvisor(configurer);
    }

	public String getInitialWindowPerspectiveId() {
		return PERSPECTIVE_ID;
	} 
    
    public boolean preShutdown() {
        getWorkbenchConfigurer().getWorkbench().getActiveWorkbenchWindow().getShell().setVisible(false);
        return SyncPlugin.getDefault().isExitPreformed();
    }
}
