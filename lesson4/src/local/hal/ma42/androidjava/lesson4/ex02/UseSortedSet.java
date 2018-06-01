package local.hal.ma42.androidjava.lesson4.ex02;

import java.util.SortedSet;
import java.util.TreeSet;

public class UseSortedSet {
    public static void main(String[] args) {
        SortedSet<Integer> stock = new TreeSet<>();

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

        System.out.println("要素は" + stock.size() + "コです。");
        System.out.println("-------中身を見てみよう--------");
        for(Integer element : stock) {
            System.out.println(element);
        }
    }
}
