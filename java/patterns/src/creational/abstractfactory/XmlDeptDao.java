package creational.abstractfactory;

public class XmlDeptDao implements Dao {

    @Override
    public void save() {
        System.out.println("Saving Department to XML");
    }
}
