package lesson2_lab1;

import java.util.ArrayList;

public class QLSP {
    private ArrayList<Product> ds;
    
    public QLSP() {
        this.ds = new ArrayList<Product>();
    }
    
    public void them(Product p) {
        this.ds.add(p);
    }
    
    public void sua(int viTri, Product p) {
        this.ds.set(viTri, p);
    }
    
    public void xoa(int viTri) {
        this.ds.remove(viTri);
    }
    
    public ArrayList<Product> getDs() {
        return this.ds;
    }
    
    public Product get(int viTri) {
        return this.ds.get(viTri);
    }
}
