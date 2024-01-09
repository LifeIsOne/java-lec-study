package ex17.oneway;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocker = new ServerSocket(10000);    // 포트번호 : 10000
            Socket socket = serverSocker.accept();  // 리스너
            System.out.println("클라이언트 연결됨.");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream(), "UTF-8")
            );

            while (true){
                String msg = br.readLine();

                if (msg == null) break;

                System.out.println(msg);
            }

            String msg = br.readLine();
            System.out.println(msg);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
