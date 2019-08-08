package com.example.travelmantics2v;

import java.io.Serializable;

public class TravelDeal implements Serializable{
    private String id;
    private String title;
    private String description;
    private String price;
    private String imageurl;

    public TravelDeal() {}

    public TravelDeal(String title, String description, String price, String imageurl) {
        this.setId(id);
        this.setTitle(title);
        this.setDescription(description);
        this.price = price;
        this.setImageurl(imageurl);
    }

    public static void setImageName(String imageName) {
    }

    public static void setimageUrl(String url) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price ;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
}
