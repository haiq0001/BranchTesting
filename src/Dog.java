public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Wuf Wuf");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public boolean showMood(boolean happy) {
        if (happy) {
            System.out.println("Logrer");
        } else {
            System.out.println("Knurrer");

        }
        return happy;
    }
}



