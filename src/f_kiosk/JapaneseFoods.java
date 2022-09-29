package f_kiosk;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JapaneseFoods extends JPanel {
	
	
	//MainKiosk parent;
	
	JButton bsnak, bmacW, bmacN, bfren;
	
	public JapaneseFoods(){
		
		bsnak = new JButton("스낵랩");
		bmacW = new JButton("맥윙");
		bmacN = new JButton("맥너겟");
		bfren = new JButton("감튀");
		
		//addLayout(); //아래 함수불러오기
	} //end JapaneseFoods
	
	void addLayout() {
		//스낵랩 메뉴세팅
		bsnak.setIcon(new ImageIcon("src//hamberger0928//imgs//snak.png"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
