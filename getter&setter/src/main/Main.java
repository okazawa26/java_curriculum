package main;

import animal.Animal;

public class Main {
	public static void main(String[] args) {
		Animal lion = new Animal();
		lion.setAnimalName("ライオン");
		lion.setLength(2.1);
		lion.setSpeed(80);
		
		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getLength() + "m");
		System.out.println("速度：" + lion.getSpeed() + "km/h");
	} 
}
