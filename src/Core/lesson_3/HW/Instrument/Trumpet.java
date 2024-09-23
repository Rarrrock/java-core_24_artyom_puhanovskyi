package Core.lesson_3.HW.Instrument;

public class Trumpet implements Instrument {
    private double diameter;

    // Конструктор для инициализации диаметра трубы
    public Trumpet(double diameter) {
        this.diameter = diameter;
    }

    // Реализация метода play
    @Override
    public void play() {
        System.out.println("Грає труба з діаметром " + diameter + " см.");
    }
}
