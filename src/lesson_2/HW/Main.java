package lesson_2.HW;

import lesson_2.HW.Customer.*;
import lesson_2.HW.PC.*;
import lesson_2.HW.PostAndComment.*;
import lesson_2.HW.User.*;
import lesson_2.HW.Papyrus.*;

import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        // Создание объекта User
        User user = new User(
                1,
                "Leanne Graham",
                "Bret",
                "Sincere@april.biz",
                new Address("Kulas Light", "Apt. 556", "Gwenborough", "92998-3874"),
                "1-770-736-8031 x56442",
                "hildegard.org",
                new Company("Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets")
        );
        // Вывод объекта User
        System.out.println(user);

        // Создаем экземпляр PC
        PC pc = new PC("Intel Core i7", 16, 512);
        System.out.println("PC Specs:");
        pc.displaySpecs();

        // Создаем экземпляр Laptop
        Laptop laptop = new Laptop("Intel Core i5", 8, 256, 15.6);
        System.out.println("\nLaptop Specs:");
        laptop.displaySpecs();

        // Создаем экземпляр Ultrabook
        Ultrabook ultrabook = new Ultrabook("Intel Core i7", 16, 512, 14, 1.2);
        System.out.println("\nUltrabook Specs:");
        ultrabook.displaySpecs();

        // Создаем экземпляр Workstation
        Workstation workstation = new Workstation("AMD Ryzen 9", 32, 1024, 17, true);
        System.out.println("\nWorkstation Specs:");
        workstation.displaySpecs();

        // Создаем экземпляр Magazine
        Magazine magazine = new Magazine("Papyrus", "Science articles", "John Doe", 100, "August 2024");
        System.out.println("Magazine Info:");
        magazine.displayInfo();

        // Создаем экземпляр Comic
        Comic comic = new Comic("Papyrus", "Superhero story", "Jane Smith", 50, "Mike Ross");
        System.out.println("\nComic Info:");
        comic.displayInfo();

        // Создаем экземпляр Customer
        Customer customer = new Customer(
                1,
                "vasya",
                "pupkin",
                "asd@asd.com",
                31,
                Gender.MALE, // Enum
                List.of(
                        new Skill("java", 10),  // Агрегация
                        new Skill("js", 10),
                        new Skill("c++", 10)
                ),
                new Car("toyota", 2021, 250)  // Композиция
        );
        // Вывод информации о клиенте
        System.out.println(customer);

        // Агрегация: создание списка постов
        List<Post> posts = new ArrayList<>();
        posts.add(new Post(1, 1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
                "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"));
        posts.add(new Post(1, 2, "qui est esse",
                "est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla"));
        posts.add(new Post(1, 3, "ea molestias quasi exercitationem repellat qui ipsa sit aut",
                "et iusto sed quo iure\nvoluptatem occaecati omnis eligendi aut ad\nvoluptatem doloribus vel accusantium quis pariatur\nmolestiae porro eius odio et labore et velit aut"));

        // Агрегация: создание списка комментариев
        List<Comment> comments = new ArrayList<>();
        comments.add(new Comment(1, 1, "id labore ex et quam laborum", "Eliseo@gardner.biz",
                "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"));
        comments.add(new Comment(1, 2, "quo vero reiciendis velit similique earum", "Jayne_Kuhic@sydney.com",
                "est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem reiciendis et"));
        comments.add(new Comment(1, 3, "odio adipisci rerum aut animi", "Nikita@garfield.biz",
                "quia molestiae reprehenderit quasi aspernatur\naut expedita occaecati aliquam eveniet laudantium\nomnis quibusdam delectus saepe quia accusamus maiores nam est\ncum et ducimus et vero voluptates excepturi deleniti ratione"));
        comments.add(new Comment(2, 7, "repellat consequatur praesentium vel minus molestias voluptatum", "Dallas@ole.me",
                "maiores sed dolores similique labore et inventore et\nquasi temporibus esse sunt id et\neos voluptatem aliquam\naliquid ratione corporis molestiae mollitia quia et magnam dolor"));
        comments.add(new Comment(2, 8, "et omnis dolorem", "Mallory_Kunze@marie.org",
                "ut voluptatem corrupti velit\nad voluptatem maiores\net nisi velit vero accusamus maiores\nvoluptates quia aliquid ullam eaque"));
        comments.add(new Comment(3, 13, "aut inventore non pariatur sit vitae voluptatem sapiente", "Kariane@jadyn.tv",
                "fuga eos qui dolor rerum\ninventore corporis exercitationem\ncorporis cupiditate et deserunt recusandae est sed quis culpa\neum maiores corporis et"));
        comments.add(new Comment(3, 14, "et officiis id praesentium hic aut ipsa dolorem repudiandae", "Nathan@solon.io",
                "vel quae voluptas qui exercitationem\nvoluptatibus unde sed\nminima et qui ipsam aspernatur\nexpedita magnam laudantium et et quaerat ut qui dolorum"));
        comments.add(new Comment(3, 15, "debitis magnam hic odit aut ullam nostrum tenetur", "Maynard.Hodkiewicz@roberta.com",
                "nihil ut voluptates blanditiis autem odio dicta rerum\nquisquam saepe et est\nsunt quasi nemo laudantium deserunt\nmolestias tempora quo quia"));

        // Итерация по комментариям и добавление их в соответствующие посты
        for (Post post : posts) {
            for (Comment comment : comments) {
                if (comment.getPostId() == post.getId()) {
                    post.addComment(comment); // Композиция: добавление комментариев в посты
                }
            }
        }

        // Вывод всех постов с комментариями
        for (Post post : posts) {
            System.out.println(post);
        }
    }
}
