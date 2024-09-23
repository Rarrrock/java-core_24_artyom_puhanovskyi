package Core.lesson_5.Task_3;

public class Car {
    private String brand;
    private double enginePower; // Мощность двигателя
    private Owner owner;
    private double price;
    private int year;

    public Car(String brand, double enginePower, Owner owner, double price, int year) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.owner = owner;
        this.price = price;
        this.year = year;
    }

    // Геттеры и сеттеры
    public String getBrand() {
        return brand;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public Owner getOwner() {
        return owner;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{brand='" + brand + "', enginePower=" + enginePower + ", owner=" + owner + ", price=" + price + ", year=" + year + '}';
    }
}