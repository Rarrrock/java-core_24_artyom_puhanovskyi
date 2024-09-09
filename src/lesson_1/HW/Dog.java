package lesson_1.HW;

import java.util.List;

public class Dog {
    private String name;
    private int age;
    private String poroda;

    // Конструктор
    public Dog(String name, int age, String poroda) {
        this.name = name;
        this.age = age;
        this.poroda = poroda;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", poroda='" + poroda + '\'' +
                '}';
    }

    public static void printDogs(List<Dog> dogs) {
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}