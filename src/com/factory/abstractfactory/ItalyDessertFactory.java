package com.factory.abstractfactory;

public class ItalyDessertFactory implements DessertFactory{

    @Override
    public Coffee creatCoffee() {
        LatteCoffee coffee = new LatteCoffee();
        return coffee;
    }

    @Override
    public Dessert creatDessert() {
        Tiramisu dessert = new Tiramisu();
        return dessert;
    }
    
}
