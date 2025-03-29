interface Flyable {
    void fly();
}

abstract class Animal {
    public abstract void makeSound();
}

class Lion extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Lion roars!");
    }
}

class Eagle extends Animal implements Flyable {

    @Override
    public void makeSound() {
        System.out.println("Eagle screeches!");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is soaring high in the sky!");
    }
}

public class WildlifeSimulation {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal eagle = new Eagle(); 
        Flyable flyingEagle = new Eagle(); 
        lion.makeSound();
        eagle.makeSound();
        if (eagle instanceof Flyable) {
            ((Flyable) eagle).fly();
        }
        flyingEagle.fly();
    }
}