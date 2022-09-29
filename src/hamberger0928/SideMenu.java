package hamberger0928;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;




public class SideMenu extends JPanel {

	
	JLabel la = new JLabel("맥 사이드메뉴"); //그냥 탭아래 라벨을 의미
	JButton bSnakWrap, bMcWings, bCheese, bMcNuggets, bFrench, bColeslaw  ;
	
	MainTest mt;
	
	
	



	SideMenu(MainTest ma){
		mt = ma;
		sideImgs();
		sideMenuChanju();
		eventProc();
	

	}



	void sideImgs() {
		bSnakWrap = new JButton("스낵랩 2900원", new ImageIcon("src//hamberger0928//imgs//snak.png"));
		bSnakWrap.setHorizontalTextPosition(JButton.CENTER);
		bSnakWrap.setVerticalTextPosition(JButton.BOTTOM);

		bMcWings = new JButton("맥윙 5500원", new ImageIcon("src//hamberger0928//imgs//mac.png"));
		bMcWings.setHorizontalTextPosition(JButton.CENTER);
		bMcWings.setVerticalTextPosition(JButton.BOTTOM);
		

		bCheese = new JButton("치즈스틱 2700원", new ImageIcon("src//hamberger0928//imgs//chezz.png"));
		bCheese.setHorizontalTextPosition(JButton.CENTER);
		bCheese.setVerticalTextPosition(JButton.BOTTOM);

		bMcNuggets = new JButton("맥너겟 2000원", new ImageIcon("src//hamberger0928//imgs//macnu.png"));
		bMcNuggets.setHorizontalTextPosition(JButton.CENTER);
		bMcNuggets.setVerticalTextPosition(JButton.BOTTOM);

		bFrench = new JButton("감자튀김 1700원", new ImageIcon("src//hamberger0928//imgs//phota.png"));
		bFrench.setHorizontalTextPosition(JButton.CENTER);
		bFrench.setVerticalTextPosition(JButton.BOTTOM);

		bColeslaw = new JButton("코울슬로 1900원", new ImageIcon("src//hamberger0928//imgs//ko.png"));
		bColeslaw.setHorizontalTextPosition(JButton.CENTER);
		bColeslaw.setVerticalTextPosition(JButton.BOTTOM);
		
	}


	void sideMenuChanju() {
		setLayout(new BorderLayout()); //BorderLayout먼저선언
		add(la, BorderLayout.NORTH);//맥 사이드메뉴 라는 라벨을 맨위로올림
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2,3));
		
		
		p.add(bSnakWrap);
		p.add(bMcWings);
		p.add(bCheese);
		p.add(bMcNuggets);
		p.add(bFrench);
		p.add(bColeslaw);
		add(p, BorderLayout.NORTH);
		
	
		
		
		
		
		}//end of sideMenuChanju
	
	void eventProc() { // 
		bSnakWrap.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            //	new bSnakWrap();
            	mt.ta.append("스낵랩 3700원"+"\n");
           }
       }); // end of addActionListener
		bCheese.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	//new bCheese();
            	mt.ta.append("스낵랩 3700원"+"\n");
            	
           }
       }); // end of addActionListener
		bMcWings.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	//new bMcWings();
            	mt.ta.append("스낵랩 3700원"+"\n");
           }
       }); // end of addActionListener
		bColeslaw.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	//new bColeslaw();
            	mt.ta.append("스낵랩 3700원"+"\n");
           }
       }); // end of addActionListener
		bMcNuggets.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	//new bMcNuggets();
            	mt.ta.append("스낵랩 3700원"+"\n");
           }
       }); // end of addActionListener
		bFrench.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	//new bFrench();
            	mt.ta.append("스낵랩 3700원"+"\n");
           }
       }); // end of addActionListener
		
	} // enf eventProc()
	
	
	
	

		
		
	}//end of eventProc//class main
	

