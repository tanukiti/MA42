package local.hal.ma42.androidjava.lesson2.ex01;

public class CallAnimals {
    public static void main(String[] args) {
        Cat pet0 = new Cat();
        pet0.setName("たま");

        String name = pet0.getName();
        String call = pet0.call();
        System.out.println(name + ":" + call);

        Pig pet1 = new Pig();
        pet1.setName("とんこ");
        name = pet1.getName();
        call = pet1.call();
        System.out.println(name + ":" + call);
        pet1.eat();
        pet1.speak();

        Dog pet2 = new Dog();
        pet2.setName("ポチ");
        name = pet2.getName();
        call = pet2.call();
        System.out.println(name + ":" + call);
        pet2.run();
    }
}
