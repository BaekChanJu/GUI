package hamberger0928;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

import b_info.PersonVO;

public class bSnakWrap extends JFrame {
	JButton snak, jumun, jangB, manu;
	
	
	
	bSnakWrap(){
    	
       
    	setBounds(300,150,350, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        initial();
        eventProc();
       
       
        
    }
    s
    void initial() {
    	jumun = new JButton("주문하기");
    	jangB = new JButton("장바구니");
    	manu = new JButton("메인메뉴로");
    	snak = new JButton();

    	
    	snak = new JButton("스낵랩 2900원", new ImageIcon("src//hamberger0928//imgs//snak.png"));
    	snak.setHorizontalTextPosition(JButton.CENTER);
    	snak.setVerticalTextPosition(JButton.BOTTOM);
		
		
		setLayout(new BorderLayout());
		add(snak , BorderLayout.CENTER);
		

		
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
    //ta.setText("스낵랩 2900원");
    

    
}