package ex07.example;
// 만들어진 라이버르리를 사용하기
// 라이브러리 생성자가 만들어 놈
interface EventListener{
    void action();
}
class MyApp {
    public void click(EventListener l){
        l.action();
    }
}

// 개발자인 내가 만듬
//class Button implements EventListener {
//    @Override
//    public void action() {
//        System.out.println("회원가입 로직 실행");
//    }
//}



public class InterEx02 {
    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.click(() -> {
            System.out.println("회원가입 로직 실행2");
        });
    }
}
