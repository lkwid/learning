package behavioral.template.assignment;

public class LaptopManufacturer extends ComputerManufacturer {

    @Override
    protected String addHardDisk() {
        return "Standard 2.5\" SSD";
    }

    @Override
    protected String addRam() {
        return "16GB";
    }

    @Override
    protected String addKeyboard() {
        return "Built-in keyboard";
    }
}
