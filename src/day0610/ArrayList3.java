package day0610;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList3 {
	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("A");
		a1.add("B");
		a1.add("C");
		
		a1.set(2, "D");
		
		for(int i=0; i<a1.size(); i++) {
			System.out.println(i + "번째 요소 : " + a1.get(i));
		}
		
		System.out.print("검색할 데이터 입력 > ");
		
		Scanner sc = new Scanner(System.in);
		String srh = sc.next();
		int idx = 0;
		
		// 입력받은 값이 리스트에 있는지 확인하고 위치를 찾아 표시
		// 없으면 없다.라고 출력
		if(a1.contains(srh)) {
			idx = a1.indexOf(srh);
			System.out.println(idx + "번 인덱스에 " + a1.get(idx) + "을 찾음");
		} else {
			System.out.println("없다");
		}
		
		// 삭제할 값을 입력받아서 리스트에서 제거
		System.out.print("삭제할 값 입력 > ");
		srh = sc.next();
		if(a1.contains(srh)) {
			a1.remove(a1.indexOf(srh));
		}
		// 강사님
//		idx = 0;
//		if(a1.contains(srh)) {
//			idx = a1.indexOf(srh);
//			a1.remove(idx);
//		} else {
//			System.out.println();
//		}
		
		for(int i=0; i<a1.size(); i++) {
			System.out.println(i + "번째 요소 : " + a1.get(i));
		}
		
		System.out.println("전체 내용을 삭제합니다.");
		a1.removeAll(a1);
		
		if(a1.isEmpty()) {
			System.out.println("아무런 내용이 없습니다!");
		}
	
	}
}
