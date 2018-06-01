package local.hal.ma42.androidjava.lesson3.ex02;

public class ImplementEx1 implements InterfaceExample {
    @Override
    public String getName() {
        return "私はImplementEx1です";
    }

    @Override
    public int fooTimes() {
        return NUM * 50;
    }

    @Override
    public String getComment() {
        return "ImplementEx1のコメントだよん";
    }

    @Override
    public void fooMethod() {
        int x = 1;
        int y = 1;
        int z = x + y;
    }

}
