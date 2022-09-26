package a_sample;


import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
//자바의 GUI(화면)
//AWT - 1.2 이전 , Swing - 1.2버전 이후
//스윙구별법은 대부분 클래스 앞에 J가 붙음
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//객체를 생성해서 하는방법 이즈어

//여기는 결국 멤버변수  선언하고
//객체를 만들어서 플레이를한다 생성자함수안에 객체를 만들어 출력구문에도 객체생성

public class ATest {
	
	
	JFrame f;
	JButton btn, unbtn;
	JCheckBox java , oracle; //다중선택을 만들때 여러개클릭가능,//반드시 하나만체킹하게
	JRadioButton men, women; //라디오버튼은 통신사나뭐나 하나만체크가능해야하는데
	//안묶으면 그냥 다중선택됨 이친구는
	
	JTextField tf; //한줄입력은 텍스트필드
	JTextArea ta; //여러줄입력은 텍스트에어리어
	
	
	
	ATest(){
		f = new JFrame("나의 첫창"); //타이틀이됌
		btn = new JButton("클릭");
		unbtn = new JButton("취소");
		java = new JCheckBox("자바");
		oracle = new JCheckBox("오라클");
		men = new JRadioButton("남자");
		women = new JRadioButton("여자");
		tf = new JTextField(20); //알파벳 평균 20개정도의 크기
		ta = new JTextArea(40,20); //즉 크기의 지정느낌
		
		//한번만 사용되고 말꺼라 그냥 지역변수로 만듬
		//이렇게그룹으로 묶어야 남자,여자 버튼중 하나만 클릭이 가능
		ButtonGroup group = new ButtonGroup(); //이거는 버튼 이중클릭 방지용
		group.add(men);
		group.add(women);
	}
	
	void addLayout() {
		//f.setLayout(new FlowLayout()); //이게 축약형
		//FlowLayout f1 = new FlowLayout();
		//f.setLayout(f1); //붙히는 방식을 정해주는것임 플로우레이아웃
		//이러면 덮어써서 안나옴  / 한줄에 배치하는방식
		
		//새로운붙히는 방식
		//f.setLayout(new GridLayout(3,3)); // 행,열로 배치하는방식
		f.setLayout(new BorderLayout()); // 동서남북 배치방식
		
		
		f.add(men, BorderLayout.NORTH); //이렇게 해주문 보더레이아웃 방향지정해서추력
		//f.add(women, BorderLayout.NORTH); //만일 동일한대해주면? 덮어씀
		//하나밖에 못들어가면 별로자나 
		JPanel pEast = new JPanel(); //판낼을 중간에 넣어주는거임
		pEast.add(men);
		pEast.add(women);
		f.add(pEast, BorderLayout.NORTH); //그 판대기를 넣어주면 여러개가 들어가는것
		
		//f.add(oracle);
		//f.add(btn); //붙히기 작업 출력전에 해주기
		f.add(unbtn);
		f.add(new JLabel("입력하세요")); //다른애들은 또써야하는데
		//이렇게 한번만 딱뜨고 끝나는애들은 변수생성안하고 한번에 가능
		f.add(tf);
		f.add(ta);
		
		
		
		f.setBounds(100,100,500,350); //화면규격
		f.setVisible(true); //화면출력
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x버튼 누르면 콘솔창도 정지해주는기능
	}

	public static void main(String[] args) {
		ATest a = new ATest();
		
		a.addLayout();

	}

}
