package src.Classes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Test;

public class OrderTest {
    @Test
    public void testCreatingOrder() {
        /**
         * 1. Teszt adatok előkészítése.
         */
        Food food1 = new Food("Leves", "Húsleves", 1890);
        Food food2 = new Food("Főétel", "Grilezett lazac", 4760);
        Drink drink1 = new Drink(true, "Fanta", 0.5, 480);
        Drink drink2 = new Drink(false, "Sör", 0.5, 420);
        
        ArrayList<Meal> meals = new ArrayList<>();
        meals.add(food1);
        meals.add(food2);
        meals.add(drink1);
        meals.add(drink2);

        int orderNumber = 1;

        /**
         *  2. A tesztelt metódus meghívása
         */
        Order order = new Order();
        ArrayList<Basket> baskets = new ArrayList<>();
        baskets.add(new Basket(food1, 2));
        baskets.add(new Basket(drink2, 3));

        order.creatingOrder(meals, orderNumber);

        /**
         * 3. Assert hívások az eredmény ellenőrzésre
         */
        assertNotNull("A basket nem lehet Null", order.getBaskets());
        assertEquals("Két darab terméket tartalmaz a basket", 2, order.getBaskets().size());
        assertEquals("1 számú rendelésnek kell lennie",1, order.getOrder_number());

        Basket firstBasket = order.getBaskets().get(0);
        assertEquals("Kosár első tartalma Húslevesnek kell lennie","Húsleves", firstBasket.getMeal().getName());
        assertEquals("Kosár első tartalma 2 darabnak kell lennie",2, firstBasket.getQuantity());

        Basket secondBasket = order.getBaskets().get(1);
        assertEquals("Kosár második tartalma Sörnek kell lennie","Sör", firstBasket.getMeal().getName());
        assertEquals("Kosár második tartalma 3 darabnak kell lennie",3, firstBasket.getQuantity());

    }
}
