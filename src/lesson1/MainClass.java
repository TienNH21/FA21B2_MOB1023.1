package lesson1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        QuanLyDanhSach qlds = new QuanLyDanhSach();
        Scanner sc = new Scanner(System.in);

        while (true) {
            menu();
            
            // Đọc vào số nguyên đc nhập từ bàn phím
            int t = sc.nextInt();

            // Loại bỏ ký tự Enter trong bộ đệm
            sc.next();

            if (t == 0) {
                break;
            }
            
            switch (t) {
                case 1:
                    // Đọc từ bàn phím ...
                    Nguoi n = new Nguoi();
                    qlds.them(n);
                    break;

                case 2:
                    ArrayList<Nguoi> ds = qlds.getDs();
                    
                    for (int i = 0; i < ds.size(); i++) {
                        Nguoi n1 = ds.get(i);
                        System.out.println(
                            n1.getHoTen() + " - " +
                            n1.getGioiTinh()+ " - " +
                            n1.getDiaChi()+ " - "
                        );
                    }
                    
                    break;
                    
                default:
                    //
                    break;
            }
        }
    }
    
    public static void menu() {
        System.out.println("----------------------");
        System.out.println("Nhập:");
        System.out.println("\t1. Thêm mới đối tượng");
        System.out.println("\t2. Xuất danh sách");
        System.out.println("\t0. Dừng chương trình");
        System.out.println("----------------------");
    }
}
