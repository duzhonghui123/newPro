package com.dzh.SerializeTest1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args) {
        Employee e = null;
        try {
            FileInputStream fileIn = new FileInputStream("D:/6月5日创建java/tmp/empoyee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            return;
        }
        System.out.println("Deserialized Employee...");
        System.out.println(e.name);
        System.out.println(e.address);
        System.out.println(e.number);
        System.out.println(e.SSN);
    }
}
