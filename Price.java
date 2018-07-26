public class Price
{
    private Double cost;
    private Double tax;

    public Price(Double cost, Double tax )
    {
        this.cost = cost;
        this.tax = tax;

    }

    public  Double getCost()
    {
        return this.cost;
    }
    public Double getTax()
    {
        return this.tax;
    }
}
