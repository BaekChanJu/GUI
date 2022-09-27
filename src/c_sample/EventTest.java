package c_sample;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
//awt의 모든걸 가져온다해도 event는 다른폴더라 또다시 해줘야함
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;






//화면(JFrame)에 '확인' 버튼 하나 출력

public class EventTest {

	JFrame f;
	JButton btn;


	EventTest(){
		
		
		f= new JFrame("연습용첫창");
		btn = new JButton("확인");
		//2번 핸들러 객체생성
		MyHandler hdlr = new MyHandler();
		//3번 이벤트 발생할 컴포넌트와 연결(버튼과)
		btn.addActionListener(hdlr);
		
	}
	
	//1번 이벤트 핸들러 만들기 
	//	핸들러 - 즉 이벤트를처리하는 클래스를 하나만들기

	class MyHandler implements ActionListener{ //클래스안에 클래스 이너클래스 이벤트는 이너클래스로 활용함
		public void actionPerformed(ActionEvent e) {
			
			JOptionPane.showMessageDialog(null, "이벤트 발생");
					
		}
		
	}
	
	


	void addLayout() {
		
		f.setLayout(new BorderLayout());
		f.add(btn, BorderLayout.CENTER);
		
		
		f.setBounds(100,100,500,350); //화면규격
		f.setVisible(true); //화면출력
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	public static void main(String[] args) {
		EventTest e = new EventTest();
		e.addLayout();


		
		
		
		//이벤트 
		//-MouseEvent
		//-WindowEvent
		//-KeyEvent
		//-FocusEvent
		//-
		//-
		
		
		//ActionEvent : 자주 사용하는 이벤트 !
			//버튼클릭시, 메뉴클릭시, 리스트(콤보박스), 텍스트필드에서 엔터 쳤을때
	}

}
