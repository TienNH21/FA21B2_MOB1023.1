package lesson7_lab3;

public class SinhVien {
    private String hoTen;
    private String nganh;
    private int diem;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String nganh, int diem) {
        this.hoTen = hoTen;
        this.nganh = nganh;
        this.diem = diem;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public int getDiem() {
        return diem;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }
    
    public String getHocLuc() {
        if (this.diem < 3) {
            return "Kém";
        } else if (this.diem < 5) {
            return "Yếu";
        } else if (this.diem < 6.5) {
            return "Trung Bình";
        } else if (this.diem < 7.5) {
            return "Khá";
        } else if (this.diem < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
    }
    
    public boolean getThuong() {
        if (this.diem < 7.5) {
            return false;
        } else {
            return true;
        }
    }
}
