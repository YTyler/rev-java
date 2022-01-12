package week1.day4;

public class Snake implements Reptile, Pet {

    @Override
    public int numberOfLegs() {
        return 0;
    }

    @Override
    public void makeSound() {
        System.out.println("Ssssss");
    }

    @Override
    public void feed() {
        System.out.println("feed");
    }
}
