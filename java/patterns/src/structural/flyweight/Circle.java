package structural.flyweight;

public class Circle extends Shape {

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String label;

    @Override
    public void draw(double radius, String fillColour) {
        System.out.println("Circle's " + label + " radius: " + radius + " of colour: " + fillColour);
    }
}
