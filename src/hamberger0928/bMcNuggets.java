package hamberger0928; // bMcNuggets



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


	
	public class bMcNuggets extends JFrame {
		JButton mcN, jumun, jangB, manu;
		
		bMcNuggets(){
	    	
	       
	    	setBounds(300,150,350, 350);
	        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	        setVisible(true);
	        initial();
	        eventProc();
	        
	    }
	    
	    void initial() {
	    	jumun = new JButton("주문하기");
	    	jangB = new JButton("장바구니");
	    	manu = new JButton("메인메뉴로");
	    	mcN = new JButton();

	    	
	    	mcN = new JButton("맥너겟 2000원", new ImageIcon("src//hamberger0928//imgs//macnu.png"));
	    	mcN.setHorizontalTextPosition(JButton.CENTER);
	    	mcN.setVerticalTextPosition(JButton.BOTTOM);
			
			
			setLayout(new BorderLayout());
			add(mcN , BorderLayout.CENTER);
			
	
			
			JPanel pan2 = new JPanel();
			pan2.setLayout(new GridLayout(1, 3,10,15));s
			pan2.add(jumun);
			pan2.add(jangB);s
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
	            	// new Jumun();
	            	 dispose();
	            }
	        }); // end of addActionListener
	        
	        
	        
	        
	    }
	    
	}