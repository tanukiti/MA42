package local.hal.ma42.androidjava.lesson2.ex01;

public class CallAnimals2 {
    public static void main(String[] args) {
        Animal[] pets = new Animal[3];
        pets[0] = new Cat();
        pets[0].setName("たま");
        pets[1] = new Pig();
        pets[1].setName("とんこ");
        pets[2] = new Dog();
        pets[2].setName("ポチ");

        for(Animal pet : pets) {
            String name = pet.getName();
            String call = pet.call();
            System.out.println(name + ":" + call);
        }
     //   pets[1].eat();
        pets[1].speak();
    }
}
