package com.osetskiy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Duck mallardDuck = new MallardDuck();
		mallardDuck.setFlyBehavior(new SimpleFly());
		mallardDuck.display();
		mallardDuck.performFly();

	}

}
