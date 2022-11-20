package creational.singleton;

import java.io.*;

public class DateUtilTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DateUtil dateUtil1 = DateUtil.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/home/lkwid/Documents/serialized/dateUtil.ser"));
        oos.writeObject(dateUtil1);

        DateUtil dateUtil2;
        ObjectInputStream ols = new ObjectInputStream(new FileInputStream("/home/lkwid/Documents/serialized/dateUtil.ser"));
        dateUtil2 = (DateUtil) ols.readObject();

        oos.close();
        ols.close();

        System.out.println(dateUtil1 == dateUtil2);

    }

}
