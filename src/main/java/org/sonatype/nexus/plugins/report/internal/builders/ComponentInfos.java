package org.sonatype.nexus.plugins.report.internal.builders;

import java.util.ArrayList;
import java.util.List;

/**
 * Represent the informations extracted on a component
 * 
 * @author Mathieu Delrocq
 *
 */
public class ComponentInfos {

    private String group;
    private String name;
    private String version;
    private String format;
    private Long size;
    private Double sizeMB;
    private Double sizeGB;
    private String createdBy;
    private String lastUpdated;
    private String lastDownloaded;
    private String encoded;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Double getSizeMB() {
        return sizeMB;
    }

    public void setSizeMB(Double sizeMB) {
        this.sizeMB = sizeMB;
    }

    public Double getSizeGB() {
        return sizeGB;
    }

    public void setSizeGB(Double sizeGB) {
        this.sizeGB = sizeGB;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getLastDownloaded() {
        return lastDownloaded;
    }

    public void setLastDownloaded(String lastDownloaded) {
        this.lastDownloaded = lastDownloaded;
    }

    public String getEncoded() {
        return encoded;
    }

    public void setEncoded(String encoded) {
        this.encoded = encoded;
    }

    /**
     * Used for the header of the report.
     * @return the name of the ComponentInfos properties as titles;
     */
    protected static List<String> getComponentInfosTitles() {
        List<String> componentInfosTitles = new ArrayList<>();
        componentInfosTitles.add("Group");
        componentInfosTitles.add("Name");
        componentInfosTitles.add("Version");
        componentInfosTitles.add("Format");
        componentInfosTitles.add("Size (Bytes)");
        componentInfosTitles.add("Size (MB)");
        componentInfosTitles.add("Size (GB)");
        componentInfosTitles.add("Created by");
        componentInfosTitles.add("Last updated");
        componentInfosTitles.add("Last downloaded");
        componentInfosTitles.add("repCompId");
        return componentInfosTitles;
    }
}
