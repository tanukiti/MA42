package local.hal.ma42.androidjava.lesson2.ex01;

public class Pig extends Animal {
    @Override
    public  String call() {
        return "ぶうぶう";
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("素晴らしい！");
    }

    public void eat() {
        System.out.println("うまい！");
    }
}
