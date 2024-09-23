package Core.lesson_3.HW.Instrument;

public class Guitar implements Instrument {
    private int numberOfStrings;

    // Конструктор для инициализации количества струн
    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    // Реализация метода play
    @Override
    public void play() {
        System.out.println("Грає гітара з " + numberOfStrings + " струнами.");
    }
}
