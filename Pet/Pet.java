package Pet;

public abstract class Pet {

    private String name;
    private int age;

    public Pet(String name, int age){

        if (name == null || name.isBlank() || name.isEmpty())
            throw new IllegalPetNameArgumentException(name);

        if (age <= 0)
            throw new IllegalArgumentException("Age has to be greater than 0");

        this.name = name;
        this.age = age;

    }
    
}
