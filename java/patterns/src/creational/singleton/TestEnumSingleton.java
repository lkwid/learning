package creational.singleton;

public class TestEnumSingleton {

    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.INSTANCE;
        System.out.println(instance.getName());
        instance.setName("Lukasz");
        System.out.println(instance.getName());
    }
}
