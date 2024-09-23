package Core.lesson_2.HW.PC;

public class Ultrabook extends Laptop {
    private double weight;

    public Ultrabook(String processor, int ram, int storage, double screenSize, double weight) {
        super(processor, ram, storage, screenSize);
        this.weight = weight;
    }

    @Override
    public void displaySpecs() {
        super.displaySpecs();
        System.out.println("Weight: " + weight + " kg");
    }
}
