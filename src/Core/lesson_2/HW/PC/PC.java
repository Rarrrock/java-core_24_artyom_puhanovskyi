package Core.lesson_2.HW.PC;

public class PC {
    private String processor;
    private int ram;
    private int storage;

    public PC(String processor, int ram, int storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public void displaySpecs() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Storage: " + storage + "GB");
    }
}
