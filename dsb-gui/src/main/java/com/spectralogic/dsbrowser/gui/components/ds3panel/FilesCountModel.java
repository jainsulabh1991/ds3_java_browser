package com.spectralogic.dsbrowser.gui.components.ds3panel;

/**
 * Created by linchpinub4 on 23/1/17.
 */
public class FilesCountModel {

    private int noOfFolders = 0;
    private int noOfFiles = 0;
    private long totalCapacity = 0;

    public int getNoOfFolders() {
        return noOfFolders;
    }

    public void setNoOfFolders(int noOfFolders) {
        this.noOfFolders = noOfFolders;
    }

    public int getNoOfFiles() {
        return noOfFiles;
    }

    public void setNoOfFiles(int noOfFiles) {
        this.noOfFiles = noOfFiles;
    }

    public long getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(long totalCapacity) {
        this.totalCapacity = totalCapacity;
    }
}
