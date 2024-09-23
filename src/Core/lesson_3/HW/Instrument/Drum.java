package Core.lesson_3.HW.Instrument;

public class Drum implements Instrument {
    private int size;

    // Конструктор для инициализации размера барабана
    public Drum(int size) {
        this.size = size;
    }

    // Реализация метода play
    @Override
    public void play() {
        System.out.println("Грає барабан розміром " + size + " см.");
    }
}
