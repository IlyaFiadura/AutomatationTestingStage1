import Models.Chocolate;
import Models.FillingBase;
import Models.CandiesWithFilling;
import Candies.SweetsWithFilling;
import Candies.ChocolateBars;
import Candies.Sweetmeats;
import Candies.Candy;

import java.util.Arrays;
import java.util.List;

public class Runner {
    static List<Candy> candies = Arrays.asList(
            new Sweetmeats("Crabs", 10, 76, 5),
            new Sweetmeats("MrsSweety", 7, 55, 7),
            new ChocolateBars("Snowy", 200, 45, Chocolate.WHITE, 1),
            new ChocolateBars("To-to", 100, 20, Chocolate.MILK,1),
            new ChocolateBars("monkaHmm", 80, 15, Chocolate.BITTER,2),
            new SweetsWithFilling("Bees", 25, 45,  CandiesWithFilling.CHOCOLATE, FillingBase.JELLY,5),
            new SweetsWithFilling("Ornottobees", 12, 35,  CandiesWithFilling.CARAMEL, FillingBase.POP,3),
            new SweetsWithFilling("Spaghetti&Meatballs", 60, 33, CandiesWithFilling.NOUGAT, FillingBase.FUDGE,2),
            new SweetsWithFilling("Kappa", 15, 21,  CandiesWithFilling.CHOCOLATE, FillingBase.CARAMEL, 4),
            new SweetsWithFilling("Yami-yami", 35, 14,  CandiesWithFilling.WAFFLE, FillingBase.NUTS,2),
            new SweetsWithFilling("Slimfree", 10, 0, CandiesWithFilling.CARAMEL, FillingBase.GUM,3)
    );

    public static void main(String[] args) {
        Present present = new Present(candies);
        present.getWeightOfPresent();
        Present onlyCandies = new Present(present.getOnlyCandies());
        Present candiesWithLowSugar = new Present(present.getCandiesWithLowSugar());
        System.out.println("Candies sorted by % of sugar: " + onlyCandies
                .sortBySugarPercent()
                .toString());
        System.out.println("Candies with % of sugar below 20% and not sugar free: " + candiesWithLowSugar
                .toString());
    }
}
