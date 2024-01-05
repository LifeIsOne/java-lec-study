package ex13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    int number;
    String name;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }
    public String toString(){
        return name;
    }

    public int compareTo(Student s){
        return s.number - number;
    }
}

public class SortTest {
    public static void main(String[] args) {
        Student array[] = {
                new Student(2, "이택조"),
                new Student(3, "배용길"),
                new Student(1, "영남회장")
        };
        List<Student> list = Arrays.asList(array);
        Collections.sort(list);
//        Collections.sort(list,Collections.reverseOrder());  // 역순으로 정렬
        System.out.println(list);
    }
}
