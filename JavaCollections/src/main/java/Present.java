import Candies.ChocolateBars;
import Candies.Candy;

import java.util.*;

public class Present {
    private List<? extends Candy> candies;

    public List<Candy> getOnlyCandies() {
        List<Candy> onlyCandies = new ArrayList<>();
        for (Candy i : candies) {
            if (!(i instanceof ChocolateBars)) {
                onlyCandies.add((Candy) i);
            }
        }
        return onlyCandies;
    }
    
    public void getWeightOfPresent() {
        int weightOfPresent = 0;
        for (Candy i : candies) {
            weightOfPresent = weightOfPresent + i.getCandyWeight()*i.getAmountOfCandies();
        }
       System.out.println("Weight of present is "+ weightOfPresent + " gramms");
    }

    public List<Candy> getCandiesWithLowSugar() {
        List<Candy> candiesWithLowSugar = new ArrayList<>();
        for (Candy i : candies) {
            if (i.getSugarPercents() < 20 && i.getSugarPercents()>0) {
                candiesWithLowSugar.add((Candy) i);
            }
        }
        return candiesWithLowSugar;
    }

    public Present sortBySugarPercent() {
        Collections.sort(candies, new Comparator<Candy>() {
            public int compare(Candy o2, Candy o1) {
                return o2.getSugarPercents() - o1.getSugarPercents();
            }
        });
        return this;
    }

    @Override
    public String toString() {
        return candies.toString();
    }

    public Present(List<? extends Candy> candies) {
        this.candies = candies;
    }
}
