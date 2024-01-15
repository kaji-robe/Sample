package javaapis.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSample {

    public static void main(String[] args) {
        // 初期化
        HashSet<String> huken = new HashSet<String>();

        // 都道府県を追加
        huken.add("東京都");
        huken.add("大阪府");
        huken.add("北海道");
        huken.add("広島県");
        huken.add("北海道"); // 北海道を2回追加しようとしている

        // 全ての要素を出力
        for (String str : huken) {
            System.out.println(str);
        }

        // 広島県が含まれている？
        if (huken.contains("広島県")) {
            System.out.println("広島県に行ったことがある");
        } else {
            System.out.println("広島県に行ったことがある");
        }

        // 群馬県が含まれている？
        if (huken.contains("群馬県")) {
            System.out.println("群馬県に行ったことがある");
        } else {
            System.out.println("群馬県に行ったことがない");
        }

        // 北海道を削除
        huken.remove("北海道");

        // 全ての要素を出力
        Iterator<String> iterator = huken.iterator();
        while (iterator.hasNext()) {
            String item = (String) iterator.next();
            System.out.println(item);
        }
    }

}