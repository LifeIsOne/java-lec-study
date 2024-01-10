package ex17.half;

import java.awt.image.DataBufferDouble;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(20000);
            Socket socket = serverSocket.accept();  // accept 대기 중
            // 소켓 연결 완료

            // 버퍼 만들기
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            String requestMsg = br.readLine();
            System.out.println("Client로 부터 받은 메시지 : " + requestMsg);

            // 버퍼 만들기 (send) 동기적 실행. 응답 받으면 실행
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true, Charset.forName("UTF-8"));

            if (requestMsg.equals("1")){
                pw.println("영화");
            } else if (requestMsg.equals("2")) {
                pw.println("영화");
            }else{
                pw.println("프로토콜을 확인하세요 : 1은 영화, 2는 드라마");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
