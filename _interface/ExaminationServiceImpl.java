package _interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExaminationServiceImpl implements ExaminationService{
		Scanner scn = new Scanner(System.in);
		private List<ExaminationDTO> list = new ArrayList();
		
		public void menu() {
			while(true) {	
				System.out.println("*************************");
				System.out.println("	1.입력");
				System.out.println("	2.출력");
				System.out.println("	3.끝");
				System.out.println("*************************");
				
				System.out.println("번호 입력 : ");
				int num = scn.nextInt();
				
				if (num==1) insertArticle();
				if (num==2) printArticle();
				if (num==3) break;
			}	
		}
		@Override
		public void insertArticle() {
			while(true) {
				
				System.out.println("이름 입력 : ");
				String name = scn.next();
				
				System.out.println("답 입력 : ");
				String dap = scn.next();
				
				ExaminationDTO dto = new ExaminationDTO(name, dap);
				list.add(dto);
			}
				
		}
			
		public void printArticle() {
			System.out.println("이름\t"+ "1 2 3 4 5\t 점수");
			for(ExaminationDTO dto : list) {
				System.out.println(dto.getName());
			}
						
		}

	}
	

/*
p
 
 
 
 
 */




