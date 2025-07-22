package java_ch06_01;

import javax.swing.plaf.synth.SynthGraphicsUtils;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		String a = "kor";
//		String bString = "kor"
//		String string = new String("kor");
		
		
		Student stu1 = new Student(); // 메모리에 stu1이라는 객체가 생성
		stu1.name = "홍길동";
		stu1.hakbun = "202507544";
		stu1.age = 22;
		stu1.phone = "010-1234-5678";
		stu1.schoolName = "중앙고등학교";
		stu1.address = "서울시 구로구"; 
		stu1.scores[0]=90;
		stu1.scores[1]=80;
		stu1.scores[2]=100;
		stu1.outputName();
		
		
		Student stu2 = new Student();
		stu2.name = "김유신";
		stu2.hakbun = "202507547";
		stu2.age = 21;
		stu2.phone = "010-1234-5678";
		stu2.address = "서울시 강남구";
		
		stu2.outputName();
		
		

	}

}
