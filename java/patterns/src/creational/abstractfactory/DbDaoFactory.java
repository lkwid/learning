package creational.abstractfactory;

public class DbDaoFactory extends DaoAbstractFactory {

    @Override
    public Dao createDao(String type) throws ClassNotFoundException {
        return switch (type) {
            case "emp" -> new DbEmpDao();
            case "dept" -> new DbDeptDao();
            default -> throw new ClassNotFoundException("Factory type unknown");
        };
    }
}
