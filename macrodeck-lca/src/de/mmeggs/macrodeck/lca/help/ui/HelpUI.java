/*
 * HelpUI.java 27.09.2006
 * 
 * Copyright (c) 2006 Manfred Mayer. All rights reserved.
 */
package de.mmeggs.macrodeck.lca.help.ui;

import org.eclipse.help.IContext;
import org.eclipse.ui.help.AbstractHelpUI;

public class HelpUI extends AbstractHelpUI {

    public void displayContext(IContext context, int x, int y) {
        // TODO m: Auto-generated method stub

    }

    public void displayHelp() {
        this.displaySearch();
    }

    public void displayHelpResource(String href) {
        // TODO m: Auto-generated method stub

    }

    public boolean isContextHelpDisplayed() {
        // TODO m: Auto-generated method stub
        return false;
    }

}
