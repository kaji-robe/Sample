package javaapis.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class FileOutput {

    public static void main(String[] args) {
        try {
            // ファイルを追記モードで開く
            OutputStream os = new FileOutputStream("test.txt", true);

            // 書き込み操作を行なうオブジェクトを生成する
            OutputStreamWriter kakiko = new OutputStreamWriter(os);

            // ファイルへ追記する
            kakiko.write("kakikoファイルへ書き込みます。\n");

            // ファイルを閉じる
            kakiko.close();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}