package com.example.chattingapp.Model;

public class User  {

    private String Id;
    private String Username;
    private String ImageURL;

    public User(String id, String username, String imageURL) {
        this.Id = id;
        this.Username = username;
        this.ImageURL = imageURL;
    }

    public User() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        this.Username = username;
    }

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String imageURL) {
        this.ImageURL = imageURL;
    }
}
