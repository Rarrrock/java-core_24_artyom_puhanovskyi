package Core.lesson_5.ArrayList_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Создаем ArrayList со словами
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("kiwi");
        words.add("orange");
        words.add("plum");
        words.add("pear");
        words.add("peach");
        words.add("berry");
        words.add("fig");
        words.add("grape");
        words.add("lemon");
        words.add("mango");
        words.add("apricot");
        words.add("lime");
        words.add("melon");

        // 1. Сортируем список по алфавиту
        words.sort(Comparator.naturalOrder());

        System.out.println("Список после сортировки по алфавиту:");
        for (String word : words) {
            System.out.println(word);
        }

        // 2. Фильтруем слова длиной меньше 4 символов
        List<String> filteredWords = words.stream()
                .filter(word -> word.length() <= 4)
                .collect(Collectors.toList());

        System.out.println("\nСписок после фильтрации слов длиной меньше 4 символов:");
        for (String word : filteredWords) {
            System.out.println(word);
        }
    }
}
