package week2.day4.part1.app;

import week2.day4.part1.beans.RunnableImpl;

public class Demo1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableImpl());
        t1.start();
        System.out.println("Inside of main after thread started execution");
        for(int c = 0 ; c < 10 ; c++){
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("in main : "+c);
        }
        System.out.println("End of the main");
    }
}
