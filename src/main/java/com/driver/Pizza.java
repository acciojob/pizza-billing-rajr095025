package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private final int vegBasePrice = 300;

    private final int nonVegBasePrice = 400;

    private final int cheesePrice = 80;

    private final int vegToppingsPrice = 70;

    private final int nonVegToppingsPrice = 120;

    private final int bagPrice = 20;

    private boolean cheeseAdded;

    private boolean toppingsAdded;

    private boolean bagAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg == true){
            this.price = vegBasePrice;
        }
        else{
            this.price = nonVegBasePrice;
        }
        cheeseAdded = false;
        toppingsAdded = false;
        bagAdded = false;

        this.bill = "Base Price Of The Pizza: " + this.price+ "\n";

    }

    public int getPrice() {
        return this.price;
    }


    public void addExtraCheese(){
    	if(cheeseAdded) return;
        this.price += cheesePrice;
        cheeseAdded = true;
        //this.bill = Integer.toString(Integer.parseInt(this.bill) + 80);
    }

    public void addExtraToppings(){
        // your code goes here
        if(toppingsAdded) return;
        toppingsAdded = true;

        if(this.isVeg == true){
        	this.price += vegToppingsPrice;
        }
        else{
        	this.price += nonVegToppingsPrice;
        }
    }

    public void addTakeaway(){
        if(bagAdded) return;
        bagAdded = true;
        this.price += bagPrice;
    }

    public String getBill(){
        if(cheeseAdded == true){
            this.bill += "Extra Cheese Added: " + cheesePrice + "\n";
        }
        if(toppingsAdded == true){
            if(isVeg == true){
                this.bill += "Extra Toppings Added: " + vegToppingsPrice + "\n";
            }
            else{
                this.bill += "Extra Toppings Added: " + nonVegToppingsPrice + "\n";
            }
        }

        if(bagAdded == true){
            this.bill += "Paperbag Added: " + bagPrice + "\n";
        }

        this.bill += "Total Price: " + price + "\n";
        return this.bill;
    }
}
