package week1.day3;

public class Manager extends Employee {
    private int qualification;

    public Manager() {
    }

    public Manager(long id, String name, int qualification) {
        super(id, name);
        this.qualification = qualification;
    }

    public int getQualification() {
        return qualification;
    }

    public void setQualification(int qualification) {
        this.qualification = qualification;
    }
}
