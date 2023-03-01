package com.intermediate.statickeyword;

/***
 * Allows you to qccess Jqava element without creating any object
 * att or methods bellong to the clqss not object
 * VARIABLE :
 *      - a single copy of variable is created and shared a;ong all oobjects at class level
 *      - var static can be created at class level only ==> cqnt creat local variable as sattic
 *      - is created when class is loaded in memory befor creating an object
 * Methods :
 *      - can only directly call other static methods
 *      - can only directly access static data
 *      - cannot refer to this or super in any way
 */
public class CountriesApp {

    public static void main(String[] args) {
        System.out.println("Number of countries: " + Country.getNumberOfCountries());
        Country brazil = new Country("Brazil", 210000000, "Brasilia");
        brazil.getDetails();
        Country germany = new Country("Germany", 83000000, "Berlin");
        germany.getDetails();
        Country japan = new Country("Japan", 12500000, "Tokyo");
        japan.getDetails();
        System.out.println("Number of countries: " + Country.getNumberOfCountries());
    }
}
