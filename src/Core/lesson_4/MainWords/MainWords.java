package Core.lesson_4.MainWords;

import java.util.ArrayList;
import java.util.Collections;

public class MainWords {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("banana");
        words.add("apple");
        words.add("cherry");
        words.add("grape");
        words.add("watermelon");
        words.add("kiwi");
        words.add("orange");
        words.add("lemon");
        words.add("strawberry");
        words.add("blueberry");
        words.add("pineapple");
        words.add("pear");
        words.add("peach");
        words.add("apricot");
        words.add("mango");
        words.add("plum");
        words.add("lime");

        // Сортировка по алфавиту
        Collections.sort(words);
        System.out.println("Сортировка по алфавиту: " + words);
    }
}
