package com.company.Entities;

public class Game {
    private int Id;
    private String name;
    private String category;
    private double price;

    public Game(){

    }

    public Game(int id, String name, String category, double price) {
        Id = id;
        this.name = name;
        this.category = category;
        this.price = price;

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
