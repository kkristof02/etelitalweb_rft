package src.Classes;

import java.util.ArrayList;

public class Review {
    private Integer order_number;
    private Basket product_name;
    private String review;

    public Review( Integer order_number, Basket product_name, String review)
    {
        this.order_number = order_number;
        this.product_name = product_name;
        this.review = review;
    }

    public Integer getOrder_number() {
        return order_number;
    }

    public Basket getProduct_name() {
        return product_name;
    }

    public String getReview() {
        return review;
    }

    @Override
    public String toString() {
        return "Rendelés száma: " + order_number + " Termék név: " + product_name.getMeal().getName() + " Vélemény: " + review ;
    }
}
