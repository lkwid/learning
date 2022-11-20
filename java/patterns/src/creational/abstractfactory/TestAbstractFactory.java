package creational.abstractfactory;

public class TestAbstractFactory {

    public static void main(String[] args) throws ClassNotFoundException {
        DaoAbstractFactory factory = DaoFactoryProducer.produce("xml");
        Dao dao = factory.createDao("dept");
        dao.save();
    }

}
