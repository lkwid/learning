package creational.abstractfactory;

public abstract class DaoAbstractFactory {

    public abstract Dao createDao(String  type) throws ClassNotFoundException;

}
