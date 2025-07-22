package ch06_test;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Movie movie1 = new Movie();
		
		movie1.title = "F1 더 무비)";
		movie1.genre = "드라마";
		movie1.runtime = 238;
		
		System.out.println("긴 영화인가요? : " + movie1.isLongMovie());
	}
		
		
	}


