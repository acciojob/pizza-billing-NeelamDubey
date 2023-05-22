package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean exCheese = false;
    private boolean exToppingVeg = false;
    private boolean exToppingNonVeg = false;
    private boolean bagData = false;
    final int vegPizza = 300;
    final int nonVegPizza = 400;
    final int extraCheesePrice = 80;
    final int exToppingsPriceVeg = 70;
    final int exToppingsPriceNonVeg = 120;
    final int bag = 20;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if (isVeg) {
            this.price = 300;
        } else {
            this.price = 400;

        }
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!exCheese) {
            this.price = this.price + extraCheesePrice;
            exCheese = true;

        }
    }

    public void addExtraToppings() {
        // your code goes here
        if (!exToppingVeg && isVeg) {
            this.price = this.price + exToppingsPriceVeg;
            exToppingVeg = true;
            exCheese = true;

        } else if (!exToppingNonVeg && !isVeg) {
            this.price = this.price + exToppingsPriceNonVeg;
            exToppingNonVeg = true;
            exCheese = true;

        }
    }

    public void addTakeaway(){
        // your code goes here
            if (!bagData) {
                bagData = true;
                this.price = this.price + bag;
            }
    }

    public String getBill(){
        // your code goes here
            if (isVeg) {
                this.bill = "Base Price Of The Pizza: " + vegPizza + "\n";
            } else {
                this.bill = "Base Price Of The Pizza: " + nonVegPizza + "\n";

            }

            if (exCheese) {
                this.bill = this.bill + "Extra Cheese Added: " + extraCheesePrice + "\n";
            }

            if (isVeg && exToppingVeg) {
                this.bill = this.bill + "Extra Toppings Added: " + exToppingVeg + "\n";
            } else if (!isVeg && exToppingNonVeg) {
                this.bill = this.bill + "Extra Toppings Added: " + exToppingsPriceNonVeg + "\n";

            }

            if (bagData) {
                this.bill = this.bill + "Paperbag Added: " + bag + "\n";
            }

            this.bill = this.bill + "Total Price: " + this.price + "\n";
        return this.bill;
    }
}
