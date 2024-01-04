package ex13;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        
        list.add("MILK");
        list.add("BREAD");
        list.add("BUTTER");
        list.add(1,"APPLE");    //  index : 1 에 삽입
        list.set(2,"WATERMELON");            //  index : 2 대체

        list.remove(3);                //  index : 3삭제

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
