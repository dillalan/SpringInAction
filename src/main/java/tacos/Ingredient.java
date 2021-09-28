package tacos;

import lombok.Data; // Lombok generate getters and setters on the runtime

@Data
public class Ingredient {
    private final String id = "";
    private final String name = "";
    private final Type type = null;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
