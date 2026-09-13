public interface PizzaBuilder
{
    PizzaBuilder buildDough();
    PizzaBuilder buildSauce();
    PizzaBuilder buildTopping();
    Pizza getPizza();
}
