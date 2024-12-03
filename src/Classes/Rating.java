package src.Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Rating {
    private Order order;
    private ArrayList<Review> reviews;

    public Rating()
    {

    }

    public Rating(Order order)
    {
        this.order = order;
    }
 
    public ArrayList<Review> addReviewToOrder(Order order)
    {
        ArrayList<Review> reviews = new ArrayList<>();
        ArrayList<Basket> br = new ArrayList<>();
        br = order.getBaskets();
        System.out.println(br);

        System.out.print(order.getOrder_number());

        for (int i = 0; i < br.size(); i++) {
            System.out.println(i+1 + " " + br.get(i));
            System.out.println("Szeretnél-e véleméynt adni? (igen/nem)");
            Scanner inChoose = new Scanner(System.in);
            String Choose = inChoose.nextLine();
            if (Choose.equalsIgnoreCase("igen"))
            {
                Scanner inReview = new Scanner(System.in);
                String descString = inReview.nextLine();
                Review rev = new Review(order.getOrder_number(), br.get(i), descString);
                reviews.add(rev);

            }

        }

        
        

        return reviews;
    }


    @Override
    public String toString() {
        String products_names = "";
        for (Review review : reviews) {
            products_names = review.getOrder_number().toString() + review.getProduct_name() + review.getReview()+"\n";

        }
        return order.getOrder_number() + "\n" + order.getBaskets() + "\n" + reviews;
    }

    



}
