package CandyShop.candies;

import java.util.Objects;

public abstract class Candy implements CountCandyWeight {

    protected String candyName;
    protected int candyAmount;
    protected double candyWeight;

    @Override
    public double getCandiesWeight() {
        return candyAmount * candyWeight;
    }

    @Override
    public String toString() {
        return "Candy{" + '\'' + candyName + '\'' +
                ", Weight=" + candyWeight * candyAmount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Candy candy = (Candy) o;

        if (candyAmount != candy.candyAmount) return false;
        if (Double.compare(candy.candyWeight, candyWeight) != 0) return false;
        return Objects.equals(candyName, candy.candyName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = candyName != null ? candyName.hashCode() : 0;
        result = 31 * result + candyAmount;
        temp = Double.doubleToLongBits(candyWeight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
