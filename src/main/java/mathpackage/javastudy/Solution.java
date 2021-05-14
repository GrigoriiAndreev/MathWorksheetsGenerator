package mathpackage.javastudy;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/*
Шифр Цезаря
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("Khoor#Dpljr#&C,₷B'3");
        System.out.println(decode(reader, -3));  //Hello Amigo #@)₴?$0
    }

    public static String decode(StringReader reader, int key) throws IOException {
        StringWriter writer = new StringWriter();
        int n;
        if (reader != null) {
            while ((n = reader.read()) != -1) {
                writer.write(n + key);
            }
        }
        return writer.toString();

//        return null;
    }
}
