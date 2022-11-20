package behavioral.template.assignment;

public class ComputerManufacturerTest {

    public static void main(String[] args) {
        ComputerManufacturer configuration = new LaptopManufacturer();
        System.out.println(configuration.buildComputer());
    }

}
