package local.hal.ma42.androidjava.lesson5.ex02;

public class CallAnimals {
    public static void main(String[] args) {
        Cat cat = new Cat();
        print(cat);

        print(new Pig());
    }

    private static void print(AnimalInterface animal) {
        System.out.println(animal.getName() + ":" + animal.call());
    }

    private static class Cat implements AnimalInterface {
        @Override
        public String getName() {
            return "たま";
        }
        @Override
        public String call() {
            return "にゃあ";
        }
    }

    private static class Pig implements AnimalInterface {
        @Override
        public String getName() {
            return "とんこ";
        }
        @Override
        public String call() {
            return "ぶうぶう";
        }
    }
}
