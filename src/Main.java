public class Main {
    public static void main(String[] args) {
        //opret objekter af dyrene
        Animal dog = new Dog();
        Animal cat = new Cat();

        //kald makeSound-metoden
        dog.makeSound();
        cat.makeSound();
    }
}
