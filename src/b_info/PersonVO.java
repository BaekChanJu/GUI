package b_info;

public class PersonVO { //고객정보 저장소
	
	private String name;
	private String id;
	private String tel;
	private String gender;
	private String home;
	private int age;
	
	
	
	
	
	public PersonVO() {
		
		
		
		
	}
	
	
	
	
	
	

	public PersonVO(String name, String id, String tel, String gender, String home, int age) {
		super();
		this.name = name;
		this.id = id;
		this.tel = tel;
		this.gender = gender;
		this.home = home;
		this.age = age;
	}//우클릭 소스 필드 로 수동으로 만들기가능 생성자
	
	
	
	
	
	
	//프라이빗때는 셋터게터 많이 이용 생성자보다
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}




	
	public String toString() {
		return "PersonVO [name=" + name + ", id=" + id + ", tel=" + tel + ", gender=" + gender + ", home=" + home
				+ ", age=" + age + "]\n";
	}
	//제너레이터 투스트링 해주면 다만들어줌
	
	
	
	
}
