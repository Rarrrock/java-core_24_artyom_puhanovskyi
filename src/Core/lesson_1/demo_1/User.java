package Core.lesson_1.demo_1;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString (exclude = {"id"})
public class User {
    private int id;
    private String name;
    private boolean status;
    private double weight;

    public String greetings(String msg) {
        return msg + " my name is - " + this.name;
    }
}
