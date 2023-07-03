package CandyShop.exceptions;

/*
BasketMaxSizeException throws an exception if the total number of candy types is exceeded
 */

public class BasketMaxSizeException extends RuntimeException{
    public BasketMaxSizeException(String candyName) {
        super("Candy " + "\"" + candyName + "\"" + " was not added to the gift basket.");
    }
}
