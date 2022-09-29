package z_과제;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MainTest {
	
	JFrame f = new JFrame("Drink"); //프레임 객체 생성과  Drink 타이틀
	
	JButton order, delete ; //	order, delete 버튼 변수
	
	JTextArea orderhistory = new JTextArea(40,20); //TextArea 칸 사이즈와 객체생성
	JTextField tf = new JTextField(); //TextField 객체생성
	
	Buger buger; //대표 메뉴들 변수선언
	Drink drink;
	Side side;
	
	int sumPrice = 0; //계산을 하기위한 변수선언
	
	MainTest(){
		
		order = new JButton("결제");		// 결제로 가기
		delete = new JButton("주문취소"); 	// area 에서 글삭제
		
		drink = new Drink(this); // this 값으로 넘겨주는것이다 그래서 아까 메인에서 사용가능
		buger = new Buger(this);
		side = new Side(this);
		
		orderhistory.setText("	상품		가격			결제금액\n\n");
		//에어리어창 맨위에 뜸
		
	}
	
	void addLayout() {
		f.setLayout(new BorderLayout());
		JPanel pan = new JPanel();
		pan.setLayout(new GridLayout(1,4,25,10));
		pan.add(order);
		pan.add(delete);
		pan.add(new JLabel("상품 총 결제금액 : ")); //아래 라벨에 글씨 추가
		pan.add(tf);
		f.add(pan, BorderLayout.SOUTH);
		
		f.add(orderhistory, BorderLayout.CENTER);
		
		JTabbedPane tab = new JTabbedPane();
		tab.addTab("Buger", buger);
		tab.addTab("Side", side);
		tab.addTab("Drink", drink);
		f.add(tab, BorderLayout.NORTH);
		
		f.setBounds(550, 100, 700, 850);
		f.setVisible(true);	
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void evnetProc() { //결제를 누르면 주문 클래스가 나옴
		order.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new Jumun();
           }
       }); // end of addActionListener
		
		//삭제누르면 텍스트에어리어 값과 총금액 더한것이 없어짐
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderhistory.setText(null);
				tf.setText(null);
				
			}
		});
		
		
	}

	public static void main(String[] args) {
		MainTest main = new MainTest();
		main.addLayout(); //사용하기 위해 객체생성
		main.evnetProc();
	}

}