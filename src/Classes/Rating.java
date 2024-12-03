package src.Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Rating {
    private Order order;
    private ArrayList<Review> reviews;

    public Rating(Order order)
    {
        this.order = order;
    }
 
    public ArrayList<Review> addReviewToOrder(Order order)
    {
        ArrayList<Review> reviews = new ArrayList<>();
        ArrayList<Basket> br = new ArrayList<>();
        br = order.getBaskets();

        System.out.print(order.getOrder_number());

        for (int i = 0; i < br.size(); i++) {
            System.out.println(i+1 + " " + br.get(i));
            System.out.println("Szeretnél-e véleméynt adni? (igen/nem)");
            Scanner inChoose = new Scanner(System.in);
            String Choose = inChoose.nextLine();
            if (Choose == "igen")
            {
                
            }
        }

        
        

        return reviews;
    }


    @Override
    public String toString() {
        return order.getOrder_number() + "\n" + product_name + "\n" + review ;
    }

    



}
