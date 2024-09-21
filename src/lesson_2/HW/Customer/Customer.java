package lesson_2.HW.Customer;

import java.util.List;

public class Customer {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender; // Использование Enum
    private List<Skill> skills; // Агрегация - список навыков
    private Car car; // Композиция - автомобиль

    public Customer(int id, String name, String surname, String email, int age, Gender gender, List<Skill> skills, Car car) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.car = car;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", skills=" + skills +
                ", car=" + car +
                '}';
    }

}
