package com.example;

import pkgPizza.Pizza;
import pkgPizza.Topping;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Margarita",100);
pizza.addTopping(new Topping("Tomate", 20));
pizza.addTopping(new Topping("Cebolla",50));
pizza.addTopping(new Topping("peperoni",30));
pizza.prepare();
pizza.calcularTotal();
    }
}