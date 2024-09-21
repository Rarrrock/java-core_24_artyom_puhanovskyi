package lesson_2.HW.Papyrus;

public class Magazine extends Book {
    private String issue;

    public Magazine(String material, String content, String author, int pages, String issue) {
        super(material, content, author, pages);
        this.issue = issue;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Issue: " + issue);
    }
}
