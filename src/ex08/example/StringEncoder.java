package ex08.example;

public class StringEncoder {
    public static String encodeString(String input) {
        StringBuilder encodedString = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                encodedString.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        // 마지막 문자 처리
        encodedString.append(input.charAt(input.length() - 1)).append(count);

        return encodedString.toString();
    }

    public static void main(String[] args) {
        String input = "AABBBCCCCDDDDD";
        String encodedString = encodeString(input);
        System.out.println(encodedString);
    }
}