package src.Classes;

import java.util.ArrayList;

/**
 * értékelés adatainak tárolása
 */
public class Review {
    /**
     * @param order_number értékelés száma
     * @param product_name termék neve
     * @param review a termék értékelése
     */
    private Integer order_number;
    private Basket product_name;
    private String review;

    /**
     * Lértehoz egy új példányt értékelés számának, termék nevének és a véleménynek
     */

    public Review( Integer order_number, Basket product_name, String review)
    {
        this.order_number = order_number;
        this.product_name = product_name;
        this.review = review;
    }

    /**
     * @return visszaadja rendelés számát
     */

    public Integer getOrder_number() {
        return order_number;
    }

    /**
     * @return visszaadja termék nevét
     */

    public Basket getProduct_name() {
        return product_name;
    }

    /**
     * @return visszadja a véleményt
     */

    public String getReview() {
        return review;
    }

    /**
     * Véleméyn kiíratása a rendelés számával és termék nevével 
     */

    @Override
    public String toString() {
        return "Rendelés száma: " + order_number + " Termék név: " + product_name.getMeal().getName() + " Vélemény: " + review ;
    }
}
