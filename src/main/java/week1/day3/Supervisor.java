package week1.day3;

public class Supervisor extends Employee {
    private int experience;

    public Supervisor() {
    }

    public Supervisor(long id, String name, int experience) {
        super(id, name);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
