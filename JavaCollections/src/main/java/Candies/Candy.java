package Candies;

abstract public class Candy {
    String candyName;
    private int candyWeight;
    private int sugarPercents;
    private int amountOfCandies;

    public Candy(String candyName, int candyWeight, int sugarPercents, int amountOfCandies) {
        this.candyName = candyName;
        this.candyWeight = candyWeight;
        this.sugarPercents = sugarPercents;
        this.amountOfCandies =amountOfCandies;
    }

    public String getCandyName() {
        return candyName;
    }

    public int getCandyWeight() {
        return candyWeight;
    }

    public int getSugarPercents() {
        return sugarPercents;
    }

    public int getAmountOfCandies()  {
        return amountOfCandies;
    }

    @Override
    public String toString() {
        return "Candy{" + candyName +
                ", weight=" + candyWeight +
                ", sugar(%)=" + sugarPercents +
                ", amount=" + amountOfCandies +
                '}';
    }
}
