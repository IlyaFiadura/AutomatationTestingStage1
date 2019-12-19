package Candies;

import Models.Chocolate;

public class ChocolateBars extends Candy {

    private Chocolate chocolateType;

    public ChocolateBars(String candyName, int candyWeight, int sugarPercent, Chocolate chocolateType, int amountOfCandies) {
        super(candyName, candyWeight, sugarPercent, amountOfCandies);
        this.chocolateType = chocolateType;
    }

    public Chocolate getType() {
        return chocolateType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", chocolate type=" + chocolateType +
                '}');
    }
}
