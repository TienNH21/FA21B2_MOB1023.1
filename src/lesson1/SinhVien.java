package lesson1;

import java.io.Serializable;

public class SinhVien extends Nguoi implements Serializable {
    private String maSv;
    private String nganh;

    public SinhVien() {
    }

    public SinhVien(String maSv, String nganh, String hoTen,
        int gioiTinh, String diaChi) {
        super(hoTen, gioiTinh, diaChi);
        this.maSv = maSv;
        this.nganh = nganh;
    }

    public String getMaSv() {
        return maSv;
    }

    public String getNganh() {
        return nganh;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
}
