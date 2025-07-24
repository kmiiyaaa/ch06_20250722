package ch06_06;

public class Member {
	
	
	private String name;  // 회원 이름
	private String id;  // 회원 아이디
	private String pw;  // 회원 비밀번호
	private int age;  //회원 나이
	
	
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(String name, String id, String pw, int age) {
		this.name = name;
		this.id = id;    // 여기 id는 private 선언한거
		this.pw = pw;
		this.age = age;
	}
	
	//setter는 필드 수만큼 만들어야한다.
	
	//setter 메소드
	public void setName(String name) { 
		this.name = name;   
	
	}
	
	public void setId(String id) { 
		this.id = id;
	}
		
	public void setPw(String pw) { 
		this.pw = pw;	
	}
	
	public void setAge(int age) { 
		this.age = age; 
	}
	
	
	//getter
	public String getName() {
		return this.name;   //this는 생략가능
	}
	

}
