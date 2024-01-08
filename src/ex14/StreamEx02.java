package ex14;

import java.util.Arrays;
import java.util.List;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int changeAge() {
        return age - 1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class StreamEx02 {
    public static void main(String[] args) {
        // User 3명 만들기
        User u1 = new User("홍길동", 20);
        User u2 = new User("장보고", 25);
        User u3 = new User("이순신", 30);

        // ArralyList에 User 담기
        List<User> Users = Arrays.asList(u1, u2, u3);

        // stream으로 순회하면서 map으로 가공하기
        List<User> newArr = Users.stream().map(u -> {
            u.changeAge();
            return u;
        }).toList();

        newArr.stream().forEach(user -> {
            System.out.println(user.getAge());
        });

    }
}
