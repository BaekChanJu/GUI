package e_Tabbedpene.copy;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelA extends JPanel{ //상속받으면 그냥 내가 JPanel
	
	
	JLabel aLa = new JLabel("판데기 A"); //딱히 집접 코딩없을시 직접 객체생성가능
	JButton aBtn = new JButton("A버튼");
	
	
	
	
	
	public PanelA() {
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
		
	}

}
