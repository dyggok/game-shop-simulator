package com.company.Entities;

public class Sale {
    private int id;
    private Customer customer;
    private Game game;
    private double amount;

    public Sale(){

    }
    public Sale(int id, Customer customer, Game game) {
        this.id = id;
        this.customer = customer;
        this.game = game;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


}
