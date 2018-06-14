package local.hal.ma42.androidjava.lesson5.ex03;

public class UseAnimalDefinition {
    public static void main(String[] args) {
        AnimalDefinition pigDef = new AnimalDefinition();
        pigDef.setAnimal(new Pig());
        pigDef.print();

        AnimalDefinition dogDef = new AnimalDefinition();
        dogDef.setAnimal(new AnimalDefinition.AnimalInterface() {
            @Override
            public String getName() {
                return "ぽち";
            }

            @Override
            public String call() {
                return "ワンワン";
            }
        });
        dogDef.print();
    }

    private static class Pig implements AnimalDefinition.AnimalInterface {
        @Override
        public String getName() {
            return "トントン";
        }
        @Override
        public String call() {
            return "ぶうぶう";
        }
    }
}
