package com.zendo.zzz.objects;

/**
 * Created by Sean on 03/05/2016.
 */
public class User {
    public String getImageId() {
        return imageId;
    }

    public String getDescription() {
        return description;
    }

    public String getUserName() {

        return userName;
    }

    public User(String userName, String imageId, String description) {
        this.userName = userName;
        this.imageId = imageId;
        this.description = description;
    }

    private String userName;
    private String imageId;
    private String description;
}
