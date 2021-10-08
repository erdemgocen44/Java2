package HalukHocaGithub._17_Abstract._10_Abstraction;

abstract class Animal {
    abstract void sound();

    Animal() {
        System.out.println("This is an Animal..");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Haw haw");
    }
}

class runClass {
    public static void main(String args[]) {
        Animal dog = new Dog();
        dog.sound();
    }
}




