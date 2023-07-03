package CandyShop.candies;

import CandyShop.exceptions.BasketMaxSizeException;
import CandyShop.exceptions.BasketMaxWeightException;
import CandyShop.exceptions.BasketNullExceptions;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final int maxBasketSize;
    private final double maxBasketWeight;
    private List<Candy> candies = new ArrayList<>();

    public Basket(int maxBasketSize, double maxBasketWeight) throws BasketNullExceptions {
        this.maxBasketWeight = maxBasketWeight;
        this.maxBasketSize = maxBasketSize;
        if (maxBasketSize <= 0 || maxBasketWeight <= 0) {
            throw new BasketNullExceptions();
        }
    }

    public int getMaxBasketSize() {
        return maxBasketSize;
    }

    public double getMaxBasketWeight() {
        return maxBasketWeight;
    }

    public void addCandy(Candy candy) throws BasketNullExceptions, BasketMaxWeightException {
        if (candy == null) {
           throw new BasketNullExceptions();
        }
        if (candies.size() >= maxBasketSize) {
            throw new BasketMaxSizeException(candy.candyName);
        }
        double currentWeight = calculateWeight();
        double candyWeight = candy.getCandiesWeight();
        if ((currentWeight + candyWeight) > maxBasketWeight) {
            throw new BasketMaxWeightException(candy.candyName);
        }
        candies.add(candy);
    }

    public double calculateWeight() {
        return candies
                .stream()
                .mapToDouble(Candy::getCandiesWeight)
                .sum();
    }

    public void sortByWeight() {
        candies.sort((o1, o2) -> Double.compare(o2.getCandiesWeight(), o1.getCandiesWeight()));
    }

    @Override
    public String toString() {
        return "Basket{" +
                "candies=" + candies +
                '}';
    }
}
