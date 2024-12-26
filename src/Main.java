public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Mery", "Cat", 3, true);
        Animal animal2 = new Animal("Luk", "Dog", 1, true);
        Animal animal3 = new Animal("Froggy", "Dog", 5, true);

        Animal.listAnimals();
    }
}