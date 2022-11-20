package creational.singleton.assignment;

public class LoggerTest {

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log(String.format("I was printed by logger 1: %s", logger1.hashCode()));
        logger1.log(String.format("I was printed by logger 2: %s", logger2.hashCode()));
    }
}
