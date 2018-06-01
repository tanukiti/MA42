package local.hal.ma42.androidjava.lesson3.ex02;

public class ImplementEx2 implements InterfaceExample {
    @Override
    public String getName() {
        return "私はImplementEx2です";
    }

    @Override
    public int fooTimes() {
        return NUM * 25;
    }

    @Override
    public String getComment() {
        return "ImplementEx2のコメンタだよん";
    }

    @Override
    public void fooMethod() {}
}
