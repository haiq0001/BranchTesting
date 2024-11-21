public class Main {
    public static void main(String[] args) {
        //opret objekter af dyrene
        Animal dog = new Dog();
        Animal cat = new Cat();

        //kald makeSound-metoden
        dog.makeSound();
        cat.makeSound();

        cat.eat("catfood");
        dog.eat("dogfood");

        cat.showMood(true);
        cat.showMood(false);

        dog.showMood(true);
        dog.showMood(false);

    }
}
