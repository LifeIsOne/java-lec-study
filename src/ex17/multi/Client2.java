package ex17.multi;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost", 30000);
            Scanner sc = new Scanner(System.in);
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);


            while (true){
                System.out.print("Server에 전송할 메세지 : ");
                String keyboardMsg = sc.nextLine();
                pw.println(keyboardMsg);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}