package ex04;

public class MyMath {
    // *중복정의 : 메소드 이름이 동일해도, 매개 변수만 다르면 된다
    int add(int x, int y)               {   return x+y;     }
    int add(int x, int y, int z)        {   return x+y+z;   }
    int add(int x, int y, int z, int w) {   return x+y+z+w; }

    public static void main(String[] args) {
        MyMath obj = new MyMath();
        System.out.print(obj.add(10,20) + " ");
        System.out.print(obj.add(10,20,30) + " ");
        System.out.print(obj.add(10,20,30,40) + " ");
    }
}
