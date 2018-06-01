package local.hal.ma42.androidjava.lesson4.ex03;

import jdk.nashorn.api.tree.Tree;

import java.util.HashMap;
import  java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SeveralMapSample {
    public static void main(String[] args) {
        String[] nos = {"05", "03", "09", "11", "01", "07"};
        String[] names = {"山田", "宮西", "中村", "長谷川", "三原", "斎藤"};
        HashMap<String, String> hashMap = new HashMap<>();
        TreeMap<String, String> treeMap = new TreeMap<>();
        LinkedHashMap<String, String> lHashMap = new LinkedHashMap<>();
        for(int i = 0; i < names.length; i++) {
            String no = nos[i];
            String name = names[i];
            hashMap.put(no, name);
            treeMap.put(no, name);
            lHashMap.put(no, name);
        }
        System.out.println("-------- HashMapの内容表示 --------");
        for(Map.Entry<String, String> element : hashMap.entrySet()) {
            System.out.println(element);
        }

        System.out.println("-------- TreeMapの内容表示 --------");
        for(Map.Entry<String, String> element : treeMap.entrySet()) {
            System.out.println(element);
        }

        System.out.println("----- LinkedHashMapの表示内容");
        for(Map.Entry<String, String> element : lHashMap.entrySet()) {
            System.out.println("element");
        }
    }
}
