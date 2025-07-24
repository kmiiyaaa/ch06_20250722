package ch06_06;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member member = new Member();

		//private 로 바꾸고 setter 적용 후 
		member.setName("홍길동");
		member.setId("tiger");
		member.setPw("123123");
		member.setAge(20);
		
		// System.out.println(member.name); error
		System.out.println(member.getName());
		
		
		
		
		/* 기본적인 경우
		member.name = "홍길동"; // 이렇게 직접 입력하거나 멤버클래스에 생성자를 입력하거나
		// member.id = "tiger";  - 필드인 id가 private , 값을 지정해서 넣을 수 없음
		member.pw = "12345";
		member.age = 20;
		 //멤버 객체 안에 초기화되어 메모리 힙영역에 있는 name,id,pw,age
		
		member.age = 40;
		//age 20 -> 40 변경
		
		//이렇게 변경하는거 말고 메소드를 통해서만 값을 바꾸게 하겠다 - getter,setter연관
		*/
		
		Member member2 = new Member("이순신", "lion","123",30);{

		}
		
		
	}

}
