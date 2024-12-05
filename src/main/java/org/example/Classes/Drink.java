package org.example.Classes;

/**
 * a felvevendő italok adatai
 */
public class Drink extends Meal{
    /**
     * @param isAlcholic eldőntjük hogy alkoholos vagy sem
     * @param name ital neve
     * @param capacity az űrtartalmát
     * @param price az ára
     */
    private boolean isAlcoholic;
    private String name;
    private double capacity;
    private int price;

    /**
     * Lértehoz egy új példányt, hogy alkolos, névvel, űrtartalommal és árral
     */

    public Drink(boolean isAlcoholic, String name, double capacity, int price)
    {
        this.isAlcoholic = isAlcoholic;
        this.capacity = capacity;
        this.price = price;
        this.name = name;   
    }

    /**
     * @return visszaadja, hogy alkoholos-e
     */

    public boolean getIsAlcoholic()
    {
        return isAlcoholic;
    }

    /**
     * @return visszaadja a nevét
     */

    public String getName()
    {
        return name;
    }

    /**
     * @return visszaadja az űrtartalmát
     */
    
    public double getCapacity()
    {
        return capacity;
    }

    /**
     * @return visszaadja az árát
     */

    public int getPrice() {
        return price;
    }

    /**
     * beállítja a alkohlos értékét
     */

    public void setAlcoholic(boolean isAlcoholic) {
        this.isAlcoholic = isAlcoholic;
    }

    /**
     * beállítja a nevet
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * beállítja az űrtartalmát
     */

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * beállítja az árát
     */

    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * kiírja a termék nevét és árát
     */

     @Override
     public String toString() {
         return "Termék: " + name + " " + "Ár: " + price + " ";
     }




}
