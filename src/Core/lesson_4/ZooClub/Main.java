package Core.lesson_4.ZooClub;

public class Main {
    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();

        // Создаем участников
        Person person1 = new Person("Vasya", 31);
        Person person2 = new Person("Anna", 25);
        Person person3 = new Person("Ivan", 28);

        // Создаем питомцев
        Pet pet1 = new Pet("Rex", "Собака");
        Pet pet2 = new Pet("Tom", "Кошка");
        Pet pet3 = new Pet("Buddy", "Собака");
        Pet pet4 = new Pet("Max", "Птица");

        // Добавляем участников в клуб
        zooClub.addMember(person1);
        zooClub.addMember(person2);
        zooClub.addMember(person3);

        // Добавляем питомцев к участникам
        zooClub.addPetToMember(person1, pet1);
        zooClub.addPetToMember(person1, pet2);
        zooClub.addPetToMember(person2, pet3);
        zooClub.addPetToMember(person3, pet4);

        // Выводим зооклуб
        zooClub.printClub();

        // Удаляем питомца у участника
        zooClub.removePetFromMember(person1, pet1);
        zooClub.printClub();

        // Удаляем участника из клуба
        zooClub.removeMember(person3);
        zooClub.printClub();

        // Удаляем питомца у всех участников
        zooClub.removePetFromAll(pet3);
        zooClub.printClub();
    }
}