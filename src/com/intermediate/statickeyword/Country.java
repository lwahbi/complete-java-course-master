package com.intermediate.statickeyword;

public class Country {

    private static int numberOfCountries;
    private final String NAME;
    private int population;
    private String capital;

    // executed when loading class on memories order 1
    static {
        numberOfCountries = 5;
    }
    // executed when loading class on memories order 2
    static {
        numberOfCountries = 0;
    }
    public Country(String name, int population, String capital) {
        NAME = name;
        this.population = population;
        this.capital = capital;
        numberOfCountries++;
    }

    public final void populationChange(int change){
        population += change;
    }

    public void getDetails() {
        System.out.println("Country name: " + NAME + " Population: " + population + " Capital: " + capital);
    }

    public static int getNumberOfCountries() {
        return numberOfCountries;
    }

}
