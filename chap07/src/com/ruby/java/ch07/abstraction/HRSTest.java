package com.ruby.java.ch07.abstraction;

abstract class Employee {//추상메서드를 하나라도 포함하면 추상클래스
	String name;
	int salary;

	public abstract void calcSalary();//추상메서드

	public abstract void calcBonus();//추상메서드
}

class Salesman extends Employee {
	public void calcSalary() {//calcSalary() 추상메서드를 구현했다
		System.out.println("Salesman 급여 = 기본급 + 판매 수당");
	}

class Consultant extends Employee {
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	}

class Manager extends Employee {
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}

}

class Director extends Manager {
}

public class HRSTest {
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Manager m = new Manager();
		
		s.calcSalary();
		c.calcSalary();
		m.calcSalary();
	}
}
