package Core.lesson_5.ArrayOf20_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 1. Создаем массив из 20 чисел
        int[] numbers = {12, 3, 45, 60, 17, 20, 33, 5, 10, 6, 9, 90, 50, 13, 30, 40, 18, 7, 21, 100};

        // 2. Сортировка массива с помощью sorted()
        int[] sortedNumbers = Arrays.stream(numbers)
                .sorted()
                .toArray();

        System.out.println("Отсортированный массив:");
        Arrays.stream(sortedNumbers).forEach(System.out::println);

        // 3. Фильтрация чисел, кратных 3
        List<Integer> multiplesOfThree = Arrays.stream(numbers)
                .filter(num -> num % 3 == 0)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("\nЧисла, кратные 3:");
        multiplesOfThree.forEach(System.out::println);

        // 4. Фильтрация чисел, кратных 10
        List<Integer> multiplesOfTen = Arrays.stream(numbers)
                .filter(num -> num % 10 == 0)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("\nЧисла, кратные 10:");
        multiplesOfTen.forEach(System.out::println);

        // 5. Итерация массива с помощью forEach()
        System.out.println("\nПеребор массива с помощью forEach():");
        Arrays.stream(numbers).forEach(num -> System.out.println("Число: " + num));

        // 6. Маппинг массива, увеличение всех значений в 3 раза с помощью map()
        int[] tripledNumbers = Arrays.stream(numbers)
                .map(num -> num * 3)
                .toArray();

        System.out.println("\nНовый массив с числами, увеличенными в 3 раза:");
        Arrays.stream(tripledNumbers).forEach(System.out::println);
    }
}
