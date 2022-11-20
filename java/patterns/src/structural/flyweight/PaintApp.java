package structural.flyweight;

public class PaintApp {

    private Shape shape;
    public void render(int numberOfShapes) throws ClassNotFoundException {
        for (int i=1; i<=numberOfShapes; i++) {
            if (i % 2 == 0) {
                shape = ShapeFactory.getShape("circle");
                shape.draw(10.1, "red");
            } else {
                shape = ShapeFactory.getShape("rectangle");
                shape.draw(8, "green");
            }
        }
    }

}
