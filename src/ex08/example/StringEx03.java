package ex08.example;

class ContractInfo {
    private int money;
    private final String addr;
    private String name;
    private String tel;
    private String email;

    public ContractInfo(int money, String addr, String name, String tel, String email) {
        this.money = money;
        this.addr = addr;
        this.name = name;
        this.tel = tel;
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContractInfo{" +
                "money=" + money +
                ", addr='" + addr + '\'' +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getMoney() {
        return money;
    }
    public String getAddr() {
        return addr;
    }
    public String getName() {
        return name;
    }
    public String getTel() {
        return tel;
    }
    public String getEmail() {
        return email;
    }
    void total(){

    }
}

public class StringEx03 {
    public static void main(String[] args) {
        // 문서 데이터는 : 으로 구분된다.
        // 0 : 계약금
        // 1 : 주소-+
        // 2 : 이름
        // 3 : 전화번호
        // 4 : 이메일
        String data = "100:서울분당:이창호:01033338888:hello@nate.com";
        String parse[] = data.split(":");

        int money = Integer.parseInt(parse[0]);
        String addr = parse[1];
        String name = parse[2];
        String tel = parse[3];
        String email = parse[4];

        ContractInfo contractInfo = new ContractInfo(money, addr, name, tel, email);

        // ContractInfo 객체의 toString() 메서드가 자동으로 호풀, 객체의 문자열이 출력.
        System.out.println(contractInfo);
    }
}