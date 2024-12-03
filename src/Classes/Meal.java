package src.Classes;


public class Meal {
    protected String name;
    protected int price;


    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Termék: " + name + " Ár: " + price + " ";
    }

    


}
