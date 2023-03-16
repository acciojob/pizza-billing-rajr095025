package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean alreadyCheese = false;

    private boolean alreadyToppings = false;

    private boolean alreadyBag = false;

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
    	if(alreadyCheese) return;
        this.price += 80;
        alreadyCheese = true;
        //this.bill = Integer.toString(Integer.parseInt(this.bill) + 80);
    }

    public void addExtraToppings(){
        // your code goes here
        if(alreadyToppings) return;
        alreadyToppings = true;
        if(this.isVeg == true){
        	this.price += 70;
            //this.bill = Integer.toString(Integer.parseInt(this.bill) + 70);      
        }
        else{
        	this.price += 120;
            //this.bill = Integer.toString(Integer.parseInt(this.bill) + 120);
        }
    }

    public void addTakeaway(){
        // your cod
        if(alreadyBag) return;
        alreadyBag = true;
        this.price += 20;

        //this.bill = Integer.toString(Integer.parseInt(this.bill) + 20);

    }

    public String getBill(){
        // your code goes here
    	this.bill = Integer.toString(this.price);
        return this.bill + "\n";
    }
}
