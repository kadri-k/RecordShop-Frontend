package com.northcoders.recordshop.model;

public class Album {
    private long id;
    private String title;
    private String artist;
    private String genre;
    private int stock;
    double price;

    public Album(long id, double price, String title, String artist, String genre, int stock) {
        this.id = id;
        this.price = price;
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.stock = stock;
    }
    public Album() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}



