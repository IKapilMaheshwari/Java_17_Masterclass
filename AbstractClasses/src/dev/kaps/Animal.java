package dev.kaps;

abstract class Mammal extends Animal {

    public Mammal(String type, String size, int weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        System.out.print(getExplicitType() + " ");
        System.out.println(speed.equals("slow")?"walks":"runs");
    }

    public abstract void shedHair();//This is the structure of an abstract method.
}

public abstract class Animal {

    protected String type;
    private String size;
    private int weight;

    public Animal(String type, String size, int weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed);//abstract methods can't have bodies
    public abstract void makeNoise();//When you declare abstract methods, this means you don't provide any default behavior for our subclasses.
    //Another thing you can't do is have an abstract method that's private.
    public final String getExplicitType() {//But if I went to our Dog class and decided I wanted to create my own version of getExplicitType, I actually can't do it because of added final modifier.
        return getClass().getSimpleName() + " (" + type + ")";//a concrete method on an abstract class, with a body.
    }
    //final keyword -->  For a method, a subclass can't override it. So, the final method is final and cannot be overridden. This isn't specific to an abstract class
}
