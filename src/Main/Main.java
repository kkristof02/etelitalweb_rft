package src.Main;

import java.util.ArrayList;
import src.Classes.*;

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

        Basket b1 = new Basket(f6, 1);
        Basket b2 = new Basket(f2, 1);
        Basket b3 = new Basket(d1, 2);

        ArrayList<Basket> b = new ArrayList<Basket>();
        b.add(b1);
        b.add(b2);
        b.add(b3);


        Order o1 = new Order(b, 1);

        System.out.println(b);
        System.out.println("Összesen: " + o1.allOrderedProductPrice(b));




    }
}