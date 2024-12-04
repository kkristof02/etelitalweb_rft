package src.Classes;

/**
 * Kiszállítási díj meghatározása
 */

public class Delivery {
    /**
     * @param deliveryPrice Kiszállítási dłj 
     */
    private static int deliveryPrice ;

    /**
     * Lértehoz egy új példányt a kiszállításból és megadjuk a mennyiségét
     */

    public Delivery()
    {
        this.deliveryPrice = 990;
    }

    /**
     * @return visszadja a kiszállítás árát
     */

    public static int getDeliveryPrice() {
        return deliveryPrice;
    }

}
