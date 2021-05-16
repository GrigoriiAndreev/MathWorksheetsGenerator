package mathpackage.javastudy;

import java.io.*;
import java.util.ArrayList;

/*
Шифр Цезаря
*/

public class Solution {
    public static void main(String [] args)
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add(new String("Hello"));
        al.add(new String("Hi"));
        al.add(new String("Howdy"));

        try{
            FileOutputStream fos= new FileOutputStream("D:/Java_Math/SavedObjects/" + "al.dat");
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(al);
            oos.close();
            fos.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }

        ArrayList<String> arraylist= new ArrayList<String>();
        try
        {
            FileInputStream fis = new FileInputStream("D:/Java_Math/SavedObjects/" + "al.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            arraylist = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
            return;
        }catch(ClassNotFoundException c){
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
        for(String tmp: arraylist){
            System.out.println(tmp);
        }
    }
}
