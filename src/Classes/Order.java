package src.Classes;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * rendelés leadása 
 */
public class Order {
    /**
     * @param baskets tartalma
     * @param order_number a rendelés száma
     */
    private ArrayList<Basket> baskets;
    private int order_number;

    /**
     * Lértehoz egy új  üres példányt
     */

    public Order()
    {

    }

    /**
     * Lértehoz egy új példányt kosár és a rendelés számáról
     */

    public Order(ArrayList<Basket> baskets, int order_number)
    {
        this.baskets = baskets;
        this.order_number = order_number;
    }

    /**
     * @return visszadja a kosár tartalmát
     */

    public ArrayList<Basket> getBaskets() {
        return this.baskets;
    }

    /**
     * @return visszadja a rendelés számát
     */

    public int getOrder_number() {
        return this.order_number;
    }

    /**
     * a metódusban kiválaszthatjuk a rendelni kivánt termékeket és hogy mennyit szeretnék venni
     * @param meals étel vagy ital
     * @param order_number rendelés száma
     * @return visszatér a rendeléssel
     */

    public Order creatingOrder(ArrayList<Meal> meals, int order_number)
    {
        /**
         * kiirja a vásárolható termékeket
         */
        ArrayList<Basket> baskets = new ArrayList<Basket>();
        for (int i = 0; i < meals.size(); i++) {
            System.out.println(i+1 + " " + meals.get(i));
        }
        /**
         * termékek kiválasztásának ciklus addig fut míg nem vagy kész a rendeléseddel
         */
        boolean running = true;
        while (running == true) {
            System.out.println("Válasz terméket szám alapján és adja meg a darabszámot: ");
        Scanner inOrderBasket = new Scanner(System.in);
        int product = inOrderBasket.nextInt();
        int p_quantity = inOrderBasket.nextInt();
        System.out.println("Ha nem szeretne többet irja be egy 0-át kétszer!");
        
        switch (product) {
            case 0:
                running = false;
                break;
            case 1:
                Basket b = new Basket(meals.get(product-1), p_quantity);
                baskets.add(b);
                break;
            case 2:
                Basket b1 = new Basket(meals.get(product-1), p_quantity);
                baskets.add(b1);
                break;
            case 3:
                Basket b2 = new Basket(meals.get(product-1), p_quantity);
                baskets.add(b2);
                break;
            case 4:
                Basket b3 = new Basket(meals.get(product-1), p_quantity);
                baskets.add(b3);
                break;
            case 5:
                Basket b4 = new Basket(meals.get(product-1), p_quantity);
                baskets.add(b4);
                break;
            case 6:
                Basket b5 = new Basket(meals.get(product-1), p_quantity);
                baskets.add(b5);
                break;
            case 7:
                Basket b6 = new Basket(meals.get(product-1), p_quantity);
                baskets.add(b6);
                break;
            case 8:
                Basket b7 = new Basket(meals.get(product-1), p_quantity);
                baskets.add(b7);
                break;
            case 9:
                Basket b8 = new Basket(meals.get(product-1), p_quantity);
                baskets.add(b8);
                break;
            case 10:
                Basket b9 = new Basket(meals.get(product-1), p_quantity);
                baskets.add(b9);
                break;
            case 11:
                Basket b10 = new Basket(meals.get(product-1), p_quantity);
                baskets.add(b10);
                break;
            case 12:
                Basket b11 = new Basket(meals.get(product-1), p_quantity);
                baskets.add(b11);
                break;
            default:
                System.out.println("Helytelen termék szám");
                break;
        }
            
        }
        this.baskets = baskets;
        this.order_number=order_number;
        Order o1 = new Order(baskets, order_number);
        Delivery d = new Delivery();

        int allprice = 0;

        /**
         * kosár kiratása
         */

        for (int i = 0; i < baskets.size(); i++) {
            System.out.print(baskets.get(i)+"\n");
        }

        /**
         * rendelés összegének megadása
         */

        for (Basket basket : baskets) {
            allprice = allprice + basket.getMeal().getPrice() * basket.getQuantity();
        }
        System.out.println("összesen: " + (allprice + d.getDeliveryPrice())); 
        return o1;
    }

}
