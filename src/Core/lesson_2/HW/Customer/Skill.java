package Core.lesson_2.HW.Customer;

public class Skill {
    private String title;
    private int experience;

    public Skill(String title, int experience) {
        this.title = title;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "title='" + title + '\'' +
                ", experience=" + experience +
                '}';
    }
}