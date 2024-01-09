package ex17.oneway;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        // localhost = 127.0.0.1 -> Loopback
        try {
            Socket socket = new Socket ("127.0.0.1", 10000);   // ip, port

            Scanner sc = new Scanner(System.in);
            String msg = sc.nextLine();

            BufferedWriter bw = new BufferedWriter(                 // 버퍼 만듬
                    new OutputStreamWriter(socket.getOutputStream(), "UTF-8") // 보조스트림
            );

            bw.write (msg+"\n");
            bw.write (msg);
            bw.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();    // 틀린거 찾기
        }
    }
}
