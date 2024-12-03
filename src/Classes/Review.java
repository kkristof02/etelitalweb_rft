package src.Classes;

import java.util.ArrayList;

public class Review {
    private int order_number;
    private String product_name;
    private String review;

    public Review( int order_number, String product_name, String review)
    {
        this.order_number = order_number;
        this.product_name = product_name;
        this.review = review;
    }
}
