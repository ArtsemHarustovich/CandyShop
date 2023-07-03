package CandyShop;

import CandyShop.candies.*;
import CandyShop.exceptions.BasketMaxSizeException;
import CandyShop.exceptions.BasketMaxWeightException;
import CandyShop.exceptions.BasketNullExceptions;

import java.util.Arrays;
import java.util.List;

public class CandyShop {
    public static void main(String[] args) throws BasketNullExceptions {
        Candy spartak = new ChocolateCandies("Spartak", 20, 0.02);
        Candy chupachups = new LollipopCandies("Chupa-Chups", 20, 0.015);
        Candy haribo = new JellyCandies("Haribo", 30, 5, 0.25);
        Candy mars = new ChocolateCandies("Mars", 10, 0.05);

        List <Candy> candiesList = Arrays.asList(spartak, chupachups, haribo, mars);

        Basket basket = new Basket(4, 2);

        for (Candy candy: candiesList) {
            try {
                basket.addCandy(candy);
            } catch (BasketNullExceptions e) {
                System.out.println(e.getMessage());
            } catch (BasketMaxSizeException e) {
                System.out.println("Size of the basket is " + basket.getMaxBasketSize() + ". " + e.getMessage());
            } catch (BasketMaxWeightException e) {
                System.out.println("Max weight of the basket is " + basket.getMaxBasketWeight() + " KG. " + e.getMessage());
            }
        }

        basket.sortByWeight();
        System.out.println(basket);

        System.out.println("Total basket weight is " + basket.calculateWeight() + " KG.");
    }
}
