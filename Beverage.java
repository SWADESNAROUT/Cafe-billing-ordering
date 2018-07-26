
public class Beverage
{
    private String type;
    private String name;


    public Beverage(String type, String name)
    {
        this.type = type;
        this.name = name;

    }

    public String getType()
    {
        return this.type;
    }
    public String getName()
    {
        return this.name;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result ;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Beverage other = (Beverage) obj;

        if (type == null)
        {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;

        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }







}

