package _interface;

public class ProductMain {

	public static void main(String[] args) {
		Product ps = new ProductService();
		ps.menu();
		System.out.println("프로그램을 종료합니다.");
		
		//menu() 호출
		//이 함수가 어느 클래스에 있는 지 확인
		// 이 함수가 static 인지?
		
	}

}
