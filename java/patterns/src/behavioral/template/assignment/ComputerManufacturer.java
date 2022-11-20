package behavioral.template.assignment;

public abstract class ComputerManufacturer {

    public String buildComputer() {
        return String.format("""
                Computer configuration:
                  - %s
                  - %s
                  - %s""", addHardDisk(), addRam(), addKeyboard());
    }

    protected abstract String addHardDisk();
    protected abstract String addRam();
    protected abstract String addKeyboard();

}
