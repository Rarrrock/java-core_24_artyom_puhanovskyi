package Core.lesson_3.HW.Printable;

public class Book implements Printable {
    private String title;
    private String author;

    // Конструктор для инициализации книги
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Реализация метода print из интерфейса
    @Override
    public void print() {
        System.out.println("Book: " + title + " by " + author);
    }
}