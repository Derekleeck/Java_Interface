package _interface;

//public class InterMain implements InterA, InterB { 
	public class InterMain implements InterC { // 다중상속받고있는 C만 넣어도 딤. 

	public void aa() {}
	public void bb() {} //재구현

	public void cc() {}
	public void dd() {} //다중 배열 가능 대신 메소드 전부 override해줘야함
	
	public static void main(String[] args) {
		
	}

}




//*****implements - 인터페이스 InterA의 모든 추상메소드를 Ovveride(재구현)하겠다.