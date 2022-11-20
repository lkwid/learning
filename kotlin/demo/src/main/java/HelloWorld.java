import oop.MaxKt;
import oop.Person;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, Java");

        Person Bob = new Person("Robert", "Smith");
        System.out.println(String.format("The new employee name is %s", Bob.getFirstName()));

        Bob.setFirstName("Bob");
        System.out.println(String.format("He wishes to be called %s", Bob.getFirstName()));

        Integer maxInt = MaxKt.max(2001, 2010);
        System.out.println(String.format("Max value is: %d", maxInt));
    }

}
