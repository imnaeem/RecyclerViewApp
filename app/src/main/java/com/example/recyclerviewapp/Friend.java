package com.example.recyclerviewapp;

public class Friend {
    private String Name;
    private String City;
    private int dob;
    private int Image;

    public Friend(String name, String city, int dob, int image) {
        Name = name;
        City = city;
        this.dob = dob;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
