package dev.kaps;

// An enum can provide us with a list of constants to use in our code, with public methods available for each constant, can provide us with quite a bit of functionality.
public enum Topping {

    MUSTARD,
    PICKLES,
    BACON,
    CHEDDAR,
    TOMATO;

    public double getPrice() {
        return switch (this) {
            case BACON -> 1.5;
            case CHEDDAR -> 1.0;
            default -> 0.0;
        };
    }
}
