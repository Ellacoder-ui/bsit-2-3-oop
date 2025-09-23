abstract class Pet {
    String name;
    int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void makeSound();

    public void displayInfo() {
        System.out.println("Pet Name: " + name + ", Age: " + age);
        makeSound();
    }
}
