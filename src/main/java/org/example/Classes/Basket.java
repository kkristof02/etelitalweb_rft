package org.example.Classes;

/**
 * Itt taroljuk, a felhasználó által vásárolni akart termékeket.
 */
public class Basket {
    /**
     * @param meal az étel vagy ital tároljuk benne.
     * @param quantity az étel vagy ital mennyisége
     */
    private Meal meal;
    private int quantity;

    /**
     * Lértehoz egy új példányt étellel és a mennyiséggel
     */

    public Basket(Meal meal, int quantity)
    {
        this.meal = meal;
        this.quantity = quantity;
    }

    /**
     *  visszaadja az ételt
     */

    public Meal getMeal() {
        return meal;
    }

    /**
     * @return visszaadja a mennyiséget
     */

    public int getQuantity() {
        return quantity;
    }

    /**
     * @return Kiiratja a vásarolandó ételt
     */

    @Override
    public String toString() {
        return meal.toString()+"Darabszám: " + quantity + " Össz Ár: " + meal.getPrice() * quantity;
    }
}
