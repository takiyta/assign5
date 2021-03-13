package com.company.entities;

public class precious {
    private String name;
    private int price;
    private int carat;

    public precious(){

    }
    public precious(String name,int price,int carat){
        this.carat=carat;
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCarat() {
        return carat;
    }

    public void setCarat(int carat) {
        this.carat = carat;
    }

    @Override
    public String toString() {
        return "precious stone "  + name + "price " + price + " " + "carat " + carat + '\n'
                ;

    }
}
