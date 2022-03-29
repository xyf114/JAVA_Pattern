package com.factory.abstractfactory;

public class AmercanDessertFactory implements DessertFactory{

    @Override
    public Coffee creatCoffee() {
        AmericanCoffee coffee = new AmericanCoffee();
        return coffee;
    }

    @Override
    public Dessert creatDessert() {
        Matchamousse dessert = new Matchamousse();
        return dessert;
    }
    
}
