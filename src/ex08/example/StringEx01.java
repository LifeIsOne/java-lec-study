package ex08.example;

public class StringEx01 {

    public static String encoding(String data) {

        // 몇 개인지 세기
        int count = 0;
        for (int i = 1; i < data.length(); i++) {
            if (data.charAt(i) == data.charAt(i-1)){
                count++;
            }else {

                count = 1;
            }
        }


        return "A2B3C4D5";
    }

    public static String decoding(String encodingData) {


        return "AABBBCCCCDDDDD";
    }

    public static void main(String[] args) {
        // 인코딩 A2B3C4D5
        String data = "AABBBCCCCDDDDD"; // Byte -> 14Byte
        System.out.println(encoding(data));
        
        
        // 디코딩 AABBBCCCCDDDDD
        String data2 = "A2B3C4D5";
        System.out.println(decoding(data));

    }
}