package Core.lesson_4.ZooClub;

import java.util.*;

public class ZooClub {
    private Map<Person, List<Pet>> club = new HashMap<>();

    // 1) Добавить участника в клуб
    public void addMember(Person person) {
        club.putIfAbsent(person, new ArrayList<>());
        System.out.println(person.getName() + " добавлен в клуб.");
    }

    // 2) Добавить питомца к участнику клуба
    public void addPetToMember(Person person, Pet pet) {
        List<Pet> pets = club.get(person);
        if (pets != null) {
            pets.add(pet);
            System.out.println("Питомец " + pet.getName() + " добавлен к участнику " + person.getName());
        } else {
            System.out.println("Участник не найден.");
        }
    }

    // 3) Удалить питомца у участника
    public void removePetFromMember(Person person, Pet pet) {
        List<Pet> pets = club.get(person);
        if (pets != null && pets.remove(pet)) {
            System.out.println("Питомец " + pet.getName() + " удален у участника " + person.getName());
        } else {
            System.out.println("Питомец или участник не найден.");
        }
    }

    // 4) Удалить участника из клуба
    public void removeMember(Person person) {
        if (club.remove(person) != null) {
            System.out.println("Участник " + person.getName() + " удален из клуба.");
        } else {
            System.out.println("Участник не найден.");
        }
    }

    // 5) Удалить конкретного питомца у всех участников
    public void removePetFromAll(Pet pet) {
        for (Map.Entry<Person, List<Pet>> entry : club.entrySet()) {
            List<Pet> pets = entry.getValue();
            if (pets.remove(pet)) {
                System.out.println("Питомец " + pet.getName() + " удален у участника " + entry.getKey().getName());
            }
        }
    }

    // 6) Вывести зооклуб на экран
    public void printClub() {
        System.out.println("Зооклуб:");
        for (Map.Entry<Person, List<Pet>> entry : club.entrySet()) {
            System.out.println(entry.getKey() + " имеет питомцев: " + entry.getValue());
        }
    }
}
