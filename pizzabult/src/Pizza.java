public class Pizza
{
    private String dough;
    private String sauce;
    private String topping;
    public void setDough(String dough)
    {
        this.dough = dough;
    }
    public String setSauce(String sauce)
    {
        return this.sauce = sauce;
    }
    public void setTopping(String topping)
    {
        this.topping = topping;
    }

    public String getDough()
    {
        return this.dough;
    }

    public String getSauce()
    {
        return sauce;
    }

    public String getTopping()
    {
        return topping;
    }


    @Override
    public String toString()
    {
        return "Dough: " + dough + ", Sauce: " + sauce + ", Topping: " + topping;
    }
}
