package b_info;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.xml.xpath.XPathEvaluationResult;

public class InfoView  {

	//1. 멤버변수 선언
	JFrame f; //프레임
	JTextField tfname,tfid,tfgender,tfage,tfhome,tftel; //지정한 크기만큼 한줄을 쓸수 잇는 공간
	JTextArea ta; // 지정한크기 만큼 쓸수잇는 공간
	JButton badd,bshow,bsearch,bdelete,bcancle,bexit; //버튼 
	Calendar c = Calendar.getInstance();

	ArrayList<PersonVO> list = new ArrayList<PersonVO>(); //고객장보가 한명일리없고 몇명인지도 모르니 어레이리스트사용





	//2. 멤버변수 객체생성
	InfoView (){
		f = new JFrame("DBTest"); // 창의 이름 설정
		tfname = new JTextField(15);
		tfid = new JTextField(15);
		tftel = new JTextField(15);
		tfgender = new JTextField(15);
		tfage = new JTextField(15);
		tfhome = new JTextField(15);
		ta = new JTextArea(40,20);
		badd = new JButton("Add");
		bshow = new JButton("Show");
		bsearch = new JButton("Search");
		bdelete = new JButton("Delete");
		bcancle = new JButton("Cancel");

		bexit = new JButton("Exit(alt+x)",new ImageIcon("src//img//3.png"));//imageicon : 이미지가 있는 폴더의 좌표를 찍어서 불러온다. 
		bexit.setHorizontalTextPosition(JButton.CENTER);//텍스트 안의 이미지 위치 지정
		bexit.setVerticalTextPosition(JButton.BOTTOM);//텍스트안의 내용을 이미지 밑으로 지정
		bexit.setRolloverIcon(new ImageIcon("src//img//2.png"));// 이미지에 마우스 커서를 올릴때 해당 이미지로 변환하는 구문
		bexit.setPressedIcon(new ImageIcon("src//img//1.png"));// 이미지 클릭시 이미지 이미지 변경 
		bexit.setToolTipText("시스템을 종료합니다");
		bexit.setMnemonic('x');




	}

	//3. 화면구성하고 출력
	// 전체프레임 BorderLayout지정
	// west : panel 붙이기 (GridLayout()6,2)
	// center : 텍스트에어리어
	// south : JPanel 붙이기 - (GridLayout()1,6)
	public void addLayout() {
		f.setLayout(new BorderLayout()); // 동/서/남/북 으로 출력할 내용의 위치를 지정하여 출력하게 만드는 구문 
		JPanel p = new JPanel(); // 패널 구문
		p.setLayout(new GridLayout(6,2)); //출력시 지정한 행과 열로 출력되게 하는 구문 (그리드) 

		f.add(p , BorderLayout.WEST);// 텍스트 출력을 왼쪽에 하는 구문 
		p.add(new JLabel("Name",JLabel.CENTER)); // "Name"이라고 출력
		p.add(tfname);//텍스트 출력구문

		p.add(new JLabel("Id",JLabel.CENTER));// "Id"이라고 출력
		p.add(tfid);//텍스트 출력구문

		p.add(new JLabel("Tel",JLabel.CENTER));// "Tel"이라고 출력
		p.add(tftel);//텍스트 출력구문

		p.add(new JLabel("Sex",JLabel.CENTER));// "Sex"라고 출력
		p.add(tfgender);//텍스트 출력구문

		p.add(new JLabel("Age",JLabel.CENTER));// "Age"라고 출력
		p.add(tfage);//텍스트 출력구문

		p.add(new JLabel("Home",JLabel.CENTER));// "Home"이라고 출력
		p.add(tfhome);//텍스트 출력구문

		//p.add(new JLabel("Name, id ,tel"));
		JPanel j = new JPanel(); //새 패널 객체 생성
		j.setLayout(new GridLayout(1,6));
		f.add(j, BorderLayout.SOUTH);
		j.add(badd);
		j.add(bcancle);
		j.add(bdelete);
		j.add(bsearch);
		j.add(bshow);
		j.add(bexit);

		f.add(ta, BorderLayout.CENTER); // 에리어 텍스트를 가운데에 놓는구문

		f.setBounds(100,100,900,400); //창크기
		f.setVisible(true);// 창 출력문
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x누르면 창이 꺼짐과함께 프로그램 종료하는 구문





		bshow.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent e){
				//show 버튼이 눌러졌을때!! /add로 저장하고
				selectAll(); //입력한고객정보가 저장되어 에어리어필드에서 나온다

			}
		});



		//  bsearch 버튼으로 만들어져서 버튼을 눌렀을때 타입이 JButton
		bsearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//고객이 서치버튼을 눌렀을떄
				selectByTell(); 
			}
		});




		// 서치버튼 누르지않고 번호에서 그냥 엔터쳤을때 타입이 JTextField
		tftel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				//서치버튼 누르지 않고 번호에서 엔터쳤을때
				selectByTell();
			}
		});// end of addActionListener




		bdelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				//삭제 다짜고짜 안됨 무언가 삭제할지 알아야 삭제가능 search로 찾아야할꺼아님
				//그사람이 누구인지 알수있는 유일한 값은 주민번호임 근데 요즘트랜드는 전화번호로 찾아냄
				//고유의 그항목을 찾는걸 키 라고 부른다 키값으로 전화번호!
				 deletByTell();
				 selectByTell();
				


			}
		});

		bcancle.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				clearTextfield();
				JOptionPane.showMessageDialog(null, "삭제완료");
			}
		});



		//주민번호 입력창에서 엔터 쳤을때 
		tfid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jumininfo();

			}
		});// end of addActionListener
		//고객이 엔터안치고 입력창에 포커스 이벤트를 발생했을때 //이건 다른 기능을 눌렀을때를의미
		//그래서 tel부분과는 다른 아래 구문을 이용
		tfid.addFocusListener(new FocusListener() {

			public void focusGained(FocusEvent e) {
			}

			public void focusLost(FocusEvent e) {
				jumininfo();
			}

		});

	}



	public void evenProc() {
		//ADD 버튼이 눌렷을때 이벤트 처리
		badd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				inputdata(); //고객의 정보가 저장이된다 //PersonVO필드에
				clearTextfield(); //다썻을때 또 지우라고 불러줌
				selectAll();//자동인것처럼 보이게 하려고 저장하고 지워져도 옆에 목록은 떠주니까
			}
		});
	}





	////각각의 텍스트필드 와 텍스트에어리어 값을 지우기
	void clearTextfield() {
		ta.setText(null);
		//나머지 텍스트 필드도 지우기
		tfage.setText(null); //아무것도 지정하지 않거나 "" 공백을 넣으면 지워진다
		tfgender.setText(null);
		tfhome.setText(null);
		tfid.setText(null);
		tfname.setText(null);
		tftel.setText(null);

	}//end of clearTextfield



	// add버튼을 눌럿을때 텍스트 필드에 입력한 사용자의 값들을 PersonVO에 저장하기


	void inputdata() {
		//방법 1. 각각의 텍스트 필드의 입력값을 얻어오기
		//방법 2. 1번의 값들을 PersonVo 멤버변수에 저장하기 (셋터나 , 생성자를 이용하거나)
		PersonVO vo = new PersonVO(); //객체를 먼저만들어줘 서 세터로 넣어주는거임

		//이건 결국 한사람의 정보니 어레이리스트에 저장만 해주면 되겠네? 그럼 계속 입력이되겠네?
		vo.setName(tfname.getText());
		vo.setAge(Integer.parseInt(tfage.getText())); //형변환
		vo.setTel(tftel.getText());
		vo.setId(tfid.getText());
		vo.setGender(tfgender.getText());
		vo.setHome(tfhome.getText());

		list.add(vo);
		//입력을 다하고 show 버튼눌렀을테 텍스트에어리어에 뜨게 하고싶다면??!   

	}//end of inputdata


	void selectAll() {
		//어레이리스트에 저장된 정보를 모두 텍스트에어리어 여러줄받는곳에 출력하려고 하는 함수
		//어레이리스트는 결론은 배열이기에 for문을 사용하는데 향샹된 for문을 사용해도 되겠네?

		for(PersonVO vo :list ) {
			ta.setText("전체목록\n\n"); //그전께 없어지고 출력됨 안그러면 계속나옴 데이터가 쌓여서
			//어따출력해?
			//셋텍스트쓰면 기존에 있는 내용은 지워버림 저장하면서 나와야하는데
			ta.append(vo.toString());// append를 써야함 / 아까만든 toString까지
		}
	}//end of selectAll



	void selectByTell() {
		//입력한 전화번호값을 얻어오기 //겟으로 얻고 셋으로 출력
		String te1 =  tftel.getText(); //번호 얻어오기

		//입력받은 전화번호가 공백이라면 메세지 창을 출력
		if(te1.equals("")) {
			JOptionPane.showConfirmDialog(null, "전화번호를 입력하세요");
			return; //입력안하면 메세지창 띄우고 바로 나가버려야함 밑에 가 작동되면안됨
		}

		//리스트에 저장된 PersonVO의 전화번호와 비교를 해야함 그래서 그번호가 맞으면 그내용을
		//각각의 택스트필드에 출력을 해줘야한다
		//리스트에서 하나씩 빼오려니까 반복문으로 뺴와야한당

		for( PersonVO vo : list) {
			if(te1.equals(vo.getTel())) {
				tfname.setText(vo.getName());
				tfid.setText(vo.getId());
				tfgender.setText(vo.getGender());
				tfage.setText(String.valueOf(vo.getAge()));
				tfhome.setText(vo.getHome());
				//번호치고 입력만하면 모든정보가 다 올라옴 저장했다면
			}
		}



	}//end of selectByTell
	
	void deletByTell() {
		//입력한 전화번호값을 일단 얻어오기 그냥 딜리트를 누를수도있으니까
		//입력받은 전화번호가 공백이라면 입력 메세지창출력
		//리스트에 저장된 PersonVO의 전화번호와 비교하여
		//해당 전화번호가 있으면 그 해당하는 PersonVO를 리스트에서 삭제
		// 삭제하고나서 break로 반복문 끝내기
		String te1 =  tftel.getText();
		
		if(te1.equals("")) {
			JOptionPane.showConfirmDialog(null, "전화번호를 입력하세요");
			return;
			}// end of if
		
		for(PersonVO vo : list) {
			if(te1.equals(vo.getTel()));
			list.remove(vo); //리무브를 해줘야한다 / 리무브는 삭제를 의미
			break;
			//캔슬하고 다시 번호치고 엔터치면 이전 정보 다없어짐
		}// end of for
		
		
	}




	void jumininfo() {
		String junin = tfid.getText();
		if(junin.length()<14) {
			JOptionPane.showMessageDialog(null, " - 포함한 15자를 맞춰주세요");
			junin.charAt(7);

			return;   
		}

		if(junin.charAt(7)== '1') { 
			tfgender.setText("남자");

		}else{
			tfgender.setText("여자");
		}
		switch(junin.charAt(8)) {

		case '0' :
			tfhome.setText("서울");
			break;
		case '1' :
			tfhome.setText("인천/부산");
			break;
		case '2' :
			tfhome.setText("경기도");
			break;
		case '9' :
			tfhome.setText("제주도");
			break;

		}
		int year = c.get(Calendar.YEAR);
		String bir = junin.substring(0,2);
		int sbir = Integer.parseInt(bir);
		int bb = (year - (sbir+1900))+1;
		String rb = String.valueOf(bb);
		tfage.setText(rb);


	}

	public static void main(String[] args) {

		InfoView  info = new InfoView (); // 객체 새롭게 지정하며 생성
		info.addLayout();// 출력구문
		info.evenProc();

		String man = null;
		String woman = null;





	}

}

//이프로그램은 껏다 키면 저장안되고 다사라짐 파일이나 DB에 저장 자바는 DB 오라클에 저장할꺼임
