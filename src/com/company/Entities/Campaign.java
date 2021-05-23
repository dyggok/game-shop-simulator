package com.company.Entities;

public class Campaign {
    private int Id;
    private String name;
    private double amountOfCampaign;

    public Campaign(){

    }

    public Campaign(int id, String name, double amountOfCampaign) {
        Id = id;
        this.name = name;
        this.amountOfCampaign = amountOfCampaign;
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

    public double getAmountOfCampaign() {
        return amountOfCampaign/100;
    }

    public void setAmountOfCampaign(double amountOfCampaign) {
        this.amountOfCampaign = amountOfCampaign;
    }
}
