package com.ruby.java.ch08.polymorphism;
/*
 * 인터페이스 다형성 실습 코드
 * 생성자에서 this()를 사용, super()를 사용
 * 추상 메소드 구현에서 super.추상메소드를 사용하는 구현 실습이 목적임 
 */
interface Vehicle {
	public abstract void showVehicle();
}

class Truck implements Vehicle {
	int weight;
	public Truck(int weight) {
		this.weight=weight;
	}
	public void showVehicle() {
		System.out.println("Truck: weight="+weight);
	}
}
class Car implements Vehicle {
	int vehicleOccupants;
	public Car(int vehicleOccupants) {
		this.vehicleOccupants=vehicleOccupants;
	}
	public void showVehicle() {
		System.out.println("Car: vehicleOccupants="+vehicleOccupants);
	}
}

class Taxi extends Car {
	int mileage;
	public Taxi(int vehicleOccupants, int mileage) {
		super(vehicleOccupants);
		this.mileage=mileage;
	}
	public void showVehicle() {
		System.out.println("Taxi: vehicleOccupants="+vehicleOccupants+" / mileage="+mileage);
	}
}
class MotorCycle implements Vehicle{
	int price;
	public MotorCycle(int price) {
		this.price=price;
	}
	public void showVehicle() {
		System.out.println("Car: price="+price);
	}
}
public class Test_chap08_인터페이스다형성실습 {
	public static void displayVehicles(Vehicle [] a) {
		for (Vehicle v : a) {//확장형 for문
			v.showVehicle();//v의 타입을 실행 시간에 확인하여 해당 클래스의 메소드로 바인딩
		}
	}

	//동적 바인딩
	
public static void main(String[] args) {
	Vehicle [] arr = new Vehicle[5];
	arr[0] = new Truck(33);
	arr[1] = new Car(4);
	arr[2] = new Taxi(2, 9000);//생성자가 super()를 사용
	arr[3] = new Truck(22);
	arr[4] = new MotorCycle(12000);
	displayVehicles(arr);
	//익명 클래스 선언 (376page)
	// 인터페이스명 변수명 = new 인터페이스명(){
	// 인터페이스의 메서드 오버라이딩
	// }
	Vehicle v = new Vehicle() {
		public void showVehicle() {
			System.out.println("Vehicle: 익명 클래스 ");
		}
	};
	v.showVehicle();
	}
}
