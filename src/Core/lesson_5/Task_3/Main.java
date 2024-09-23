package Core.lesson_5.Task_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 1. Создаем владельцев
        Owner owner1 = new Owner("John", 30, 4);
        Owner owner2 = new Owner("Alice", 35, 10);
        Owner owner3 = new Owner("Bob", 27, 3);
        Owner owner4 = new Owner("Eve", 40, 15);
        Owner owner5 = new Owner("Charlie", 29, 6);
        Owner owner6 = new Owner("Diana", 26, 2);
        Owner owner7 = new Owner("Frank", 33, 7);

        // 2. Создаем автопарк из 7 машин
        List<Car> carFleet = Arrays.asList(
                new Car("BMW", 250, owner1, 20000, 2015),
                new Car("Mercedes", 300, owner2, 30000, 2018),
                new Car("Audi", 220, owner3, 25000, 2016),
                new Car("Toyota", 180, owner4, 15000, 2012),
                new Car("Honda", 170, owner5, 18000, 2014),
                new Car("Ford", 200, owner6, 22000, 2019),
                new Car("Chevrolet", 210, owner7, 17000, 2013)
        );

        // 3. Увеличение мощности двигателя на 10% для половины автопарка
        List<Car> updatedCars = carFleet.stream()
                .limit(carFleet.size() / 2)
                .peek(car -> car.setEnginePower(car.getEnginePower() * 1.1)) // Увеличиваем мощность на 10%
                .collect(Collectors.toList());

        System.out.println("Автомобили после ремонта двигателя:");
        updatedCars.forEach(System.out::println);

        // 4. Проверка опыта водителей и повышение квалификации, если стаж меньше 5 лет, а возраст больше 25
        carFleet.stream()
                .filter(car -> car.getOwner().getDrivingExperience() < 5 && car.getOwner().getAge() > 25)
                .forEach(car -> {
                    Owner owner = car.getOwner();
                    owner.setDrivingExperience(owner.getDrivingExperience() + 1); // Увеличиваем стаж на 1 год
                    System.out.println("Водитель " + owner.getName() + " прошел курсы повышения квалификации. Новый стаж: " + owner.getDrivingExperience());
                });

        // 5. Подсчет общей стоимости всех автомобилей
        double totalCost = carFleet.stream()
                .mapToDouble(Car::getPrice)
                .sum();

        System.out.println("\nОбщая стоимость всех автомобилей: $" + totalCost);
    }
}
