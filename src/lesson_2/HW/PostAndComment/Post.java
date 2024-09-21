package lesson_2.HW.PostAndComment;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;
    private List<Comment> comments; // Список комментариев к посту (Композиция)

    public Post(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
        this.comments = new ArrayList<>(); // Инициализация списка комментариев
    }

    // Метод для добавления комментариев (Композиция)
    public void addComment(Comment comment) {
        comments.add(comment);
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", comments=" + comments +
                '}';
    }

    public int getId() {
        return id;
    }
}
