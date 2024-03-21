package jungsuk.ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student {
String name;
int ban;
int no;
int kor;
int eng;
int math;

Student(String name, int ban, int no, int kor, int eng, int math) {
this.name = name;
this.ban = ban;
this.no = no;
this.kor = kor;
this.eng = eng;
this.math = math;
}

int total; // 총점
int schoolRank; // 전교등수

int getTotal() {
return kor+eng+math;
}

float getAverage() {
return (int)((getTotal()/ 3f)*10+0.5)/10f;
}

//public int compareTo(Object o) {
//	
//}

public String toString() {
return name
+","+ban
+","+no
+","+kor
+","+eng
+","+math
+","+getTotal()
+","+getAverage()
;
}
}

// 반 과 번호 로 오름차순 정렬되게 하시오 (반이 같은 경우 번호를  (ban) (no)비교해서 정렬한다.)



public class Ex11_8 {
	
	public static void calculateSchoolRank(List list) {
		Collections.sort(list); // list . 먼저 를 총점기준 내림차순으로 정렬한다
		int prevRank = -1; // 이전 전교등수
		int prevTotal = -1; // 이전 총점
		int length = list.size();
		
		
		
		
	}
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(new Student("이자바",2,1,70,90,70)); 
		list.add(new Student("안자바 ",2,2,60,100,80)); 
		list.add(new Student("홍길동 ",1,3,100,100,100)); 
		list.add(new Student("남궁성 ",1,1,90,70,80)); 
		list.add(new Student("김자바 ",1,2,80,80,90));
		
		calculateSchoolRank(list);

		Iterator it = list.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());}
		}
		}

