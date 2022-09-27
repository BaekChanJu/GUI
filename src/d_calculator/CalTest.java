	package d_calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalTest {

	//1.멤버변수선언
	JFrame f; //네모난 큰 활동프레임을 만들어줌
	JTextField tf; //숫자들을 입력할 네모난 칸 텍스트필드
	JButton[] bNum = new JButton[10]; //0~9 숫자 표현할 버튼
	JButton[] bOp =  new JButton[4]; //+ - * / 연산자를 표현할 버튼들
	JButton bEqual; // =


	String op[] = {"+","-","*","/"}; //연산자들을 칸에 표현하게 해줄변수
	
	int first, second; //숫자저장하는 변수
	String op1; //연산하는 변수


	//2.객체생성을위해생성자함수만들기
	CalTest(){
		f = new JFrame("유치원"); // 매개변수넣으면 크게 타이틀이됨
		tf = new JTextField(10); //매개변수는 텍스트필의 평균 10자 정도크기를 잡아줌
		bEqual = new JButton("="); //매개변수는 넣으면 버튼에 그모양이 뜸
		

		for(int i = 0 ; i<bNum.length; i++) {
			bNum[i] = new JButton(String.valueOf(i));//자료형을 스트링으로 바꿔준후
			//넘버 숫자들을 넣어준다
		}


		for(int i = 0 ; i<bOp.length; i++) {
			bOp[i] = new JButton(op[i]); //연산자 버튼들 값은 이미스트링이니
			//배열객체생성해서 넣어준다밥로
		}
		


	}// end of CalTest()






	//3. 화면구성 및 화면출력함수
	void addLayout() {
		f.setLayout(new BorderLayout());//동서남북 배치
		f.add(tf, BorderLayout.NORTH);
		
		JPanel pan = new JPanel();
		pan.setLayout(new GridLayout(5,3));

		//f.setLayout(new GridLayout(5,3)); 이게아니라 판대기 안에 넣어줘야함
		
		
		for(int i = 0; i<10; i++) {
			pan.add(bNum[i]); //숫자 1부터9는 for로 돌리기
		}
		pan.add(bOp[0]);
		pan.add(bNum[0]);
		pan.add(bEqual);
		pan.add(bOp[1]);
		pan.add(bOp[2]);
		pan.add(bOp[3]);
		
		f.add(pan, BorderLayout.CENTER);
		
	
		
		
		
		
		





		f.setBounds(100,100,500,350); //화면규격
		f.setVisible(true); //화면출력
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x버튼 누르면 콘솔창도 정지해주는기
	}//end of addLayout()




	//4.이벤트 처리
	void eventProc() {
		//숫자버튼이 눌렸을때의 경우
			//설명bNum의 저장된 요소들 만큼돌면 숫자들먼쿰 0~9만큼
		//이벤트를 처리할 수 있게 만들어주는것임  
		//JButton eBtn = (JButton)e.getSource() 울 사용해 
		//이벤트를 발생시킬에를 형변환해서 만들어주고 겟 셋 으로 얻고 출력한다
		for(int i = 0; i<bNum.length;i++) {
			bNum[i].addActionListener( new ActionListener()  { 
				public void actionPerformed(ActionEvent e) {

				JButton eBtn = 	(JButton)e.getSource();//이벤트가 발생한
				//컴포넌트(화면)의 참조를 얻어옴 > 이벤트가 발생한 얘
				//0~9버튼이 눌렸을때를 의미
				
				String su = eBtn.getText();
				//만약 11을 입력하면 앞에있는 1을 저장하고 그다음1을 입력받아서 하기위해
				tf.setText(tf.getText() + su);
				
				}

			});
		}
		
		
		//연산자 버튼이 눌렸을때 경우
		for(int i = 0; i<bOp.length;i++) {
			bOp[i].addActionListener( new ActionListener()  { 
				public void actionPerformed(ActionEvent e) {
					
				
					JButton eBtn1 = (JButton)e.getSource();
					op1 = eBtn1.getText(); //연산자가 눌러지면  po1에 저장
					first = Integer.parseInt(tf.getText()); //텍스트필드에 들어간
					//값을 형변환 해서저장
					tf.setText(""); //이걸 안해주면 숫자를 계속써준다
					//처음 값을 입력하고 초기화가 되고 다음값이 입력이 되어야하니까
					//setText 공백은 초기화의 의미를 담고있다 
					
					
				}
			});
		}
					
		
		// = 버튼이 눌렸을때
		bEqual.addActionListener( new ActionListener()  { 
			public void actionPerformed(ActionEvent e) {
				second = Integer.parseInt(tf.getText()); //= 눌러지는순간
				//다음값은 세컨에 저장을 할것이다
				int result = 0;
				
				switch(op1) {
				case "+" : result = first + second; break;
				case "-" : result = first - second; break;
				case "*" : result = first * second; break;
				case "/" : result = first / second; break;
				
				}
				tf.setText(String.valueOf(result));
				
						
			}

		});



	}//end of eventProc()




	public static void main(String[] args) {
		CalTest cal = new CalTest();
		cal.addLayout();
		cal.eventProc();

	}

}
