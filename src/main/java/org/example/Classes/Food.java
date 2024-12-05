package org.example.Classes;

/**
 * a felvevendő ételek adatai
 */
public class Food extends Meal{
    /**
     * @param type étel típusa
     * @param name az étel neve
     * @param price étel ára
     */
    private String type;
    private String name;
    private int price;

    /**
     * Lértehoz egy új példányt típúsból, névből és árból
     */

    public Food(String type, String name, int price)
    {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    /**
     * @return visszaadja a nevét
     */

    public String getName() {
        return name;
    }
    
    /**
     * @return visszaadja az árat
     */

    public int getPrice() {
        return price;
    }

    /**
     * @return visszaadja a típusát
     */

    public String getType() {
        return type;
    }

    /**
     * beállítja a nevét
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * beállítja az árát
     */

    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * beállítja a típusát
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * kiíratja a termék nevét és árát
     */

    @Override
    public String toString() {
        return "Termék: " + name + " " + "Ár: " + price + " ";
    }

}
