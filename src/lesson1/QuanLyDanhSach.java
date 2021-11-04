package lesson1;

import java.util.ArrayList;

public class QuanLyDanhSach {
    private ArrayList<Nguoi> ds;

    public QuanLyDanhSach() {
        this.ds = new ArrayList<>();
    }
    
    public void them(Nguoi n) {
        this.ds.add(n);
    }
    
    public ArrayList<Nguoi> getDs() {
        return this.ds;
    }
}
