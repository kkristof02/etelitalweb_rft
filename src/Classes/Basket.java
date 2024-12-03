package src.Classes;

public class Basket {
    private Meal meal;
    private int quantity;

    public Basket(Meal meal, int quantity)
    {
        this.meal = meal;
        this.quantity = quantity;
    }

    public Meal getMeal() {
        return meal;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return meal.toString()+"Darabszám: " + quantity + " Össz Ár: " + meal.getPrice() * quantity;
    }
}
