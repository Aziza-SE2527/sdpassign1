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

    }
}
