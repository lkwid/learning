package creational.singleton.assignment;

import java.util.Optional;

public class Logger implements Cloneable {

    private static Logger instance;

    private Logger() {};

    public static Logger getInstance() {
        synchronized(Logger.class) {
            instance = Optional.ofNullable(instance).orElse(new Logger());
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
