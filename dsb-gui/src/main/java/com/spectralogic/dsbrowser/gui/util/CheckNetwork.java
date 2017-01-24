package com.spectralogic.dsbrowser.gui.util;

import com.spectralogic.ds3client.Ds3Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class CheckNetwork {
    private static final Logger LOG = LoggerFactory.getLogger(CheckNetwork.class);
    public static boolean isReachable(final Ds3Client client) {
        try {
            final URL url = new URL("http://" + client.getConnectionDetails().getEndpoint());
            final URLConnection conn = url.openConnection();
            conn.connect();
            return true;
        } catch (final MalformedURLException e) {
            LOG.error(e.toString());
            e.printStackTrace();
            return false;
        } catch (final IOException e) {
            LOG.error(e.toString());
            e.printStackTrace();
            return false;
        }
    }
}
