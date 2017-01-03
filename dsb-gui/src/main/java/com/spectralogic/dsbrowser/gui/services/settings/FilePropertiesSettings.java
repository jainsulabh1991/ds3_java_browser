package com.spectralogic.dsbrowser.gui.services.settings;
import com.fasterxml.jackson.annotation.JsonProperty;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

/**
 * Created by Suman on 11/5/2016.
 */
public class FilePropertiesSettings {

    public static final FilePropertiesSettings DEFAULT = createDefault();

    private static FilePropertiesSettings createDefault() {
        return new FilePropertiesSettings(Boolean.TRUE);
    }

    @JsonProperty("filePropertiesEnable")
    private final BooleanProperty filePropertiesEnable = new SimpleBooleanProperty();

    public FilePropertiesSettings(final boolean filePropertiesEnable) {
        this.filePropertiesEnable.set(filePropertiesEnable);
    }

    public FilePropertiesSettings() {
        // pass
    }

    public FilePropertiesSettings copy() {
        final FilePropertiesSettings settings = new FilePropertiesSettings();
        settings.setFilePropertiesEnable(this.getFilePropertiesEnable());
        return settings;
    }

    public Boolean getFilePropertiesEnable() {
        return filePropertiesEnable.get();
    }

    public BooleanProperty filePropertiesEnableProperty() {
        return filePropertiesEnable;
    }

    public void setFilePropertiesEnable(final boolean filePropertiesEnable) {
        this.filePropertiesEnable.set(filePropertiesEnable);
    }

    public void overwrite(final boolean settings) {
        this.setFilePropertiesEnable(settings);
    }

}
