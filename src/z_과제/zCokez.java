package z_과제;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


	
	public class zCokez extends JFrame {
		JButton cokez, jumun, jangB, manu;
		
	    zCokez(){
	    	
	       
	    	setBounds(300,150,350, 350);
	        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	        setVisible(true);
	        initial();
	        eventProc();
	        
	    }
	    
	    void initial() {
	    	jumun = new JButton("주문하기");
	    	jangB = new JButton("장바구니");
	    	manu = new JButton("되돌아가기");
	    	cokez = new JButton();

	    	
			cokez = new JButton("Coca-Cola Zero  ₩1,500", new ImageIcon("src\\z_과제\\imgs\\콜라제로.png"));
			cokez.setHorizontalTextPosition(JButton.CENTER);
			cokez.setVerticalTextPosition(JButton.BOTTOM);
			
			
			setLayout(new BorderLayout());
			add(cokez , BorderLayout.CENTER);
			
	
			
			JPanel pan2 = new JPanel();
			pan2.setLayout(new GridLayout(1, 3,10,15));
			pan2.add(jumun);
			pan2.add(jangB);
			pan2.add(manu);
			add(pan2 , BorderLayout.SOUTH);
	    	
	    }
	    
	    void eventProc() {
	        manu.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	 dispose();
	            }
	        }); // end of addActionListener
	        
	        jumun.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	 new Jumun();
	            	 dispose();
	            }
	        }); // end of addActionListener
	        
	        
	        
	        
	    }
	    
	}
