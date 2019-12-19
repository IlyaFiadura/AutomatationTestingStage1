package Candies;

public class Sweetmeats extends Candy {

    public Sweetmeats(String candyName, int candyWeight, int sugarPercent, int amountOfCandies) {
        super(candyName, candyWeight, sugarPercent,amountOfCandies);

    }

    @Override
    public String toString() { return super.toString();}
}