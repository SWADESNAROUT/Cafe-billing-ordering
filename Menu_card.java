import java.util.HashMap;
import java.util.Map;

public class Menu_card
{
    public static void main(String[] args)
    {
        Map<Beverage,Price> menu = new HashMap<Beverage,Price>();


        menu.put(new Beverage("Hot", "Coffee-latte"), new Price(40.0,  0.18));
        menu.put(new Beverage("Hot", "Coffee-Cappuccino"), new Price(50.0, 0.18));
        menu.put(new Beverage("Hot", "Coffee-Expresso"), new Price(30.0, 0.18));
        menu.put(new Beverage("Hot", "Tea-Masala"), new Price(15.0, 0.05));
        menu.put(new Beverage("Hot", "Tea-Black"), new Price(10.0, 0.05));
        menu.put(new Beverage("Cold","Coffee-Oreo"), new Price(110.0, 0.18));
        menu.put(new Beverage("Cold","Coffee-Flape"), new Price(125.0, 0.18));
        menu.put(new Beverage("Cold","Drink-pepsi"), new Price(45.0, 0.20));
        menu.put(new Beverage("Cold","Drink-coke"), new Price(45.0, 0.20));
        menu.put(new Beverage("Cold","Drink-Mirinda"), new Price(45.0, 0.20));


     

    }
}
