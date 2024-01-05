package ex13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        String[] sample = { "i", "walk", "the", "line"};
        // 배열을 리스트로 변경-!
        List<String> list = Arrays.asList(sample);  // 정렬 알고리즘을 싱행하기 위해 asList() 메소드를 이용
        Collections.sort(list);     // Collections 인터페이스가 가지고 있는 정적 메소드 sort()를 호출하여 정렬 수행
        System.out.println(list);
    }
}