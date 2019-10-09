package com.example.chattingapp.Model;

public class User  {

    private String Id;
    private String Username;
    private String ImageURL;
    private String Status;
    private String search;

    public User(String id, String username, String imageURL, String status, String search) {
        this.Id = id;
        this.Username = username;
        this.ImageURL = imageURL;
        this.Status = status;
        this.search = search;
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

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        this.Status = status;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
