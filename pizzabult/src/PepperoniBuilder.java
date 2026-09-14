public class PepperoniBuilder implements PizzaBuilder
{
    private Pizza pizza;

    public PepperoniBuilder()
    {
        this.pizza = new Pizza();
    }

    @Override
    public PizzaBuilder buildDough()
    {
        pizza.setDough("Thick Crust Dough");
        return this;
    }

    @Override
    public PizzaBuilder buildSauce()
    {
        pizza.setSauce("Tomato Sauce");
        return this;
    }

    @Override
    public PizzaBuilder buildTopping()
    {
        pizza.setTopping("A lot of Pepperoni and cheese");
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
