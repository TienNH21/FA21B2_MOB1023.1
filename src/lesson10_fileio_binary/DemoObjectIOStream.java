package lesson10_fileio_binary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import lesson9_lab4.NhanVien;

public class DemoObjectIOStream {
    public static void main(String[] args) {
        String filename = "demo_object_io.txt";

        System.out.println("Bắt đầu ghi file");
        ghiFile(filename);
        System.out.println("Kết thúc ghi file");

        System.out.println("-------------------");

        System.out.println("Bắt đầu đọc file");
        docFile(filename);
        System.out.println("Kết thúc đọc file");
    }
    
    public static void ghiFile(String filename) {
        NhanVien nv1 = new NhanVien("Ng Van A", new Date(), 0),
             nv2 = new NhanVien("Tran Van B", new Date(), 0);
        
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(nv1);
            oos.writeObject(nv2);
            
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void docFile(String filename) {
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            NhanVien nv1 = (NhanVien) ois.readObject();
            NhanVien nv2 = (NhanVien) ois.readObject();
            
            System.out.println(nv1.getHoTen());
            System.out.println(nv2.getHoTen());
            
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
