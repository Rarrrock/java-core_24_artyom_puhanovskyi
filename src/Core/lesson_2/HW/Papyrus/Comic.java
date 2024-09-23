package Core.lesson_2.HW.Papyrus;

public class Comic extends Book {
    private String illustrator;

    public Comic(String material, String content, String author, int pages, String illustrator) {
        super(material, content, author, pages);
        this.illustrator = illustrator;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Illustrator: " + illustrator);
    }
}