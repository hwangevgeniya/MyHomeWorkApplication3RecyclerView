package com.geektech.myhomeworkapplication3recyclerview;

public class Country {

    private String country;
    private String capital;
    private int image;

    public Country(String country, String capital, int image) {
        this.country = country;
        this.capital = capital;
        this.image = image;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
