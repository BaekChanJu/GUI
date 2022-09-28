package e_Tabbedpene;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

public class MainTest {
	
	JFrame f;
	JButton btn;
	JLabel la;
	
	PanelA  panelA;
	PanelB  panelB;
	PanelC  panelC;
	
	
	
	MainTest(){
		f= new JFrame("나의 창");
		btn = new JButton("확인");
		la = new JLabel("데이타");
		panelA= new PanelA(this);
		panelB= new PanelB();
		panelC= new PanelC();
		
		
	}
	
	void addLayout() {
		f.setLayout(new BorderLayout());
		
		f.add(btn, BorderLayout.EAST);
		f.add(la, BorderLayout.SOUTH);
		
		//위에 탭 테이블 만들기
		JTabbedPane tab = new JTabbedPane();
		tab.addTab("메인", panelA);
		tab.addTab("서브", panelB);
		tab.addTab("기타", panelC);
		
		f.add(tab, BorderLayout.CENTER);
		
		
		
		f.setBounds(100,100,50,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	void eventProcMain() {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panelA 라는 객체는 이미 만드었고
				//aLa 는 거기에 판데기라는 글이있으니
				//setText로 새로운값을넣어준다
				panelA.aLa.setText("welcome");
				
				
			}
		});

	}//end of eventProc
	
	

	public static void main(String[] args) {
		
		MainTest test = new MainTest();
		test.addLayout();
		test.eventProcMain();

	}

}
