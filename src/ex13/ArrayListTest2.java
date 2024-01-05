package ex13;

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banna");
        list.add("Mango");
        list.add("Pear");
        list.add("Avocado");

        int index = list.indexOf("Mango");  // ArrayList에 저장된 문자열들을 검색한다.

        System.out.println("Mango의 위치 : " + index);
    }
}
