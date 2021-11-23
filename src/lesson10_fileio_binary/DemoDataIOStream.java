package lesson10_fileio_binary;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DemoDataIOStream {
    public static void main(String[] args) {
        String filename = "demo_data_io.txt";

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
            DataOutputStream dataOS = new DataOutputStream(fos);
            
            int i = 20;
            double d = 100.0;
            char c = 'B';
            
            dataOS.writeInt(i);
            dataOS.writeDouble(d);
            dataOS.writeChar(c);
            
            dataOS.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void docFile(String filename) {
        try {
            FileInputStream fis = new FileInputStream(filename);
            DataInputStream dataIS = new DataInputStream(fis);
            
            int i = dataIS.readInt();
            double d = dataIS.readDouble();
            char c = dataIS.readChar();
            
            System.out.println(i);
            System.out.println(d);
            System.out.println(c);
            
            dataIS.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
