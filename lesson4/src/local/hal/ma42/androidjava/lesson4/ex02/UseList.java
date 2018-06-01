package local.hal.ma42.androidjava.lesson4.ex02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseList {
    public static void main(String[] args) {
        List<Integer> stock = new ArrayList<>();

        System.out.println("登録前: 要素数は全部で" + stock.size() + "コです。");
        System.out.println("リストは現在空ですか？:　" + stock.isEmpty());

        stock.add(54);
        stock.add(24);
        stock.add(47);
        stock.add(0);
        stock.add(6);
        stock.add(24);
        stock.add(85);
        stock.add(1);
        stock.add(5);
        stock.add(6);
        stock.add(98);
        stock.add(47);
        stock.add(54);
        stock.add(96);
        stock.add(9);

        System.out.println("登録後: 要素数は全部で" + stock.size() + "コです。");
        System.out.println("リストは現在空ですか?: " + stock.isEmpty());

        System.out.println("インデックス8の値: " + stock.get(8));
        System.out.println("値1は」含まれていますか?: " + stock.contains(1));
        System.out.println("値1のインデックスは?: " + stock.indexOf(1));

        System.out.println("-------中身を見てみよう--------");
        for(Iterator<Integer> ite = stock.iterator(); ite.hasNext();) {
            Integer element = ite.next();
            System.out.println(element);
        }
        System.out.println("いくつか値が重複している所に注目。");

        stock.remove(8);

        System.out.println("削除後: 要素数は全部で" + stock.size() + "コです。");
        System.out.println("---------もう一度中身を見てみよう ----------");
        for(Integer element : stock) {
            System.out.println(element);
        }

        stock.add(12, 346);

        System.out.println("登録後: 要素数は全部で" + stock.size() + "コです。");
        System.out.println("---------もう一度中身を見てみよう ----------");
        for(Integer element : stock) {
            System.out.println(element);
        }
    }
}
