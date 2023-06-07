package com.dzh.abstractTest.abstractTest;

import java.io.*;

public class fileStreamTest2 {
    public static void main(String[] args) throws IOException {
        File file = new File("a.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        OutputStreamWriter writer = new OutputStreamWriter(fileOutputStream, "UTF-8");
        writer.append("中文输入");
        writer.append("\r\n");
        writer.append("English");
        writer.close();
        fileOutputStream.close();
        FileInputStream fip = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());
        }
        System.out.println(sb.toString());
        reader.close();
        fip.close();
    }
}
