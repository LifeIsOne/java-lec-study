package ex16;

class MyRunnable implements Runnable {          //  1. Runnable 인터페이스를 구현하기
    public void run(){                          //  2. run() 메소드 작성
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}

public class MyThreadTest2 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());    //  3. Thread 객체 생성, MyRunnable 객체를 인수로 전달
        t.start();                                  //  4. start() 호출
    }
}
