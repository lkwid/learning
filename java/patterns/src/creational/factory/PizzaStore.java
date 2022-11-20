package creational.factory;

public class PizzaStore {

    public Pizza orderPizza(String type) throws ClassNotFoundException {
        Pizza p = PizzaFactory.createPizza(type);

        p.prepare();
        p.bake();
        p.cut();

        return p;
    }

}
