package local.hal.ma42.androidjava.lesson3.ex01;

public class CallAnimals {
    public static void main(String[] args) {
        AbstractAnimal[] pets = new AbstractAnimal[2];

        pets[0] = new Cat();
        pets[1] = new Dog();

        pets[0].setName("たま");
        pets[1].setName("しろ");

        for(int i = 0; i < pets.length; i++) {
            String name = pets[i].getName();
            String call = pets[i].call();
            System.out.println(name +":" + call);
        }
    }
}
