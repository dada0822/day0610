package day0610;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExam {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("1.추가 2.검색 3.수정 4.삭제 5.전체출력 6.데이터초기화 7.종료 > ");
			
			int inputNum = s.nextInt();
			
			String name = null;
			String tel = null;
			String address = null;
			
			switch(inputNum) {
				case 1:
					System.out.print("이름 : ");
					name = s.next();
					System.out.print("전화번호 : ");
					tel = s.next();
					System.out.print("주소 : ");
					address = s.next();
					
					list.add(name);
					list.add(tel);
					list.add(address);
					break;
				case 2 :
					System.out.print("이름 : ");
					name = s.next();
					if(list.contains(name)) {
						System.out.printf("Member [name=%s, tel=%s, address=%s]%n", list.get(0), list.get(1), list.get(2));
					}
					break;
				case 3 :
					System.out.print("이름 : ");
					name = s.next();
					if(list.contains(name)) {
						System.out.print("새 전화번호 : ");
						tel = s.next();
						
						list.remove(1);
						list.add(1, tel);
						
						System.out.print("새 주소 : ");
						address = s.next();
						
						list.remove(2);
						list.add(2, address);
					}
					break;
				case 4:
					System.out.print("이름 : ");
					name = s.next();
					if(list.contains(name)) {
						
					}
					
			}
		}
	}

}
