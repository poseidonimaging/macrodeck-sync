    package com.macrodeck.lca.sync.ui.internal;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Tray;
import org.eclipse.swt.widgets.TrayItem;
import org.eclipse.ui.IWindowListener;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

import com.macrodeck.lca.sync.SyncPlugin;
import com.macrodeck.lca.sync.actions.SyncAllAction;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

    private ApplicationActionBarAdvisor actionAdvisor;
    private Tray tray;

    public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        super(configurer);
    }

    public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
        actionAdvisor = new ApplicationActionBarAdvisor(configurer);
        return actionAdvisor;
    }
    
    public void preWindowOpen() {
        IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
        configurer.setShowProgressIndicator(true);
        configurer.setInitialSize(new Point(900, 600));
        configurer.setShowCoolBar(false);
        configurer.setShowStatusLine(true);
    }
    
    public void postWindowOpen() {
        createTray(getWindowConfigurer().getWindow());
    }
    
    public void dispose() {
        this.tray.dispose();
        super.dispose();
    }
    
    
    
    
    private Tray createTray(final IWorkbenchWindow window) {
        Display display = Display.getDefault();
        tray = display.getSystemTray();
        if(tray != null) {
            TrayItem item = new TrayItem(tray, SWT.NONE);
            Image image = SyncPlugin.getImageDescriptor("/icons/m-16x16.gif").createImage();
            item.setImage(image);
            final Menu menu = new Menu(window.getShell(), SWT.POP_UP);
            MenuItem menuItem = new MenuItem(menu, SWT.PUSH);
            menuItem.setText("&Synchronize");
            menuItem.addSelectionListener(new SelectionAdapter(){
                public void widgetSelected(SelectionEvent e) {
                    new SyncAllAction().run(null);
                }
            });
            menuItem = new MenuItem(menu, SWT.PUSH);
            menuItem.setText("Settings");
            menuItem.addSelectionListener(new SelectionAdapter(){
                public void widgetSelected(SelectionEvent e) {
                    actionAdvisor.getPrefsAction().run();
                }
            });
            menuItem = new MenuItem(menu, SWT.PUSH);
            menuItem.setText("&Workbench");
            menuItem.addSelectionListener(new SelectionAdapter(){
                public void widgetSelected(SelectionEvent e) {
                    window.getShell().setVisible(true);
                    window.getShell().setActive();
                }
            });
            
            menuItem = new MenuItem(menu, SWT.PUSH);
            menuItem.setText("&Exit");
            menuItem.addSelectionListener(new SelectionAdapter(){
                public void widgetSelected(SelectionEvent e) {
                    actionAdvisor.getExitAction().run();
                }
            });
            item.setToolTipText(window.getShell().getText());
            item.addListener (SWT.MenuDetect, new Listener () {
                public void handleEvent (Event event) {
                    menu.setVisible (true);
                }
            });
        }
        return tray;
    }

}
