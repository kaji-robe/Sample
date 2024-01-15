package  javaapis.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateSample02 {

    public static void main(String[] args) {
        // 現在日時の取得と表示
        LocalDateTime hiduke = LocalDateTime.now();

        // 日付のフォーマット
        DateTimeFormatter seiri = DateTimeFormatter.ofPattern("yy/MM/dd");
        String yymmdd = hiduke.format(seiri);
        System.out.println(yymmdd);
    }
}