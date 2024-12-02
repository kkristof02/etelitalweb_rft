package src.Classes;

public class Rating {
    private Order order;
    private String product_name;
    private String review;

    public Rating(Order order, String product_name, String review)
    {
        this.order = order;
        this.product_name = product_name;
        this.review = review;
    }

    @Override
    public String toString() {
        return order.getOrder_number() + "\n" + product_name + "\n" + review ;
    }

    



}
