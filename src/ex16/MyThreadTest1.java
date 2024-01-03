package ex16;

class MyThread extends Thread{              //  1. Thread를 상속받기
    public void run(){                      //  2. run() 메소드를 재정의
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}

public class MyThreadTest1 {
    public static void main(String[] args) {
        Thread t = new MyThread();          // 3. Thread 객체 생성
        t.start();                          // 4. start() 메소드를 호출 -> 스레드 시작
    }
}
