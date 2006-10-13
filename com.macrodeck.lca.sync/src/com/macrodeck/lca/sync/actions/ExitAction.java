/*
 * ExitAction.java 13.10.2006
 * 
 * Copyright (c) 2006 Manfred Mayer. All rights reserved.
 */
package com.macrodeck.lca.sync.actions;

import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.internal.QuitAction;

import com.macrodeck.lca.sync.LCActivator;

public class ExitAction extends QuitAction {

    public ExitAction(IWorkbenchWindow window) {
        super(window);
        setId("quit");
   }

    public void run() {
        LCActivator.getDefault().setExitState(true);
        super.run();
    }
}
