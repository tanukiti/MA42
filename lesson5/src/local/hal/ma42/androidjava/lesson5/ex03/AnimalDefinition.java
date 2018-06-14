package local.hal.ma42.androidjava.lesson5.ex03;

import local.hal.ma42.androidjava.lesson5.ex02.AnimalInterface;

public class AnimalDefinition {
    interface AnimalInterface {
        String getName();

        String call();
    }

    private AnimalInterface _animal;


    public void setAnimal(AnimalInterface animal) {
        _animal = animal;
    }

    public void print() {
        System.out.println(_animal.getName() + ": " + _animal.call());
    }
}
