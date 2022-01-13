package week2.day4.app;

public class Demo2 {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        Thread t1 = new Thread(runnable);
        t1.start();
        System.out.println("Inside of main");
    }

    public static class RunnableImpl implements Runnable{
        @Override
        public void run() {
            System.out.println("Inside of child");
        }
    }
}
