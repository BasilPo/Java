package com.cars;

class Car {
    private static int key;
    private int id;
    private String brand;
    private String model;
    private int manufactureYear;
    private String color;
    private double price;
    private String numberRegistration;

    public Car(String brand, String model, int manufactureYear, String color, double price, String numberRegistration) {
        key++;
        setId(key);
        setBrand(brand);
        setModel(model);
        setManufactureYear(manufactureYear);
        setColor(color);
        setPrice(price);
        setNumberRegistration(numberRegistration);
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = (manufactureYear > 1900 && manufactureYear < 2020) ? manufactureYear : 2000;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = (price > 0.00) ? price : 0.0;
    }

    public String getNumberRegistration() {
        return numberRegistration;
    }

    public void setNumberRegistration(String numberRegistration) {
        this.numberRegistration = numberRegistration;
    }

    @Override
    public String toString() {
        return String.format("Id: %d\nBrand: %s\nModel: %s\nYear: %d\nColor: %s\nPrice: %.2f\nRegistration: %s\n",
                id, brand, model, manufactureYear, color, price, numberRegistration);
    }
}