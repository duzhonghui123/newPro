package com.dzh.SerializeTest1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SeralizeTest {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "dzh";
        e.address = "成都";
        e.SSN = 1123;
        e.number = 101;
        try {
            FileOutputStream fileout = new FileOutputStream("D:/6月5日创建java/tmp/empoyee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(e);
            out.close();
            fileout.close();
            System.out.println("Serialized data is saved in /tmp/employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }


}
