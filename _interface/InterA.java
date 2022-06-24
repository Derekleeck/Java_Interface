package _interface;

public interface InterA {
	public static final String NAME="홍길동"; // 상수 --> final 고정
	int AGE = 25;
	
	
	public abstract void aa();
	public void bb(); //abstract 생략가능함 어차피 interface는 abstract만 받음
}
