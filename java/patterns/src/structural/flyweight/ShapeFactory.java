package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static Map<String, Shape> shapes = new HashMap<>();

    public static Shape getShape(String type) throws ClassNotFoundException {
        if (shapes.containsKey(type)) {
            return shapes.get(type);
        } else {
            Shape shape = switch (type) {
                case "circle" -> new Circle();
                case "rectangle" -> new Rectangle();
                default -> throw new ClassNotFoundException("Shape of a given type not found!");
            };
            shapes.put(type, shape);
            return shape;
        }
    }
}
