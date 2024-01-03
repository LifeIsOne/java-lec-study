package ex16;

class MyRunnable3 implements Runnable{
    String myName;
    public MyRunnable3(String name){
        myName = name;
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.print(myName + i + " ");
        }
    }
}

public class TestThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable3("A"));
        Thread t2 = new Thread(new MyRunnable3("B"));

        t1.start();
        t2.start();
    }
}
