package behavioral.command;

public class Person {

    public static void main(String[] args) {
        Television television = new Television();
        RemoteController remoteController = new RemoteController();

        OnCommand onCommand = new OnCommand(television);
        OffCommand offCommand = new OffCommand(television);

        remoteController.setCommand(onCommand);
        remoteController.pressButton();

        remoteController.setCommand(offCommand);
        remoteController.pressButton();
    }

}
