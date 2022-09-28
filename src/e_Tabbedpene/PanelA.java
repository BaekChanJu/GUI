package e_Tabbedpene;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelA extends JPanel{ //상속받으면 그냥 내가 JPanel
	
	
	JLabel aLa = new JLabel("판데기 A"); //딱히 집접 코딩없을시 직접 객체생성가능
	JButton aBtn = new JButton("A버튼");
	
	MainTest parent; //메인창에 있는 메인테스트를 패런츠 라는변수에 저장
	//다른부분에 서 가져올때는 변수선언하고 객체선언이 아닌
	//parent = mainTest; 주소값을 선언해준다 
	//메인테스트 창에서는 this 라고 가르키고 매개변수 칸에 매개변수를 넣어준다
	
	
	
	
	
	public PanelA(MainTest mainTest) {
		
		parent = mainTest; //객체생성이 아닌 주소값만 받아서 넣어주는것임
		setBackground(new Color(255,0,0)); //컴터에서 색상은 RGB(레드,그린,브루)
		//아무색 안넣으니 검정색나옴 빨강나오고싶으면 빨강에 255최대치 넣어주면됨
		addLayout();
		eventProc();
	}
	
	void addLayout() {
		//판대기 그냥 내자체가 판대기임 상속받아서
		add(aLa);
		add(aBtn);
		
	}
	
	void eventProc() {
		aBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parent.la.setText("안녕");
				
			}
		});

	}//end of eventProc
	
}
