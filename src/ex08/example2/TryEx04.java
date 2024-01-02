package ex08.example2;

// 약속 : 1은 정상, 2는 id 제약조건 실패, 3은 pw 제약조건 실패
// 책임 : 데이터베이스 상호작용
class Repository2 {
    void insert(String id, String pw) throws Exception{
        System.out.println("레포지토리 insert 호출됨");
        if (id.length() < 4) {
            throw new RuntimeException("DB : id길이가 너무 짧습니다. (4자 이상)");
        }
        if (pw.length() > 10) {
            throw new RuntimeException("DB : pw길이가 너무 길어요. (10자 이하)");
        }
    }
}

// 책임 : 유효성 검사
class Controller2 {
    void join(String id, String pw) throws Exception {
        System.out.println("컨트롤러 회원가입 호출됨");
        if (id.length() < 4) {
            throw new RuntimeException ("Controller : id길이가 너무 짧습니다. (4자 이상)");
        }

        Repository2 repo = new Repository2();
        repo.insert(id, pw);
    }
}

public class TryEx04 {
    public static void main(String[] args) {
        Controller2 con = new Controller2();
        try {
            System.out.println("회원가입 성공");
            con.join("ssra", "1234567890");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}