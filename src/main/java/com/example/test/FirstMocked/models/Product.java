package com.example.test.FirstMocked.models;

public class Product {
    private int id;
    private String name;
    private String description;
    private int price;
    private boolean status;
    private int amount;
    private int manufacturer_id;

    public Product(int id, int manufacturer_id, int amount, boolean status, int price, String description, String name) {
        this.id = id;
        this.manufacturer_id = manufacturer_id;
        this.amount = amount;
        this.status = status;
        this.price = price;
        this.description = description;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public boolean isStatus() {
        return status;
    }

    public int getAmount() {
        return amount;
    }

    public int getManufacturer_id() {
        return manufacturer_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setManufacturer_id(int manufacturer_id) {
        this.manufacturer_id = manufacturer_id;
    }
}
