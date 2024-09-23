package Core.lesson_4.Person;

public class Car {
    private String model;
    private int year;
    private int power;

    public Car(String model, int year, int power) {
        this.model = model;
        this.year = year;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", power=" + power +
                '}';
    }
}