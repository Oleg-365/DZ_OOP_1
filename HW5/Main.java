import View.View;
import Data.Group;
import Data.HotDrinks;
import Data.Authomat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        View view = new View();

        HotDrinks hotDrinks1 = new HotDrinks("шоколад", 150, 450, 80, 1);
        HotDrinks hotDrinks2 = new HotDrinks("шоколад", 100, 300, 80, 2);
        HotDrinks hotDrinks3 = new HotDrinks("шоколад", 70, 250, 80, 3);
        HotDrinks hotDrinks4 = new HotDrinks("кофе", 150, 450, 90, 4);
        HotDrinks hotDrinks5 = new HotDrinks("кофе", 100, 300, 60, 5);
        HotDrinks hotDrinks6 = new HotDrinks("кофе", 70, 250, 50, 6);
        HotDrinks hotDrinks7 = new HotDrinks("чай", 150, 450, 60, 7);
        HotDrinks hotDrinks8 = new HotDrinks("чай", 100, 300, 60, 8);
        HotDrinks hotDrinks9 = new HotDrinks("чай", 70, 250, 50, 9);

        Authomat Drinks = new Authomat();
        List<HotDrinks> hotDrinksList = new ArrayList<>(List.of(hotDrinks1, hotDrinks2, hotDrinks3, hotDrinks4 ,hotDrinks5 ,hotDrinks6, hotDrinks7, hotDrinks8 ,hotDrinks9));

        Drinks.initProduct(hotDrinksList);

        System.out.println("Поиск по названию: " + Drinks.getProduct("шоколад").replace("[", "").replace("]", ""));
        System.out.println("█".repeat(50));

        System.out.println("Поиск по цене: " + Drinks.getProductPrice(80).replace("[", "").replace("]", ""));
        System.out.println("█".repeat(50));

        System.out.println("Поиск по температуре: " + Drinks.getProduct(70).replace("[", "").replace("]", ""));
        System.out.println("█".repeat(50));

        view.createGroup(new Group
                (new ArrayList<>
                        (List.of(hotDrinks1,
                                hotDrinks2,
                                hotDrinks3,
                                hotDrinks4)),
                        new Authomat("Автомат", "Горячие_напитки", "кофейня"), 10));

        view.createGroup(new Group
                (new ArrayList<>
                        (List.of(hotDrinks5,
                                hotDrinks6,
                                hotDrinks7,
                                hotDrinks8,
                                hotDrinks9)),
                        new Authomat("Автомат",  "Теплые_напитки", "кофейня"), 11));
        view.createDrinks(10, "чай", 150, 450, 70, 10);
        System.out.println(view);

    }
}
