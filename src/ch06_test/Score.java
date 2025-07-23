package ch06_test;

public class Score {

	int kor;
	int eng;
	int math;
	
	
	public Score (int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public void printScore() { // 메서드/ 반환하지 않고 이 안에서 쓰겠다 -> void
		int sum =kor + eng + math;
		double avg = (kor + eng + math)/3; // total/3;
		
		System.out.println("총점 : " +sum); // 총점, 평균을 출력
		System.out.println("평균 : " +avg);
		
		if(avg>=90) {
	    	 System.out.println("우수");
	     } else if (avg<60) {
	    	 System.out.println("재시험");
	     } else {
	    	 System.out.println("보통");
	     }
		


	}
}
