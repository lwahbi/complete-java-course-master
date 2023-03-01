package com.advanced.enumcoding;

public enum PizzaSize {
    SMALL("Small size", 1), MEDIUM("Medium size", 2), LARGE("Large size", 3);

    private String pizzaSizeText;
    private int pizzaOrder;

    /**
     * CONSTRACTOR
     * @param pizzaSizeText
     */
    PizzaSize(String pizzaSizeText, int pizzaOrder) {
        this.pizzaSizeText = pizzaSizeText;
        this.pizzaOrder = pizzaOrder;
    }

    public String getPizzaSizeText() {
        return pizzaSizeText;
    }

    public int getPizzaOrder() {
        return pizzaOrder;
    }
}
