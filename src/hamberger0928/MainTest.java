package hamberger0928;

import java.awt.BorderLayout;
import java.nio.ByteOrder;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class MainTest {
	
	JFrame f = new JFrame("사이드메뉴");
	JButton btn;
	JButton jumun = new JButton("주문");
	JTextArea ta = new JTextArea(10,50);
	
	SideMenu sideMenu; //사이드메뉴 만든 페이지를 가져온것이다
	
	
	
	
	MainTest(){
		btn = new  JButton("결제");
		sideMenu = new SideMenu(this); //이렇게 생성자를 만들어줘야 탭을 사용하기 가능하다 / 객체해줘야 뭐 사용이가능하지
	}
	
	
	void addLayout() {
		//사이드메뉴칸에서 다 만든걸 결국 탭으로 만드려는 것 코딩은 거기서 다완성됬으니 탭으로 불러와야한다
				f.setLayout(new BorderLayout());
				
		JPanel pan = new JPanel();
		pan.add(jumun);
		
		
		ta = new JTextArea(5,5);
		f.add(ta, BorderLayout.CENTER);
		
		
		
		JTabbedPane tab = new JTabbedPane(); //탭객체 생성
		tab.add("사이드메뉴", sideMenu ); //아까만든  sideMenu 객체 대입
		f.add(tab, BorderLayout.CENTER);
		
		
		f.setBounds(200,200,1000,800);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		

		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		
		MainTest test = new MainTest();
		test.addLayout();
		
	
		

	}

}
