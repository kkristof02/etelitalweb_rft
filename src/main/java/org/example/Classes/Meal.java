package org.example.Classes;

/**
 * ételek és italok egyesítő osztálya 
 */
public class Meal {
    /**
     * @param name étel/ital neve
     * @param price étel/ital ára
     */
    protected String name;
    protected int price;

    /**
     * @return visszadja az árát
     */

    public int getPrice() {
        return price;
    }

    /**
     * @return visszadja a nevét
     */

    public String getName() {
        return name;
    }

    /**
     * Kiíratja termék nevét és árát
     */

    @Override
    public String toString() {
        return "Termék: " + name + " Ár: " + price + " ";
    }

    


}
