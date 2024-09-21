package lesson_2.HW.PC;

public class Workstation extends Laptop {
    private boolean hasDedicatedGPU;

    public Workstation(String processor, int ram, int storage, double screenSize, boolean hasDedicatedGPU) {
        super(processor, ram, storage, screenSize);
        this.hasDedicatedGPU = hasDedicatedGPU;
    }

    @Override
    public void displaySpecs() {
        super.displaySpecs();
        System.out.println("Dedicated GPU: " + (hasDedicatedGPU ? "Yes" : "No"));
    }
}