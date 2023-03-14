package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg == true){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
        this.bill = Integer.toString(this.price);
        // your code goes here
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void addExtraCheese(){
        price += 80;
        this.bill = Integer.toString(price);
    }

    public void addExtraToppings(){
        // your code goes here
        if(this.isVeg == true){
            price += 70;
            this.bill = Integer.toString(price);
        }
        else{
            price += 120;
            this.bill = Integer.toString(price);
        }
    }

    public void addTakeaway(){
        // your cod
        price += 20;
        this.bill = Integer.toString(price);

    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
}
