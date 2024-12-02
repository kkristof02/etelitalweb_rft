package src.Classes;


import java.util.ArrayList;

public class Order {
    private ArrayList<Basket> baskets;
    private int order_number;

    public Order(ArrayList<Basket> baskets, int order_number)
    {
        this.baskets = baskets;
        this.order_number = order_number;
    }

    public int getOrder_number() {
        return order_number;
    }

    public int allOrderedProductPrice(ArrayList<Basket> baskets)
    {
        Delivery d = new Delivery();

        int allprice = 0;
        for (Basket basket : baskets) {
            allprice = allprice + basket.getMeal().getPrice() * basket.getQuantity();

        }
        return allprice + d.getDeliveryPrice();
    }


}
