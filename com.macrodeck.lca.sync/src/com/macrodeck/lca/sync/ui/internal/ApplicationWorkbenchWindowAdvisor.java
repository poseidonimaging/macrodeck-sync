package com.macrodeck.lca.sync.ui.internal;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.ShellEvent;
import org.eclipse.swt.events.ShellListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Tray;
import org.eclipse.swt.widgets.TrayItem;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWindowListener;
import org.eclipse.ui.IWorkbench;
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
        final IWorkbench workbench = getWindowConfigurer().getWindow().getWorkbench();
        if (tray == null)
            createTray(getWindowConfigurer().getWindow());
        getWindowConfigurer().getWindow().getShell().addShellListener(new ShellListener(){
            public void shellActivated(ShellEvent e) {
            }
            public void shellClosed(ShellEvent e) {
            }
            public void shellDeactivated(ShellEvent e) {
            }
            public void shellDeiconified(ShellEvent e) {
            }
            public void shellIconified(ShellEvent e) {
               workbench.getActiveWorkbenchWindow().getShell().setVisible(false);
            }
        });
    }

    public void dispose() {
        if (tray != null) {
            this.tray.dispose();
        }
        super.dispose();
    }

    private Tray createTray(final IWorkbenchWindow window) {
        Display display = Display.getDefault();
        tray = display.getSystemTray();
        if (tray != null) {
            TrayItem item = new TrayItem(tray, SWT.NONE);
            Image image = SyncPlugin.getImageDescriptor("/icons/m-16x16.gif").createImage();
            item.setImage(image);
            final Menu menu = new Menu(window.getShell(), SWT.POP_UP);
            MenuItem menuItem = new MenuItem(menu, SWT.PUSH);
            menuItem.setText("&Synchronize All");
            menuItem.setImage(SyncPlugin.getImageDescriptor("icons/16x16/sync.gif").createImage());
            menuItem.addSelectionListener(new SelectionAdapter() {
                public void widgetSelected(SelectionEvent e) {
                    //deiconifyWindow();
                    SyncAllAction sa = new SyncAllAction();
                    sa.init(window);
                    sa.run(null);
                }
            });
            menuItem = new MenuItem(menu, SWT.PUSH);
            menuItem.setText("Settings");
            menuItem.setImage(SyncPlugin.getImageDescriptor("icons/16x16/settings.png").createImage());
            menuItem.addSelectionListener(new SelectionAdapter() {
                public void widgetSelected(SelectionEvent e) {
                    actionAdvisor.getPrefsAction().run();
                }
            });
            menuItem = new MenuItem(menu, SWT.PUSH);
            menuItem.setText("Install/&Update");
            menuItem.setImage(SyncPlugin.getImageDescriptor("icons/16x16/update-manager.png").createImage());
            menuItem.addSelectionListener(new SelectionAdapter() {
                public void widgetSelected(SelectionEvent e) {
                    actionAdvisor.getFindAndInstallAction().run();
                }
            });
            menuItem = new MenuItem(menu, SWT.PUSH);
            menuItem.setText("&Workbench");
            //menuItem.setImage(SyncPlugin.getImageDescriptor("icons/m-16x16.png").createImage());
            menuItem.addSelectionListener(new SelectionAdapter() {
                public void widgetSelected(SelectionEvent e) {
                    deiconifyWindow();
                }
            });

            menuItem = new MenuItem(menu, SWT.PUSH);
            menuItem.setText("&Exit");
            menuItem.addSelectionListener(new SelectionAdapter() {
                public void widgetSelected(SelectionEvent e) {
                    actionAdvisor.getExitAction().run();
                }
            });
            item.setToolTipText(window.getShell().getText());
            item.addSelectionListener(new SelectionListener() {
                public void widgetDefaultSelected(SelectionEvent e) {
                    deiconifyWindow();
                }
                public void widgetSelected(SelectionEvent e) {
                }
            });

            item.addListener(SWT.MenuDetect, new Listener() {
                public void handleEvent(Event event) {
                    menu.setVisible(true);
                }
            });
        }
        return tray;
    }

    protected void deiconifyWindow() {
        getWindowConfigurer().getWindow().getShell().setVisible(true);
        getWindowConfigurer().getWindow().getShell().setMinimized(false);
    }

}
