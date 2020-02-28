package com.company;

public class Main {

    public static void main(String[] args) {
        for (String s : args) {
            printAnimalDescription(getAnimalsByType(s));
        }
    }

    private static Animal getAnimalsByType(String type) {
        switch (type.toLowerCase()) {
            case "кот":
                return new Cat();
            case "собака":
                return new Dog();
            case "корова":
                return new Cow();
            default:
                return new UnknownAnimal(type);
        }
    }

    private static void printAnimalDescription(Animal animal) {
        System.out.println(animal.getDescription());
    }
}
