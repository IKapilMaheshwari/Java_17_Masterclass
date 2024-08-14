package dev.kaps;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        Animal animal = new Animal("animal", "big", 100);//This doesn't compile. Animal is abstract, and even though we have a constructor and fields, we can't create an instance of an abstract class. This is another advantage of an abstract class.
        Dog dog = new Dog("Wolf","big", 100);
        dog.makeNoise();//Howling!
        doAnimalStuff(dog);//Howling! Wolf walking

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepherd","big", 150));
        animals.add(new Fish("Goldfish","small", 1));
        animals.add(new Fish("Barracuda", "big", 75));
        animals.add(new Dog("Pug","small", 20));
        animals.add(new Horse("Clydesdale","large", 1000));

        for (Animal animal : animals) {
            doAnimalStuff(animal);
            if (animal instanceof Mammal currentMammal) {
                currentMammal.shedHair();
            }
        }
    }

    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");
    }
}
