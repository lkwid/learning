package behavioral.template.assignment;

public class DesktopManufacturer extends ComputerManufacturer {

    @Override
    protected String addHardDisk() {
        return "High End SSD 3.5\"";
    }

    @Override
    protected String addRam() {
        return "64GB";
    }

    @Override
    protected String addKeyboard() {
        return "Logitech MX Keys";
    }
}
