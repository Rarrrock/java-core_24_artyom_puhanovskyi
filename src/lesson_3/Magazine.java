package lesson_3;

public class Magazine implements Printable {
    private String title;
    private String issue;

    // Конструктор для инициализации журнала
    public Magazine(String title, String issue) {
        this.title = title;
        this.issue = issue;
    }

    // Реализация метода print из интерфейса
    @Override
    public void print() {
        System.out.println("Magazine: " + title + ", Issue: " + issue);
    }
}