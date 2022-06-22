package day0610;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExam1 {
	public static void main(String[] args) {
		/* 년도 입력 : , 월 입력 : Scanner
		 * Calendar cal = Calendar.getInstance();
		 * cal.set(년도입력값, 월 입력값)
		 * 2022년 6월
		 * SU MO TU WE TH FR SA */
		
		/* 1. 이번 달의 시작일 확인
		 * 2. 이번 달의 끝나는 날 확인(다음달 1일에서 하루를 빼면)
		 * 3. 확인하고자 하는 달의 1일이 무슨 요일인지 확인
		 * 4. 해당하는 요일부터 숫자를 화면에 출력
		 * 5. 요일이 수요일이면 일요일부터 화요일까지를 공백으로 표시한 뒤 날짜를 화면에 표시함 */
		
		/* 1. 년도와 월 입력받기
		   2. 시작일과 마지막날짜를 담을 변수 선언하기
		   3. 시작일을 변수에 설정하기(set)
		   4. 다음달을 변수에 설정하기(set)
		   5. 다음달의 첫날에서 하루를 빼면 마지막날이 됨(add)
		   6. 해당 날짜의 1일이 무슨 요일인지 확인
		   7. 5에서 확인한 마지막 날짜에서 일만 가져옴
		   8. 화면에 표시하기
		   9. 1일이 무슨 요일에 따라 앞에 공백을 출력함(for이용)
		   10. 1일부터 마지막날까지 숫자를 화면에 표시함(for이용)
		   11. 6에서 확인한 요일이 토요일이 될때마다 줄을 바꿈 */
		
//		Scanner s = new Scanner(System.in);
//		
//		System.out.print("년도 입력 : ");
//		int year = s.nextInt();
//		System.out.print("월 입력 : ");
//		int month = s.nextInt();
//		
//		System.out.println("\t" + year + "년 " + month + "월");
//		System.out.println(" SU MO TU WE TH FR SA");
//		
//		Calendar date1 = Calendar.getInstance();
//		Calendar date2 = Calendar.getInstance();
//		
//		date1.set(year, month-1, 1); // 시작일
//		date2.set(year, month, 1); // 다음달
//		
//		date2.add(Calendar.DATE, -1); // 시작일의 마지막 날짜 설정
//		int lastDay = date2.get(Calendar.DATE); // 마지막 날짜에서 일만 뽑아오기
//		
//		int firstDay = date1.get(Calendar.DAY_OF_MONTH); // 월
//		int week = date1.get(Calendar.DAY_OF_WEEK); // 요일
//		
//		for(int i=1; i<week; i++) {
//			System.out.print("   ");
//		}
//		
//		for(int i=1; i<=lastDay; i++) {
//			System.out.printf("%3d", i);
//			Calendar date3 = Calendar.getInstance();
//			date3.set(year, month-1, i);
//			if(date3.get(Calendar.DAY_OF_WEEK)==7) {
//				System.out.println();
//			}
//		}
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("년도 입력 : ");
		int year = s.nextInt();
		System.out.print("월 입력 : ");
		int month = s.nextInt();
		
		int start_day_of_week = 0; // 요일을 확인하기 위한 변수
		int end_day = 0; // 마지막 날을 확인하기 위한 변수
		
		Calendar sDay = Calendar.getInstance(); // 시작일
		Calendar eDay = Calendar.getInstance(); // 마지막날
		
		sDay.set(year, month-1, 1); // 이번달
		eDay.set(year, month, 1); // 다음달 1일
		
		eDay.add(Calendar.DATE, -1); // 이번달의 마지막 날짜 확인
		
		start_day_of_week = sDay.get(Calendar.DAY_OF_WEEK);
		// 이번달 1일이 무슨 요일인지 확인(일요일부터 1)
		
		end_day = eDay.get(Calendar.DATE);
		// 마지막 날짜에서 일만 뽑아오기
		 
		System.out.println("      " + year + "년 " + month + "월");
		System.out.println(" SU MO TU WE TH FR SA");
		
		// 요일을 이용하지 않고 줄 바꾸기
		int week = 0;
		for(int i=1; i<start_day_of_week; i++) {
//			System.out.print("___");
			System.out.print("   ");
			week++;
		}
		
		for(int i=1; i<=end_day; i++) {
			System.out.print(((i<10) ? "  " : " ") + i);
			week++;
			if(week == 7) {
				System.out.println();
				week = 0;
			}
		}
		
		
		// 요일을 이용하여 줄 바꾸기
//		for(int i=1; i<start_day_of_week; i++) {
////			System.out.print("___");
//			System.out.print("   ");
//		}
//		
//		for(int i=1, n=start_day_of_week; i<=end_day; i++, n++) {
////			if(i<10) 
////				System.out.print("  " + i);
////			else
////				System.out.print(" " + i);
//			
////			System.out.print((i<10) ? "  " + i : " " + i);
//			System.out.print(((i<10) ? "  " : " ") + i);
//			
//			
//			if(n%7==0) {
//				System.out.println();
//			}
//		}
		
		
		
	}
}
