package Core.lesson_3.HW;

import Core.lesson_3.HW.Instrument.Drum;
import Core.lesson_3.HW.Instrument.Guitar;
import Core.lesson_3.HW.Instrument.Instrument;
import Core.lesson_3.HW.Instrument.Trumpet;
import Core.lesson_3.HW.Printable.Book;
import Core.lesson_3.HW.Printable.Magazine;
import Core.lesson_3.HW.Printable.Printable;

public class Main {
    public static void main(String[] args) {
        // Создание массива типа Printable, содержащего книги и журналы
        Printable[] items = new Printable[4];

        // Инициализация массива объектами классов Book и Magazine
        items[0] = new Book("1984", "George Orwell");
        items[1] = new Book("To Kill a Mockingbird", "Harper Lee");
        items[2] = new Magazine("National Geographic", "October 2023");
        items[3] = new Magazine("Time", "September 2023");

        // Проходим по массиву и вызываем метод print у каждого элемента
        for (Printable item : items) {
            item.print();
        }


        // Создаем массив инструментов типа Instrument
        Instrument[] instruments = new Instrument[3];

        // Инициализируем массив объектами классов Guitar, Drum, Trumpet
        instruments[0] = new Guitar(6);
        instruments[1] = new Drum(40);
        instruments[2] = new Trumpet(10.5);

        // Цикл для вызова метода play у каждого инструмента
        for (Instrument instrument : instruments) {
            instrument.play(); // Вызов метода play, который реализован в каждом классе
        }
    }
}