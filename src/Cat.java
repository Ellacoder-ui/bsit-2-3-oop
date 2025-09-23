class Cat extends Pet {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow! Meow!");
    }
}
