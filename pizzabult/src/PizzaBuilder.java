public interface PizzaBuilder
{
    PizzaBuilder buildDougn();
    PizzaBuilder buildSauce();
    PizzaBuilder buildTopping();
    Pizza getPizza();
}
