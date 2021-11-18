package lesson9_lab4;

import java.util.Date;

public class NhanVien {
    private String hoTen;
    private Date ngaySinh;
    private double luong;

    public NhanVien() {
    }

    public NhanVien(String hoTen, Date ngaySinh, double luong) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.luong = luong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public double getLuong() {
        return luong;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    
}
