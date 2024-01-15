package javaapis.datetime;

import java.time.LocalDateTime;

public class DateSample01 {

    public static void main(String[] args) {

        // 現在日時の取得と表示
        LocalDateTime hiduke = LocalDateTime.now();
        System.out.println(hiduke);

        // 現在の日時から一週間後を表示する
        LocalDateTime yokusyuu = hiduke.plusWeeks(1);
        System.out.println(yokusyuu);
 }
}