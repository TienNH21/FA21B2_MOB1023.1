package lesson8_exception;

public class DemoException {
    public static void main(String[] args) {
        String str = "1a2b3c";
        
        try {
            int i = Integer.parseInt(str);
            System.out.println(i);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("Xử lý hoàn tất");
    }
}
