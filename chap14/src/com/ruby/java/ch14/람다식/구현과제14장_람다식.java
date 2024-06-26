package com.ruby.java.ch14.람다식;


		
import java.util.ArrayList;
/*
 * public interface Comparator<T>{
 *    int compare(T 01, T 02);
 *    }
 *    
 * public interface Comparable<T> {
 *   public int compareTo(T o);
 *   }   
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
class Student {
	String sno;
	String sname;
	
	public Student(String sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}
}

public class 구현과제14장_람다식{

	static void sortStudents() {
	}
	public String sno;
	public String sname;
	static void showStudents(String sno, Student[] sArray) {
	}
	public static void main(String[] args) {
		Comparator<Student> compSno = new Comparator<Student>(){
			@Override
			public int compare(Student s1, Student s2) {
			return Integer.parseInt(s1.sno)-Integer.parseInt(s1.sno);
			}
		};
        Student[] sArray = new Student[5];
        
        // Student 객체 생성 및 배열에 할당
        sArray[0] = new Student("121", "Alice");
        sArray[1] = new Student("33", "Bob");
        sArray[2] = new Student("9", "Charlie");
        sArray[3] = new Student("2", "John");
        sArray[4] = new Student("39", "Bobby");
        // ArrayList로 변환
        ArrayList<Student> sList = new ArrayList<>();
        for (Student student : sArray) {
            sList.add(student);
        }
        
   
        showStudents("sno 정렬전", sArray);
        //문제1: Arrays.sort()를 사용한 sArray 정렬 - sno 사용, 익명클래스 사용
        for(int i=0; i<5; i++) {
			System.out.print(sArray[i].sno + " ");
		}
        Arrays.sort(sArray, compSno);
        showStudents("sno 정렬후", sArray);
        
        
        showStudents("sname 정렬전", sArray); 
        //문제2: Arrays.sort()를 사용한 sArray 정렬 - sname 사용, 익명 객체 사용
        for(int i=0; i<5; i++) {
			System.out.print(sArray[i].sname + " ");
		}
        Arrays.sort(sArray, new Comparator<Student>(){
			@Override
			public int compare(Student o1, Student o2) {
				return o1.sname.compareTo(o2.sname);
			}
        });
        showStudents("sname 정렬후", sArray);
        
        
        showStudents("sno 정렬전", sList);
        //문제3: Collections.sort()를 사용한 sList 정렬 - sno 사용, 람다식 사용 (Test07에서 대신 Comparator쓰기)
        showStudents("sno 정렬후", sList);
        
        
        showStudents("sname 정렬전", sList);
        //문제4: Collections.sort()를 사용한 sList 정렬 - sname 사용
        Collections.sort(sList, 람다식으로 표현)
        showStudents("sname 정렬후", sList);
        
        
        showStudents("sno 정렬전", sArray);
        //문제5: sortStudents()를 사용한 sArray 정렬 - sno 사용
        showStudents("sname 정렬후", sArray);
	}

}
