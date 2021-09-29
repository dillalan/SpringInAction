package tacos;

import lombok.Data; // Lombok generate getters and setters on the runtime

@Data
public class Ingredient {
    private final String id = "";
    private final String name = "";
    private final Type type = null;

    //For some reason lombok is not working, if/when it works we can erase the getters and constructor
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public Ingredient(String id, String name, Type type) {
    }

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
