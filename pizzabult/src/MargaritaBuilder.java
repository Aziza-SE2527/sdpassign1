public class MargaritaBuilder implements PizzaBuilder
{
    private Pizza pizza;

    public MargaritaBuilder()
    {
        this.pizza = new Pizza();
    }

    @Override
    public PizzaBuilder buildDough()
    {
        pizza.setDough("Thin crust dough");
        return this;
    }

    @Override
    public PizzaBuilder buildSauce()
    {
        pizza.setSauce("Tomatoes and green");
        return this;
    }

    @Override
    public PizzaBuilder buildTopping()
    {
        pizza.setTopping("American cheese and mozzarella");
        return this;
    }

    @Override
    public Pizza getPizza()
    {
        return this.pizza;
    }
}
