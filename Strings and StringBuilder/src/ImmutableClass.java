// Superclass
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Animal makes a sound");
    }

    public String getName() {
        return name;
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name); // Call superclass constructor
    }

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class ImmutableClass {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        System.out.println("Dog name: " + dog.getName());
        dog.sound();
    }
}

