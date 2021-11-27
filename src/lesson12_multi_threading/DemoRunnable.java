package lesson12_multi_threading;

public class DemoRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread( new MyRunable() );
        t1.start();
    }
}
