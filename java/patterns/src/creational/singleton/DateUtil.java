package creational.singleton;

import java.io.Serializable;
import java.util.Optional;

public class DateUtil implements Serializable, Cloneable {

    public static final long serialVersionUID = 1L;
    private static DateUtil instance;

    private DateUtil() {
    }

    public static DateUtil getInstance() {
        synchronized(DateUtil.class) {
            instance = Optional.ofNullable(instance).orElse(new DateUtil());
        }
        return instance;
    }

    // To resolve serialization issue, returns creational.singleton instance instead of creating a new one

    protected Object readResolve() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}
