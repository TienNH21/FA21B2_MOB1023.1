package lesson12_multi_threading;

public class MainThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        
        System.out.println("Finish");
    }
}
