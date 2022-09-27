package b_info3;


//임포트 영역
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;




public class InfoView {
	//1.멤버변수선언라인
	JFrame f;
	JTextField tfName, tfId, tfTel, tfGender, tfHome;
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	
	
	
	
	//2.멤버변수 객체생성은 생성자 안쪽
	InfoView(){
		f = new JFrame("DBTest"); //타이틀이름,f변수로 사용
		
		tfName = new JTextField(10); //한줄입력객체생성, 크기지정
		tfId = new JTextField(10);
		tfTel = new JTextField(10);
		tfGender = new JTextField(10);
		tfHome = new JTextField(10);
		
		ta = new JTextArea(40,20);//여러줄입력객체생성, 크기지정
		
		bAdd = new JButton("Add"); //버튼만들기 객체생성, 버튼이름설정
		bShow = new JButton("Show");
		bSearch = new JButton("Search");
		bDelete = new JButton("Delete");
		bCancel = new JButton("Cancel");
		bExit = new JButton("Exit");
	} 
	
	
	
	
	//3.화면구성하고 출력하는 함수
		//전체프레임은 BorderLayout으로 지정하세용
	//웨스트 -  JPanel 이용하기(왼쪽) / 근데 행열로 해줘야함 (GridLayout)6,2
	//센터 - 에어리어
	//사우스 - JPanel 이용하기 / 그리드 쓸꺼면 1,6으로
	
	
 	public void addLayout() {
 		//전체프레임을 지정하기위한 BorderLayout 사용
 		f.setLayout(new BorderLayout());
 		
 		//1.버튼
 		JPanel pSouth = new JPanel(); //버튼들 판때기 대주기
 		f.add(pSouth, BorderLayout.SOUTH); //아래클릭바
 		
 		pSouth.add(bAdd);
 		pSouth.add(bShow);
 		pSouth.add(bSearch);
 		pSouth.add(bDelete);
 		pSouth.add(bCancel);
 		pSouth.add(bExit);
 		
 		
 		
 		 
 		
 		
 		//2.왼쪽한줄입력부분
 		JPanel pWest = new JPanel();
 		pWest.setLayout(new GridLayout(6,2)); //전체규격만들고 , 안에따로사용가능
 		f.add(pWest, BorderLayout.WEST);
 		
 		pWest.add(new JLabel("Name", JLabel.CENTER));//어차피 한번지정해놓으면 안쓸꺼니 변수선언안하고 바로 생성가능
		//위 녀석의 역활은 그칸에 모형을 만들어주는것이고
 		pWest.add(tfName); //모형만들었으니 출력구문이 필요
 		
 		pWest.add(new JLabel("ID", JLabel.CENTER));
 		pWest.add(tfId);
 		
 		pWest.add(new JLabel("Tel", JLabel.CENTER));
 		pWest.add(tfTel);
 		
 		pWest.add(new JLabel("Gender", JLabel.CENTER));
 		pWest.add(tfGender);
 		
 		pWest.add(new JLabel("Home", JLabel.CENTER));
 		pWest.add(tfHome);
 		
 		
 		
 		//3.여러줄 센터부분
 		f.add(ta,  BorderLayout.CENTER); //센터
 		
 		
 		//4.기본규격 만들기
 		f.setBounds(100,100,500,350); //창 사이즈 규격
 		f.setVisible(true); //실행은 true
 		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		// 빨간정지버튼 누르지 않아도 자동 종료해줌
	}

	public static void main(String[] args) {
		
		InfoView info = new InfoView();
		info.addLayout();

	}

}


