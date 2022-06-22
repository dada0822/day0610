package day0610;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList(10);
		
		list1.add(new Integer(5)); // 숫자 5를 객체로 만들기 위해 wrapper 클래스
		list1.add(new Integer(4));
		list1.add(new Integer(0));
		list1.add(new Integer(2));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		
		print(list1, list2);
		
		// Collections 클래스의 sort라는 메서드 : 오름차순 정렬
		// Collections.reverse : 출력값을 뒤집어줌
		Collections.sort(list1);
		Collections.sort(list2);
//		Collections.reverse(list1);
		
		print(list1, list2);
		
		// containsAll : list1에 list2의 모든 요소가 포함되어 있는지 확인
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		
		// add() : 인덱스가 없으면 값을 제일 뒤에 추가
		// 인덱스가 있으면 해당 위치에 값을 추가
		list2.add("B");
		list2.add("C");
		
		list2.add(3, "A");
		
		print(list1, list2);
		
		list2.set(3, "AA");
		
		print(list1, list2);
		
		list1.add(0, "1");
		
		print(list1, list2);
		
		// indexOf() : 지정된 객체의 위치(인덱스)를 알려줌
		System.out.println("index = " + list1.indexOf("1"));
		System.out.println("index = " + list1.indexOf(1));
		
		// remove() : 해당 인덱스의 값을 지움
		list1.remove(1);
		list1.remove(new Integer(1));
		
		print(list1, list2);
		
		// retainAll : list1에서 list2와 겹치는 부분만 남기고 나머지를 삭제
		System.out.println(list1.retainAll(list2));
		
		print(list1, list2);
		
		// list2에서 list1과 중복되는 부분을 삭제하려면?
		// 1. list2에 있는 내용을 하나씩 꺼내서 확인(get)
		// 2. contains()로 꺼낸 객체가 list1에 있는지 확인
		// 3. remove(i)를 이용하여 객체를 list2에서 삭제
		for(int i=list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
		
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
}
