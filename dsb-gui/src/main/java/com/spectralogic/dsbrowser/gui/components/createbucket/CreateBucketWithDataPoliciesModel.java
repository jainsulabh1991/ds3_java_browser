package com.spectralogic.dsbrowser.gui.components.createbucket;

import com.google.common.collect.ImmutableList;
import com.spectralogic.dsbrowser.gui.services.Workers;
import com.spectralogic.dsbrowser.gui.services.sessionStore.Session;

public class CreateBucketWithDataPoliciesModel {

    private final ImmutableList<CreateBucketModel> dataPolicies;
    private final Session session;
    private final Workers workers;

    public CreateBucketWithDataPoliciesModel() {
        this(null, null, null);
    }

    public CreateBucketWithDataPoliciesModel(final ImmutableList<CreateBucketModel> dataPolicies, final Session session, final Workers workers) {
        this.dataPolicies = dataPolicies;
        this.session = session;
        this.workers = workers;
    }

    public Session getSession() {
        return session;
    }

    public Workers getWorkers() {
        return workers;
    }

    public ImmutableList<CreateBucketModel> getDataPolicies() {
        return dataPolicies;
    }
}
