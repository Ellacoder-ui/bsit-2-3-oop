public class Main {
    public static void main(String[] args) {
        // Creating instances of pets
        Pet buddy = new Dog("Buddy", 3);
        Pet whiskers = new Cat("Whiskers", 2);
        Pet tweety = new Bird("Tweety", 1);

        // Displaying pet info
        buddy.displayInfo();
        whiskers.displayInfo();
        tweety.displayInfo();

        // Creating instances of trainable pets
        Trainable dog = new Dog("Buddy", 3);
        Trainable bird = new Bird("Tweety", 1);

        // Training pets
        dog.performTrick();
        bird.performTrick();
    }
}
