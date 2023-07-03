package CandyShop.candies;

public class JellyCandies extends Candy {

    private int amountCandiesInPack;
    private int amountPacks;
    private double packWeight;

    @Override
    public String toString() {
        return "Candy{" + '\'' + candyName + '\'' +
                ", Weight=" + amountPacks * packWeight +
                '}';
    }

    @Override
    public double getCandiesWeight() {
        return amountPacks * packWeight;
    }

    public JellyCandies(String candyName, int amountCandiesInPack, int amountPacks, double packWeight) {
        this.candyName = candyName;
        this.amountCandiesInPack = amountCandiesInPack;
        this.amountPacks = amountPacks;
        this.packWeight = packWeight;
        if (amountCandiesInPack <= 0 || amountPacks <= 0 || packWeight <= 0) {
            throw new IllegalArgumentException("Amount/weight should be more than 0 for " + candyName + " candies");
        }
    }
}