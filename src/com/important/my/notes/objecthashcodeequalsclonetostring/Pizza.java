package com.important.my.notes.objecthashcodeequalsclonetostring;

import java.util.Objects;
// @EqualsAndHashCode with lambook
public class Pizza implements Cloneable{

    private String name;
    private PizzaSize pizzaSize;
    private double price;

    public Pizza(String name, PizzaSize pizzaSize) {
        this.name = name;
        this.pizzaSize = pizzaSize;
        this.price = calculatePrice();
    }

    private double calculatePrice() {
        switch (pizzaSize) {
            case SMALL:
            default:
                return 5.99;
            case MEDIUM:
                return 7.99;
            case LARGE:
                return 10.99;
        }
    }

    public String getName() {
        return name;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public double getPrice() {
        return price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        // if we want to compare two objects mapped to different addresses and yet have them considered equal based on their internal states
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pizza)) {
            return false;
        }
        Pizza pizza = (Pizza) o;
        return Objects.equals(pizza.name, name) &&
                price == pizza.price &&
                pizzaSize == pizza.pizzaSize;

    }

    /**
     * Why do we need equals and hashCode?
     * An object hash code value can change in multiple executions of the same application.
     * If two objects are equal according to equals() method, then their hash code must be same.
     * If two objects are unequal according to equals() method, their hash code are not required to be different.
     *
     * If two objects are equal according to the equals(Object) method, then calling the hashCode method on each of the
     * two objects must produce the same integer result.
     *
     * It is not required that if two objects are unequal according to the equals(java.lang.Object) method, then calling the hashCode
     * method on each of the two objects must produce distinct integer results. However, the programmer should be aware
     * that producing distinct integer results for unequal objects may improve the performance of hash tables.
     * @return
     */
    @Override
    public int hashCode() {
        // dont use RANDOM HASHING : every time it s return a new hashcode.
        return Objects.hash(name, pizzaSize, price);

        // to prouve hashcode it s the same
//        int result = 7;
//
//        result = 31 * result + (name == null ? 0 : name.hashCode());
//        result = 31 * result + (pizzaSize == null ? 0 : pizzaSize.hashCode());
//        result = 31 * result + Double.valueOf(price).hashCode(); // Primitif dont have hashcode
//
//        return result;
    }
}
