package Core.lesson_5.Task_3;

public class Owner {
    private String name;
    private int age;
    private int drivingExperience;

    public Owner(String name, int age, int drivingExperience) {
        this.name = name;
        this.age = age;
        this.drivingExperience = drivingExperience;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return "Owner{name='" + name + "', age=" + age + ", drivingExperience=" + drivingExperience + '}';
    }
}
