package creational.abstractfactory;

public class XmlEmpDao implements Dao {

    @Override
    public void save() {
        System.out.println("Saving Employee to XML");
    }
}
