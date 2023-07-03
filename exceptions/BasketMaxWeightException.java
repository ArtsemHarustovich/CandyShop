package CandyShop.exceptions;

/*
BasketMaxWeightException throws an exception in case total weight of candies in basket is exceeded
 */

public class BasketMaxWeightException extends RuntimeException {
    public BasketMaxWeightException(String candyName) {
        super("Candy " + "\"" + candyName + "\"" + " was not added to the gift basket.");
    }
}
