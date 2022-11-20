package creational.factory.assignment;

public class PersonFactory {

    public static Person getPerson(String from) throws ClassNotFoundException {
        return switch(from) {
            case "boy" -> new Male();
            case "girl" -> new Female();
            default -> throw new ClassNotFoundException("Person not found");
        };
    }

}
