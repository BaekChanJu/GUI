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

public class EventTest3 {

	JFrame f;
	JButton btn;


	EventTest3(){
		
		
		f= new JFrame("연습용첫창");
		btn = new JButton("확인");

		//1,2,3번 다 축약형한거임
		//그냥 이벤트 처리시 이거 복사해서 쓰면됨 앞에만 바꾸면되니깡
		btn.addActionListener( new ActionListener()  { 
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "이벤트 발생3");			
			}
			
		});
		
	}
	



	void addLayout() {
		
		f.setLayout(new BorderLayout());
		f.add(btn, BorderLayout.CENTER);
		
		
		f.setBounds(100,100,500,350); //화면규격
		f.setVisible(true); //화면출력
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	public static void main(String[] args) {
		EventTest3 e = new EventTest3();
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
