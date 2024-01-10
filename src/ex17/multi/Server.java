package ex17.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(30000);
            Scanner sc = new Scanner(System.in);
            Socket socket = serverSocket.accept();  // accept 대기 중
            System.out.println("Client connect");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            new Thread(() -> {
                while (true) {
                    try {
                        String requestMsg = br.readLine();
                        System.out.println("Client  부터 받은 메세지 : " + requestMsg);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();

            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

            new Thread(() -> {
                while (true){
                    String keyboardMsg = sc.nextLine();
                    pw.println(keyboardMsg);
                }
            }).start();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
