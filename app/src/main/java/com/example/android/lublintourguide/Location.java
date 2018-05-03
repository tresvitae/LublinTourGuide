package com.example.android.lublintourguide;

public class Location {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String useObjectName;
    private String useObjectDescription;
    private int useImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create a new Location object.
     *
     * @param objectName        is for name
     * @param objectDescription is for description
     * @param imageResourceID   for  audio file associated with the location
     */

    public Location(String objectName, String objectDescription, int imageResourceID) {

        useObjectName = objectName;
        useObjectDescription = objectDescription;
        useImageResourceId = imageResourceID;
    }

    /**
     * Create a new Location object without @param imageResourceID.
     *
     * @param objectName        is for name
     * @param objectDescription is for description
     */
    public Location(String objectName, String objectDescription) {

        useObjectName = objectName;
        useObjectDescription = objectDescription;
    }

    public int getImageResourceId() {
        return useImageResourceId;
    }

    public String getObjectDescription() {
        return useObjectDescription;
    }

    public String getObjectName() {
        return useObjectName;
    }

    /**
     * Returns whether or not there is an image
     */
    public boolean hasImage() {
        return useImageResourceId != NO_IMAGE_PROVIDED;
    }
}
