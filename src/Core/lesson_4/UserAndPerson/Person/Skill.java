package Core.lesson_4.UserAndPerson.Person;

public class Skill {
    private String title;
    private int experience;

    public Skill(String title, int experience) {
        this.title = title;
        this.experience = experience;
    }

    public String getTitle() {
        return title;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "title='" + title + '\'' +
                ", experience=" + experience +
                '}';
    }
}
