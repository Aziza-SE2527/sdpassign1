public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        PizzaBuilder pepperoniBuilder = new PepperoniBuilder();
        Pizza pepperoniPizza = director.construct(pepperoniBuilder);
        System.out.println("Order for Azi:" + pepperoniPizza);

        PizzaBuilder margaritaBuilder = new MargaritaBuilder();
        Pizza margaritePizza = director.construct(margaritaBuilder);
        System.out.println("Order for Meeaovv:" + margaritePizza);

    }
}


