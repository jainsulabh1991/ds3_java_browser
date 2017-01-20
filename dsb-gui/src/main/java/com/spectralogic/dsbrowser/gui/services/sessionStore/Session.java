package com.spectralogic.dsbrowser.gui.services.sessionStore;

import com.spectralogic.ds3client.Ds3Client;

import java.io.Closeable;
import java.io.IOException;

public class Session implements Closeable {
    private final Ds3Client client;
    private final String sessionName;
    private final String endpoint;
    private final String portNo;
    private final String proxyServer;
    private final Boolean defaultSession;
    // Needed for injection
    public Session() {
        this(null, null, null, null, null,false);
    }

    public Session(final String sessionName, final String endpoint, final String portNo, final String proxyServer, final Ds3Client client,final Boolean dafaultSession) {
        this.sessionName = sessionName;
        this.endpoint = endpoint;
        this.portNo = portNo;
        this.proxyServer = proxyServer;
        this.client = client;
        this.defaultSession =  dafaultSession;
    }

    public Ds3Client getClient() {
        return client;
    }

    @Override
    public void close() throws IOException {
        client.close();
    }

    public String getSessionName() {
        return sessionName;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public String getPortNo() {
        return portNo;
    }

    public String getProxyServer() {
        return proxyServer;
    }


    public Boolean getDefaultSession() {
        return defaultSession;
    }
}
