package b_info4;


//임포트 영역
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;




public class InfoView {
	//1.멤버변수선언라인
	JFrame f;
	JTextField tfName, tfId, tfTel, tfGender, tfHome, tfAge;
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
		tfAge = new JTextField(10);

		ta = new JTextArea(40,20);//여러줄입력객체생성, 크기지정

		bAdd = new JButton("Add"); //버튼만들기 객체생성, 버튼이름설정
		bShow = new JButton("Show");
		bSearch = new JButton("Search");
		bDelete = new JButton("Delete");
		bCancel = new JButton("Cancel");
		bExit = new JButton("Exit(alt + x)", //단축키 추가도 가능
				new ImageIcon("src\\b_info\\imgs\\20220927_094322.png"));
		bExit.setHorizontalTextPosition(JButton.CENTER); //수평
		bExit.setVerticalTextPosition(JButton.BOTTOM);//수직
		bExit.setRolloverIcon(
				new ImageIcon("src\\b_info\\imgs\\20220927_094355.png"));//아이콘올리면변경
		bExit.setPressedIcon(
				new ImageIcon("src\\b_info\\imgs\\20220927_094405.png"));//아이콘클릭시변경
		bExit.setToolTipText("프로그램종료"); //마우스대고 기다리면 넣은 단어가 뜸
		bExit.setMnemonic('x'); //(alt + x) 이뜻 효과가뜸 종료가되진않음 코드안짜서 눌러진효과만나옴
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

		pWest.add(new JLabel("age", JLabel.CENTER));
		pWest.add(tfAge);




		//3.여러줄 센터부분
		f.add(ta,  BorderLayout.CENTER); //센터


		//4.기본규격 만들기
		f.setBounds(100,100,500,350); //창 사이즈 규격
		f.setVisible(true); //실행은 true
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 빨간정지버튼 누르지 않아도 자동 종료해줌
	}


	public void eventProc() {
		//ADD 버튼 눌렸을때 이벤트처리
		bAdd.addActionListener( new ActionListener()  { 
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Add 버튼클릭");			
			}

		});
		bShow.addActionListener( new ActionListener()  { 
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Show 버튼클릭");			
			}

		});
		bSearch.addActionListener( new ActionListener()  { 
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Search 버튼클릭");			
			}

		});
		bDelete.addActionListener( new ActionListener()  { 
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Delete 버튼클릭");			
			}

		});
		bCancel.addActionListener( new ActionListener()  { 
			public void actionPerformed(ActionEvent e) {
				clearTextfield(); //캔슬버튼이 눌렸을때 이함수를 나오게하라


			}

		});
	}	


	void clearTextfield() {
		//각각의 텍스트필드 와 텍스트에어리어 값을 지우기
		ta.setText(null); //아무것도 지정하지 않거나 "" 공백을 넣으면 지워진다
		tfName.setText(null);
		tfId.setText(null);
		tfTel.setText(null);
		tfGender.setText(null);
		tfHome.setText(null);
		tfAge.setText(null);
		{






			bExit.addActionListener( new ActionListener()  { 
				public void actionPerformed(ActionEvent e) {

					JOptionPane.showMessageDialog(null, "Exit 버튼클릭");			
				}

			});


			//주민번호 입력창에서 엔터쳤을때 /근데 입력한 그 글씨를 얻어오고싶어!! 
			tfId.addActionListener( new ActionListener()  { 
				public void actionPerformed(ActionEvent e) {

					getJumininfo(); //이렇게 함수를 넣어주어서 만든 프로그램을 하나로 묶은것이다
				}
			});






			//주민번호 입력창에서 고객이 엔터쳤을때
			tfId.addFocusListener(new FocusListener() {
				public void focusGained(FocusEvent e) {
					getJumininfo();
				}
				public void focusLost(FocusEvent e) {

				}	
			});




			//고객이 엔터안치고 입력창에 포커스 이벤트를 발생했을때
			tfId.addFocusListener(new FocusListener() {
				public void focusGained(FocusEvent e) {

				}
				public void focusLost(FocusEvent e) {
					getJumininfo();
				}	
			});

		}
	}


	//함수안에 저장해서 위에서 부르는것임 위 주민등록번호 프로그램만든걸
	//지금 프로그램만든 부분은 지웠고 여기 함수에 저장을 한것이다
	void getJumininfo() {
		String jumin = tfId.getText();
		if(jumin.length()<14) { //입력한주민이 14보다 작으면
			JOptionPane.showMessageDialog(null, "-포함한 15자를 맞춰주셈");
			return; //끝냈던 곳으로 리턴시켜라 ~
		}

		// 주민번호 7번쨰 문자로 성별을 구하여 성병찰에 출력
		String man = null;
		char sung =  jumin.charAt(7); 

		if(sung == '1' ||sung == '3' || sung == '9') { //숫자1과 문자1은 다르니 char로 넣어줘야함
			man = "남자";
		}else if(sung == '2' || sung == '4' || sung == '0') {
			man = "여자";
		}

		tfGender.setText(man);

		//주민번호의 8번째 문자로 출신지를 구하여 출신지창에 출력
		char chul = jumin.charAt(8);
		String home = null;

		if(chul == '0') {
			home = "서울";
		}else if(chul == '1') {
			home = "인천/부산";
		}else if(chul == '2') {
			home = "경기";


			switch(chul) {
			case '0' : 	
				home = "서울";
				break;
			case '1' :
				home = "인/부산";
				break; 
			case '2' :
				home = "경기";
				break;
			case '9' : 
				home = "제주";
			default : 

			}
		}
		tfHome.setText(home);



		//주민번호에서 년도의 의해 나이를 구해서 나이창에출력 형변환 필요
		String nai = jumin.substring(0,2);


		int sunai = Integer.parseInt(nai); 

		int age =0 ;


		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);

		age =year - (1900 + sunai) + 1; 

		String s = String.valueOf(age);

		tfAge.setText(s); //셋텍에는 인트가 안들어가서 문자로 바꿔줘야한다 valueOf

	}


	public static void main(String[] args) {

		InfoView info = new InfoView();
		info.addLayout();
		info.eventProc();

	}

}


