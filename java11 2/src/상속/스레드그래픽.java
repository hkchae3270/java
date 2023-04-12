package 상속;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 스레드그래픽 extends JFrame {
	// add(), setSize() ,,,,,,..
	JLabel count, image, time; //전역변수 선언!
	
	public static void main(String[] args) {
		스레드그래픽 f = new 스레드그래픽(); //---1
		//객체생성시 클래스 이름과 동일한 메서드를 자동호출
		//==> 생성자 메서드!!를 자동호출
	}

	public 스레드그래픽() { //--2
		setTitle("내 스레드 그래픽");
		setSize(500, 250);
		getContentPane().setBackground(Color.green);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		Font font = new Font("궁서", Font.BOLD, 30);
		count = new JLabel("카운터");
		ImageIcon icon = new ImageIcon("1.png");
		image = new JLabel(icon);
		time = new JLabel("시분초");
		count.setFont(font);
		time.setFont(font);
		add(count);
		add(image);
		add(time);
		
		//스레드 객체 3개 만들어서 start!!시켜보자.!!
		타이머스레드 count2 = new 타이머스레드();
		이미지스레드 image2 = new 이미지스레드();
		카운트스레드 time2 = new 카운트스레드();
		
		count2.start();
		image2.start();
		time2.start();
		
		setVisible(true);
	}
}






