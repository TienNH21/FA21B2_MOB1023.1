package lesson10_fileio_binary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoFileIOStream {
    public static void main(String[] args) {
        String filename = "demo_file_io.txt";

        System.out.println("Bắt đầu ghi file");
        ghiFile(filename);
        System.out.println("Kết thúc ghi file");

        System.out.println("-------------------");

        System.out.println("Bắt đầu đọc file");
        docFile(filename);
        System.out.println("Kết thúc đọc file");
    }
    
    public static void ghiFile(String filename) {
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            
            String txt = "Hello Poly";
            byte[] b = txt.getBytes();
            
            fos.write(b);
            
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void docFile(String filename) {
        try {
            FileInputStream fis = new FileInputStream(filename);
            
            while (true) {
                int i = fis.read();
                
                if (i == -1) {
                    break;
                }
                
                char c = (char) i;
                System.out.print(c);
            }
            
            System.out.println("");
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
