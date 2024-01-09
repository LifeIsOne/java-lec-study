package ex15;
// 663p 예제 15-9

import java.io.*;


public class CopyLines {
    public static void main(String[] args) throws IOException{

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("D:\\workspace\\java_lec\\out\\production\\java_lec\\ex15\\input.txt"));
            outputStream = new PrintWriter(new FileWriter("D:\\workspace\\java_lec\\out\\production\\java_lec\\ex15\\output.txt"));
            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
            }
        } finally {
            if (inputStream != null) {  inputStream.close(); }
            if (outputStream != null) { outputStream.close();}
        }
    }
}
