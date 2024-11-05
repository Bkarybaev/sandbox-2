public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.name = "rew";
        cat.color = "red";
        cat.age = 3;
        System.out.println(cat.geInfo());

        Cat cat1 = new Cat("rut","blue",4);
        System.out.println(cat1.geInfo());

        Dog dog = new Dog();
        dog.name = "white breast";
        dog.color = "white";
        dog.age = 13;
        System.out.println(dog.geInfo());

        Dog dog1 = new Dog("alabay","yellow", (byte) 5);
        System.out.println(dog1.geInfo());
    }
}