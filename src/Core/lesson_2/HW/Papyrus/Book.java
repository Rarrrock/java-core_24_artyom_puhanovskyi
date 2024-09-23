package Core.lesson_2.HW.Papyrus;

public class Book extends Papyrus {
    private String author;
    private int pages;

    public Book(String material, String content, String author, int pages) {
        super(material, content);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}
