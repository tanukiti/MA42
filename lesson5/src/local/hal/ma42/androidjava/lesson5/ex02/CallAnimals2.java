package local.hal.ma42.androidjava.lesson5.ex02;

public class CallAnimals2 {
    public static void main(String[] args) {
        AnimalInterface cat = new AnimalInterface() {
            @Override
            public String getName() {
                return "たま";
            }

            @Override
            public String call() {
                return "にゃあ";
            }
        };
        print(cat);

        print(new AnimalInterface() {
            @Override
            public String getName() {
                return "とんこ";
            }
            @Override
            public String call() {
                return "ぶうぶう";
            }
        });
    }



    private static void print(AnimalInterface animal) {
        System.out.println(animal.getName() + ": " + animal.call());
    }
}
