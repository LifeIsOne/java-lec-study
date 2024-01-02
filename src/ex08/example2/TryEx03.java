package ex08.example2;

// 책임 : 데이터베이스 상호작용
class Repository {
    String insert(String id, String pw){
        if (id.length() < 4){
            return "ID의 길이가 4자보다 짧습니다.";
        }
        System.out.println("레포지토리 insert 호출됨");
        return "DateBase에 정상 insert 됐습니다.";
    }
    void select(){

    }
}

// 책임 : 유효성 검사
class Controller {
    String join(String id, String pw){



        System.out.println("컨트롤러 회원가입 호출됨");
        Repository repo = new Repository();
        String message = repo.insert(id, pw);

        if (!message.equals("DateBase에 정상 insert 됐습니다.")){
            return message;
        }
        return "회원가입 완료.";
    }
    void login(){
        System.out.println("컨트롤러 로그인 호출됨");
    }
}

public class TryEx03 {
    public static void main(String[] args) {
        Controller con = new Controller();
        String message = con.join("Kenneth", "1243");
        System.out.println(message);
    }
}
