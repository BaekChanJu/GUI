package hamberger0928;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class bCheese extends JFrame {
	JButton chees, jumun, jangB, manu;
	
	bCheese(){
    	
       
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
    	chees = new JButton();

    	
    	chees = new JButton("치즈스틱 2700원", new ImageIcon("src//hamberger0928//imgs//chezz.png"));
    	chees.setHorizontalTextPosition(JButton.CENTER);
    	chees.setVerticalTextPosition(JButton.BOTTOM);
		
		
		setLayout(new BorderLayout());
		add(chees , BorderLayout.CENTER);
		

		
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
            	// new Jumun();
            	 dispose();
            }
        }); // end of addActionListener
        
        
        
        
    }
    
}
	



