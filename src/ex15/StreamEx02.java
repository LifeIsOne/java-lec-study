package ex15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx02 {
    public static void main(String[] args) {
//        InputStream in = System.in;
//        InputStreamReader ir = new InputStreamReader(in);
        InputStreamReader ir = new InputStreamReader(System.in);    // ir 은 System.in(키보드)에 연결
        char[] ch = new char[4];        // Secondary Stream

        try {
            ir.read(ch);
            for (char c : ch)
                System.out.print(c + " ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
