package com.spectralogic.dsbrowser.gui.components.ds3panel.ds3treetable;

import com.airhacks.afterburner.views.FXMLView;
import com.spectralogic.dsbrowser.gui.DeepStorageBrowserPresenter;
import com.spectralogic.dsbrowser.gui.components.ds3panel.Ds3Common;
import com.spectralogic.dsbrowser.gui.components.ds3panel.Ds3PanelPresenter;
import com.spectralogic.dsbrowser.gui.services.sessionStore.Session;

public class Ds3TreeTableView extends FXMLView {
    public Ds3TreeTableView(final Session session, final DeepStorageBrowserPresenter deepStorageBrowserPresenter, final Ds3PanelPresenter ds3PanelPresenter, final Ds3Common ds3Common) {
        super(name -> {
            switch (name) {
                case "session":
                    return session;
                case "deepStorageBrowserPresenter":
                    return deepStorageBrowserPresenter;
                case "ds3PanelPresenter":
                    return ds3PanelPresenter;
                case "ds3Common":
                    return ds3Common;
                default:
                    return null;
            }
        });
    }
}
