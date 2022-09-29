package zMac;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MainTest {
	
	JFrame f = new JFrame("Side");
	Side side;
	JButton order, delete;		// 결제 버튼 
	JTextArea orderhistory = new JTextArea(40,20); /// 장바구니 클릭시 메뉴 가격 출력
	
	
	
	MainTest(){
		
		order = new JButton("결제");		// 결제으로 가기
		delete = new JButton("주문취소"); 	// area 에서 글삭제
		side = new Side(this);
		
		orderhistory.setText("	상품		가격			결제금액\n\n");
		
	}
	
	void addLayout() {
		f.setLayout(new BorderLayout());
		JPanel pan = new JPanel();
		pan.setLayout(new GridLayout(1,2,50,10));
		pan.add(order);
		pan.add(delete);
		f.add(pan, BorderLayout.SOUTH);
		
		f.add(orderhistory, BorderLayout.CENTER);
		
		JTabbedPane tab = new JTabbedPane();
		tab.addTab("Drink", side);
		f.add(tab, BorderLayout.NORTH);
		
		f.setBounds(550, 100, 700, 850);
		f.setVisible(true);	
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void evnetProc() {
		order.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	//new Jumun();
           }
       }); // end of addActionListener
		
		
	}

	public static void main(String[] args) {
		MainTest main = new MainTest();
		main.addLayout();
		main.evnetProc();
	}

}
