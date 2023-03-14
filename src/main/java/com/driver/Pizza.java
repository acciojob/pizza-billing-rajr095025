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


    public void addExtraCheese(){
        this.bill = Integer.toString(Integer.parseInt(this.bill) + 80);
    }

    public void addExtraToppings(){
        // your code goes here
        if(this.isVeg == true){
            this.bill = Integer.toString(Integer.parseInt(this.bill) + 70);
        }
        else{
            this.bill = Integer.toString(Integer.parseInt(this.bill) + 120);
        }
    }

    public void addTakeaway(){
        // your cod
        this.bill = Integer.toString(Integer.parseInt(this.bill) + 20);

    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
}
