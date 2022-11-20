package creational.factory;

public class VegePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Vege Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Vege Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Vege Pizza");
    }
}
