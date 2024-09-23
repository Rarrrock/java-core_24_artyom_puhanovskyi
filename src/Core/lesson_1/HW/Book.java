package Core.lesson_1.HW;

import java.util.List;

public class Book {
     private String title;
     private int pages;
     private List<String> authors;
     private String genre;

     // Конструктор
     public Book(String title, int pages, List<String> authors, String genre) {
          this.title = title;
          this.pages = pages;
          this.authors = authors;
          this.genre = genre;
     }

     // Геттеры и сеттеры
     public String getTitle() {
          return title;
     }

     public void setTitle(String title) {
          this.title = title;
     }

     public int getPages() {
          return pages;
     }

     public void setPages(int pages) {
          this.pages = pages;
     }

     public List<String> getAuthors() {
          return authors;
     }

     public void setAuthors(List<String> authors) {
          this.authors = authors;
     }

     public String getGenre() {
          return genre;
     }

     public void setGenre(String genre) {
          this.genre = genre;
     }

     @Override
     public String toString() {
          return "Book{" +
                  "title='" + title + '\'' +
                  ", pages=" + pages +
                  ", authors=" + authors +
                  ", genre='" + genre + '\'' +
                  '}';
     }

     public static void printBooks(List<Book> books) {
          for (Book book : books) {
               System.out.println(book);
          }
     }
}