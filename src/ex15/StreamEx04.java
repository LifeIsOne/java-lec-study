package ex15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class StreamEx04 {
    public static void main(String[] args) {
//        OutputStreamWriter ow = new OutputStreamWriter(System.out);
//        BufferedWriter bw = new BufferedWriter(ow);   // 두 줄은 너무 많소 한 줄로 합시다.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            bw.write("안녕하세요.\n");
            bw.flush();
            bw.write("처음만난 사람들도 안녕하세요.\n");
            bw.flush();
            bw.write("안녕안엲ㅇㅇ난하쎼요");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
