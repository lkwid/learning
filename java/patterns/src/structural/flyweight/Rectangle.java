package structural.flyweight;

public class Rectangle extends Shape {

    private String label;

    @Override
    public void draw(int length, String fillColor) {
        System.out.println("Rectangle's " + label + " side length: " + length + " of color: " + fillColor);
    }
}
