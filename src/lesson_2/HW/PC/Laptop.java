package lesson_2.HW.PC;

public class Laptop extends PC {
    private double screenSize;

    public Laptop(String processor, int ram, int storage, double screenSize) {
        super(processor, ram, storage);
        this.screenSize = screenSize;
    }

    @Override
    public void displaySpecs() {
        super.displaySpecs();
        System.out.println("Screen Size: " + screenSize + " inches");
    }
}