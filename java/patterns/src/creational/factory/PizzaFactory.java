package creational.factory;

public class PizzaFactory {

    public static Pizza createPizza(String type) throws ClassNotFoundException {
        Pizza p = null;

        switch (type) {
            case "cheese" -> p = new CheesePizza();
            case "chicken" -> p = new ChieckenPizza();
            case "vege" -> p = new VegePizza();
            default -> throw new ClassNotFoundException("Pizza type not found");
        }

        return p;
    }
}
