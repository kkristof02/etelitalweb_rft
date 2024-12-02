

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        
        Drink d1 = new Drink(true, "Fanta", 0.5, 480);
        Drink d2 = new Drink(true, "Cola", 0.5, 480);
        Drink d3 = new Drink(true, "Sprite", 0.5, 480);
        Drink d4 = new Drink(false, "Sör", 0.5, 420);
        Drink d5 = new Drink(false, "Bor", 0.1, 790);
        Drink d6 = new Drink(false, "Pálinka", 0.05, 650);

        Food f1 = new Food("Leves", "Húsleves", 1890);
        Food f2 = new Food("Leves", "Paradicsomleves", 1290);
        Food f3 = new Food("Leves", "Gulyásleves", 1690);
        Food f4 = new Food("Főétel", "Rántott csirkemell burgonyával", 2990);
        Food f5 = new Food("Főétel", "Sertéspörkölt galuskával", 3450);
        Food f6 = new Food("Főétel", "Grilezett lazac", 4760);

        ArrayList<Meal> meals = new ArrayList<Meal>();
        meals.add(f6);
        meals.add(f5);
        meals.add(d1);
        meals.add(d2);

        Order o1 = new Order(meals, 1);

        System.out.println(meals);
        System.out.println("ez az ára: " + o1.allOrderedProductPrice(meals));




    }
}