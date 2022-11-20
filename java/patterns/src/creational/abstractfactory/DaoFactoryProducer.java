package creational.abstractfactory;

public class DaoFactoryProducer {

    public static DaoAbstractFactory produce(String factoryType) throws ClassNotFoundException {
        return switch (factoryType) {
            case "xml" -> new XmlDaoFactory();
            case "db" -> new DbDaoFactory();
            default -> throw new ClassNotFoundException("Unknown creational.factory type");
        };
    }
}
