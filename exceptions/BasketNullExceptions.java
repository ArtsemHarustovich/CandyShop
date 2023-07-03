package CandyShop.exceptions;

/*
BasketNullExceptions throws an exception in case non-positive values are specified
in parameters when creating an object of Basket class
 */

public class BasketNullExceptions extends Exception {
    public BasketNullExceptions() {
        super("Basket size/max weight should be more than 0.");
    }
}
