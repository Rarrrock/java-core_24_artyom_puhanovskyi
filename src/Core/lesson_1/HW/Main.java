package Core.lesson_1.HW;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book1", 300, List.of("John Doe"), "Fiction"));
        books.add(new Book("Book2", 400, List.of("Jane Smith"), "Non-fiction"));
        books.add(new Book("Book3", 200, List.of("Jim Brown"), "Fantasy"));
        books.add(new Book("Book4", 350, List.of("Alice White"), "Horror"));
        books.add(new Book("Book5", 500, List.of("Charlie Black"), "Thriller"));

        Book.printBooks(books);

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 120, 1.8, false));
        cars.add(new Car("Ford", 150, 2.0, true));
        cars.add(new Car("BMW", 200, 3.0, true));
        cars.add(new Car("Honda", 130, 1.6, false));
        cars.add(new Car("Audi", 180, 2.5, true));

        Car.printCars(cars);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Buddy", 3, "Labrador"));
        dogs.add(new Dog("Max", 5, "Bulldog"));
        dogs.add(new Dog("Charlie", 2, "Beagle"));
        dogs.add(new Dog("Rocky", 4, "Poodle"));
        dogs.add(new Dog("Oscar", 6, "German Shepherd"));

        Dog.printDogs(dogs);

        List<Post> posts = new ArrayList<>();
        posts.add(new Post(1, 1, "Title1", "Body of post 1"));
        posts.add(new Post(2, 2, "Title2", "Body of post 2"));
        posts.add(new Post(3, 3, "Title3", "Body of post 3"));
        posts.add(new Post(4, 4, "Title4", "Body of post 4"));
        posts.add(new Post(5, 5, "Title5", "Body of post 5"));

        Post.printPosts(posts);

        List<Comment> comments = new ArrayList<>();
        comments.add(new Comment(1, 1, "Comment1", "email1@example.com", "Body of comment 1"));
        comments.add(new Comment(2, 2, "Comment2", "email2@example.com", "Body of comment 2"));
        comments.add(new Comment(3, 3, "Comment3", "email3@example.com", "Body of comment 3"));
        comments.add(new Comment(4, 4, "Comment4", "email4@example.com", "Body of comment 4"));
        comments.add(new Comment(5, 5, "Comment5", "email5@example.com", "Body of comment 5"));

        Comment.printComments(comments);
    }
}
