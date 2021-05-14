package mathpackage.javastudy.raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Solution {

    public static void main(String[] args) {


//    String fileName = "d:/Ras.txt";
    String fileName = args[0];
    int positionNumbers = Integer.parseInt(args[1]);
    String textExample = args[2];
    byte[] textFromFile = new byte[textExample.length()];

    try {
        RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
        raf.seek(positionNumbers);
        raf.read(textFromFile, 0, textExample.length());
        System.out.println(new String(textFromFile));
        if(textFromFile.equals(textExample)) {
            raf.write("true".getBytes());
        }else {
            raf.write("false".getBytes());
        }


    } catch (FileNotFoundException e) {
        System.out.println("File not found");
    } catch (IOException e) {
        e.printStackTrace();
    }


    }
}
