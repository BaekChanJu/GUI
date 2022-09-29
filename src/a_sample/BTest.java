package a_sample;

import javax.swing.JButton;
//객체를 생성해서 하는방법 이즈어
//내가 그냥 객체가 되버리는 방법 해즈어
import javax.swing.JFrame;

public class BTest extends JFrame {  //JFrame 은 파이널이 안붙어서 상속이 가능함 그럼 
	//BTest 는 걍  JFrame
	
	
	JButton btn;
	
	BTest(){
		super("나의 두번째창");// 상속되었기때문에 여기선 부모꺼 불러오기
		 btn = new JButton("확인2");
	}
	
	void addLayout() {
		add(btn); //부모에 이미 상속받아서 그냥 써도됌
		
		//부모꺼는 객체생성없이 그냥 가져다쓰면됨 ㄴ
		setBounds(100,100,500,350);
		setVisible(true); //화면출력
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		BTest b = new BTest();
		
		b.addLayout();

	}

}
