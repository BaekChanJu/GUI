package zMac;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Side extends JPanel{
	//JFrame f = new JFrame("Drink");
	JLabel la = new JLabel("맥카페 & 음료");
	JButton bcoke, bcokez, bsprite, biceAa, bVanilla, bMilk;
	
	JButton []menu = new JButton[6];
	String[] ma = {"스낵랩","맥윙","치즈스틱","맥너겟","감자튀김","코울슬로"};
	JButton []price = new JButton[6];
	int []pr = {3000,4000,2000,3500,2500,1900};

	
	MainTest parent;
	
	
	public Side (MainTest t) {
		parent = t;
		
		
		initial();
		addLayout();
		eventProc();

	}
	



	void initial() {
		for (int i=0; i<menu.length; i++) {				
			menu[i] = new JButton(ma[i]);
			
		}
		
		
		for (int i =0 ; i < price.length; i++) {
			price[i] = new JButton(String.valueOf(pr[i]));
		}
		
		menu[0] = new JButton("스낵랩  ₩3000", new ImageIcon("src//hamberger0928//imgs//snak.png"));
		menu[1] = new JButton("맥윙 제로  ₩4000" ,new ImageIcon("src//hamberger0928//imgs//mac.png"));
		menu[2] = new JButton("치즈스틱  ₩2000",new ImageIcon("src//hamberger0928//imgs//chezz.png"));
		menu[3] = new JButton("맥너겟  ₩3500",new ImageIcon("src//hamberger0928//imgs//macnu.png"));
		menu[4] = new JButton("감자튀김   ₩2500",new ImageIcon("src//hamberger0928//imgs//phota.png"));
		menu[5] = new JButton("코울슬로  ₩1900 ",new ImageIcon("src//hamberger0928//imgs//ko.png"));
		for (int i=0; i<menu.length; i++) {
		menu[i].setHorizontalTextPosition(JButton.CENTER);
		menu[i].setVerticalTextPosition(JButton.BOTTOM);
		}

		
	}
	void addLayout() {
		setLayout(new BorderLayout());
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(2,3));
		
		
		for (int i = 0; i<menu.length;i++) {
			center.add(menu[i]);
		}
		add(center, BorderLayout.CENTER);
		

	}
	
	
	
	void eventProc() {
		
		System.out.println(parent);

		System.out.println(ma);		System.out.println(parent.orderhistory);
		
		for(int i=0; i<menu.length; i++) { //배열로 선언했기 때문에 반드시 for문
			String num = Integer.toString(i);
			menu[i].addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					parent.orderhistory.append("\t"+ma[Integer.parseInt(num)] + " \t\t" + pr[Integer.parseInt(num)]+"\n");
					
					}
		});
	}
//        menu[0].addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//               openDialog();
//            } 
//        });// end of addActionListener
        
//        bcokez.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                new zCokez(); 
//            }
//        });// end of addActionListener
//        
//        biceAa.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                new zIceAa(); 
//            }
//        });// end of addActionListener
//        
//        bsprite.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                new zSprite(); 
//            }
//        });// end of addActionListener
//       
//        bVanilla.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                new zVanilla(); 
//            }
//        });// end of addActionListener
//       
//        bMilk.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                new zMilk(); 
//            }
//        });// end of addActionListener
				
		
	}
	
	
	

}


