package day29exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E08 {

    public static void main(String[] args) {

        String path = "src/main/java/day29exceptions/notes.txt";

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            int a = 0;
            while ((a = fileInputStream.read()) != -1){
                System.out.println((char) a);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
