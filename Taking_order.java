//package AssesmentJava;

public class Taking_order
{
    public static void main(String args[])
    {
        Beverage obj =  new Beverage("Hot", "Coffee-latte");
        Totalbillcount clientorders = new Totalbillcount();

        clientorders.add(menu.get(obj), 2);
        clientorders.add(menu.get("HotCoffee-Cappuccino"), 3);
        clientorders.add(menu.get("ColdDrink-pepsi"), 1);



        System.out.println("Total cost for orders: " + clientorders.getTotal());
    }
}
