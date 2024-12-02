import java.util.ArrayList;

public class Order {
    private ArrayList<Meal> meals;
    private int order_number;

    public Order(ArrayList<Meal> meals, int order_number)
    {
        this.meals = meals;
        this.order_number = order_number;
    }

    public int allOrderedProductPrice(ArrayList<Meal> meals)
    {
        Delivery d = new Delivery();

        int allprice = 0;
        for (Meal meal : meals) {
            allprice = allprice + meal.getPrice();
            System.out.println(meal.getPrice());

        }
        return allprice + d.getDeliveryPrice();
    }

}
