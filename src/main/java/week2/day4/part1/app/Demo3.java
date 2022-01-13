package week2.day4.part1.app;

public class Demo3 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside of child thread");
            }
        };
        Thread t1 = new Thread(runnable);
        t1.start();
        System.out.println("Inside of main thread");
    }
}
