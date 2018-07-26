import java.util.HashMap;
import java.util.Map;

public class Totalbillcount
{

    private Map<Beverage, Integer> beverages = new HashMap<Beverage, Integer>();

    public Double getTotal()
    {
        Double total = 0.00;
        Price temp = new Price ();
      //  Menu_card menobj = new Menu_card();

        for (Beverage beverage : this.beverages.keySet())
        {
            Integer quantity = new Integer(this.beverages.get(beverage));
            Double c = temp.getCost();
            Double t = temp.getTax();

            total = total + (c*(quantity)*t);

        }

        return total;
    }

    public void add(Beverage beverage, Integer quantity)
    {

        this.beverages.put(beverage, quantity);
    }

}
