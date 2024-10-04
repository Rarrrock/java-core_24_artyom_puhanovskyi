package Core.lesson_4.UserAndPerson;

import Core.lesson_4.UserAndPerson.Person.Car;
import Core.lesson_4.UserAndPerson.Person.Gender;
import Core.lesson_4.UserAndPerson.Person.Person;
import Core.lesson_4.UserAndPerson.Person.Skill;
import Core.lesson_4.UserAndPerson.User.User;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Alice", 30));
        users.add(new User("Bob", 25));
        users.add(new User("Charlie", 35));
        users.add(new User("David", 22));

        // Сортировка по возрасту (по возрастанию)
        Collections.sort(users, Comparator.comparingInt(User::getAge));
        System.out.println("Сортировка по возрасту (по возрастанию): " + users);

        // Сортировка по возрасту (по убыванию)
        Collections.sort(users, Comparator.comparingInt(User::getAge).reversed());
        System.out.println("Сортировка по возрасту (по убыванию): " + users);

        // Сортировка по количеству символов в имени (по возрастанию)
        Collections.sort(users, Comparator.comparingInt(user -> user.getName().length()));
        System.out.println("Сортировка по количеству символов в имени (по возрастанию): " + users);

        // Сортировка по количеству символов в имени (по убыванию)
        Collections.sort(users, (user1, user2) -> Integer.compare(user2.getName().length(), user1.getName().length()));
        System.out.println("Сортировка по количеству символов в имени (по убыванию): " + users);


        // Создаем навыки для пользователей
        List<Skill> skills1 = Arrays.asList(new Skill("java", 10), new Skill("js", 10), new Skill("c++", 10));
        List<Skill> skills2 = Arrays.asList(new Skill("python", 7), new Skill("html", 5));
        List<Skill> skills3 = Arrays.asList(new Skill("java", 3), new Skill("c++", 1));

        // Создаем машины
        Car car1 = new Car("Toyota", 2021, 250);
        Car car2 = new Car("BMW", 2020, 300);
        Car car3 = new Car("Audi", 2019, 220);

        // Создаем пользователей
        Person person1 = new Person(1, "Vasya", "Pupkin", "asd@asd.com", 31, Gender.MALE, skills1, car1);
        Person person2 = new Person(2, "Anna", "Ivanova", "anna@asd.com", 25, Gender.FEMALE, skills2, car2);
        Person person3 = new Person(3, "Ivan", "Petrov", "ivan@asd.com", 28, Gender.MALE, skills3, car3);

        // Создаем HashSet и добавляем людей
        Set<Person> personSet = new HashSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);

        // Проходим по HashSet и удаляем всех мужчин
        personSet.removeIf(person -> person.getGender() == Gender.MALE);
        System.out.println("HashSet после удаления мужчин: " + personSet);

        // Создаем TreeSet с компаратором для сортировки по количеству навыков
        TreeSet<Person> personTreeSet = new TreeSet<>(Comparator.comparingInt(p -> p.getSkills().size()));
        personTreeSet.add(person1);
        personTreeSet.add(person2);
        personTreeSet.add(person3);

        // Выводим TreeSet, отсортированный по количеству навыков
        System.out.println("TreeSet, отсортированный по количеству навыков: " + personTreeSet);
    }
}