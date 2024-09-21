package lesson_2.HW.Papyrus;

public class Papyrus {
    private String material;
    private String content;

    public Papyrus(String material, String content) {
        this.material = material;
        this.content = content;
    }

    public void displayInfo() {
        System.out.println("Material: " + material);
        System.out.println("Content: " + content);
    }
}
