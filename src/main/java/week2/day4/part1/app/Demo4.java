package week2.day4.part1.app;

public class Demo4 {
    public static void main(String[] args) {

        Thread t1 = new Thread(
                () -> System.out.println("Inside of child thread")
        );
        t1.start();
        System.out.println("Inside of main thread");
    }
}
