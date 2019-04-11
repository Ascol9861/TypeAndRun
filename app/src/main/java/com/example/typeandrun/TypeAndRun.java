package com.example.typeandrun;

public class TypeAndRun {
    private String make,color;

    private double price, engine;
    private int year;


    public String getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String runCmd(){
        return "This is Vehicle no 1 \n"+" Manufracturer "+this.getMake()+"\n Current Value "+this.getPrice()+"\n" +
                " Color "+this.getColor()+"\n Engine Size "+this.getEngine()+"\n";
    }

}
