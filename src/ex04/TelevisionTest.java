package ex04;

public class TelevisionTest{
    private int channel;
    private int volume;
    private boolean onOff;

    TelevisionTest(int c, int v, boolean o) {
        channel = c;
        volume = v;
        onOff = o;
    }

    void print() {
        System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
    }
    public static void main(String[] args) {
        TelevisionTest myTv = new TelevisionTest(7,10,true);
        myTv.print();
        TelevisionTest yourTv = new TelevisionTest(11,20,true);
        yourTv.print();
    }
}
