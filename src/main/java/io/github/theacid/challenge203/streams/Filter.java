package io.github.theacid.challenge203.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        Wine bottle1 = new Wine(" Château La Mission Haut Brion ", "Château Haut-Brion Pessac-Leognan Rouge AOC 2010", Line.LUXURY, 2599.00);
        Wine bottle2 = new Wine("Château La Mission Haut Brion ", "Le Clarence de Haut-Brion Pessac-Leognan Rouge AOC 2010", Line.PREMIUM, 350.00 );
        Wine bottle3 = new Wine("Le Dome Winery ", " Le Dome Saint-Emilion Grand Cru 2011", Line.PREMIUM, 290.50);
        Wine bottle4 = new Wine("Maison Joseph Drouhin ", "Drouhin Charmes-Chambertin Grand Cru A.O.C. 2012", Line.PREMIUM, 250.00);
        Wine bottle5 = new Wine("Château La Mission Haut Brion ", "Château La Mission Haut-Brion Pessac-Léognan Rouge AOC 2010", Line.LUXURY, 2400.00);

        List<Wine> wines = Arrays.asList(bottle1, bottle2, bottle3, bottle4, bottle5);

        Predicate<Wine> sortByPrice = wine -> wine.getPrice() > 1500;

        List<Wine> result = wines.stream().filter(sortByPrice).collect(Collectors.<Wine> toList());

        System.out.print("\n" + result);
    }
}
