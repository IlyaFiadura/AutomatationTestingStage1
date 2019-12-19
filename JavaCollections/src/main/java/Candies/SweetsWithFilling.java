package Candies;

import Models.FillingBase;
import Models.CandiesWithFilling;

public class SweetsWithFilling extends Candy {

    private CandiesWithFilling candyMainComponent;
    private FillingBase fillingBase;

    
    public SweetsWithFilling(String candyName, int candyWeight, int sugarPercent, CandiesWithFilling candyMainComponent, FillingBase fillingBase, int amountOfCandies) {
        super(candyName, candyWeight, sugarPercent, amountOfCandies);
        this.candyMainComponent = candyMainComponent;
        this.fillingBase = fillingBase;
    }

    public FillingBase getFillingBase(){
        return fillingBase;
    }
    public void setFillingBase(FillingBase fillingBase){
        this.fillingBase = fillingBase;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                        ", main component=" + candyMainComponent +
                        "with filling=" + fillingBase +
                        '}');
    }
}

