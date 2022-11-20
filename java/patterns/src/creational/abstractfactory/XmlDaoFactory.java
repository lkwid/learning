package creational.abstractfactory;

public class XmlDaoFactory extends DaoAbstractFactory {

    @Override
    public Dao createDao(String type) throws ClassNotFoundException {
        return switch (type) {
            case "emp" -> new XmlEmpDao();
            case "dept" -> new XmlDeptDao();
            default -> throw new ClassNotFoundException("Factory type unknown");
        };
    }
}
