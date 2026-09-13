public class Director
{
    public Pizza construct(PizzaBuilder builder)
    {
        return builder.buildDough()
                .buildSauce()
                .buildTopping()
                .getPizza();
    }
}
