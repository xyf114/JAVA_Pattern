package com.factory.abstractfactory;

public class Client {
    public static void main(String[] args) {
        DessertFactory DessertFactory = new AmercanDessertFactory();
        Coffee coffee = DessertFactory.creatCoffee();
        Dessert dessert = DessertFactory.creatDessert();

        // DessertFactory dessertFactory = new ItalyDessertFactory();
        // Coffee coffee = dessertFactory.creatCoffee();
        // Dessert dessert = dessertFactory.creatDessert();

        System.out.println(coffee.getName());
        coffee.addMilk();
        coffee.addSugar();
        System.out.println(dessert.getName());
    }
}
