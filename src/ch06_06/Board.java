package ch06_06;

import java.sql.Timestamp;

public class Board {
	
	//dto class -> 생성자2개 getter setter 
	
	private String writer;  // 글쓴이 아이디
	private String title;  // 글제목
	private String content;  // 글 내용
	private Timestamp writeDate; //글쓴 날짜 시간, 계산 안하면 string도 가능 , date도 가능
	
	//생성자
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Board(String writer, String title, String content, Timestamp writeDate) {
		super();
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.writeDate = writeDate;
	}

	//getter, setter
	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Timestamp writeDate) {
		this.writeDate = writeDate;
	}
	
	
	
	
}
