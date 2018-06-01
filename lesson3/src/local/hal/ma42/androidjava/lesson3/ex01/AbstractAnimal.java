package local.hal.ma42.androidjava.lesson3.ex01;

public abstract class AbstractAnimal {
    private String _name;

    public void setName(String name) {
        _name = name;
    }

    public String getName() {
        return _name;
    }

    public abstract String call();
}
