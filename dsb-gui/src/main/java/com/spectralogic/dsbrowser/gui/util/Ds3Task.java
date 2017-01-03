package com.spectralogic.dsbrowser.gui.util;

import com.spectralogic.ds3client.Ds3Client;
import javafx.concurrent.Task;

public class Ds3Task<T> extends Task<T> {

    private final Ds3Client client;

    public Ds3Task() {
        this(null);
    }

    public Ds3Task(final Ds3Client client) {
        this.client = client;
    }

    @Override
    protected T call() throws Exception {
        throw new IllegalStateException("Implement this method");
    }

    public Ds3Client getClient() {
        return client;
    }
}
