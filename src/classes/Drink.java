public class Drink extends Meal{
    private boolean isAlcoholic;
    private String name;
    private double capacity;
    private int price;

    public Drink(boolean isAlcoholic, String name, double capacity, int price)
    {
        this.isAlcoholic = isAlcoholic;
        this.capacity = capacity;
        this.price = price;
        this.name = name;   
    }

    public boolean getIsAlcoholic()
    {
        return isAlcoholic;
    }

    public String getName()
    {
        return name;
    }
    
    public double getCapacity()
    {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setAlcoholic(boolean isAlcoholic) {
        this.isAlcoholic = isAlcoholic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setPrice(int price) {
        this.price = price;
    }




}
