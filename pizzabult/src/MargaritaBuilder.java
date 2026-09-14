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
        if(pizza.getDough()==null || pizza.getSauce()==null || pizza.getTopping()==null)
        {
            throw  new IllegalArgumentException("Wrong ingredient or order");
        }
        return this.pizza;
    }
}
