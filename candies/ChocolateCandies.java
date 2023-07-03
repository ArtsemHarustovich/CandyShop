package CandyShop.candies;

public class ChocolateCandies extends Candy {

    public ChocolateCandies(String candyName, int candyAmount, double candyWeight) {
        this.candyName = candyName;
        this.candyAmount = candyAmount;
        this.candyWeight = candyWeight;
        if (candyAmount <= 0 || candyWeight <= 0) {
            throw new IllegalArgumentException("Amount/weight should be more than 0 for " + candyName + " candies");
        }
    }
}
