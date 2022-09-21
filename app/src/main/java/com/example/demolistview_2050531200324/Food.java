package com.example.demolistview_2050531200324;

public class Food {

    private String name;
    private String information;
    private String price;
    private int images;
    private String add;
    private String remove;

    public Food() {
    }

    public Food(String name, String information, String price, int images, String add, String remove) {
        this.name = name;
        this.information = information;
        this.price = price;
        this.images = images;
        this.add = add;
        this.remove = remove;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getRemove() {
        return remove;
    }

    public void setRemove(String remove) {
        this.remove = remove;
    }
}
