package ex06;

class Car {
    int speed;                          // 속도

    public void setSpeed(int speed) {   // 속도 변경 메소드
        this.speed = speed;
    }
}

class ElectricCar extends Car {         // 상속
    int battery;                        // 추가된 필드

    public void charge(int amount){     // 충전 메소드 → 추가된 메소드
        battery += amount;
    }
}

public class ElectricCarTest {
    public static void main(String[] args) {
        ElectricCar obj = new ElectricCar();    // 자식 클래스 객체 생성
        obj.speed = 10;                         // 부모 클래스의 필드, 메소드 사용
        obj.setSpeed(60);
        obj.charge(10);                 // 자체 메소드 사용
    }
}
