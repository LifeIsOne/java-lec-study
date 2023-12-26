package ex07.example;

import javax.swing.*;
import java.awt.*;


public class MyFrame {

    static int num = 1;

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        //jf.setLayout(new FlowLayout());
        jf.setSize(300, 500);       // 사이즈 정하기

        JButton btn1 = new JButton("더하기");
        JButton btn2 = new JButton("빼기");
        JLabel la1 = new JLabel(num+"");

        jf.add("South",btn1);
        jf.add("North",btn2);
        jf.add("Center", la1);

        btn1.addActionListener(e -> {
            num ++;
            la1.setText(num + "");
        });
        btn2.addActionListener(e -> {
            num --;
            if (num < 0){
                num = 0;
            }
            la1.setText(num + "");
        });

        jf.setVisible(true);                    // 보여주기

    }
}
