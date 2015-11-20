package com.osetskiy;

public abstract class Duck {
	FlyBehavior flyBehavior;
	public abstract void display();
	public abstract void swim();
	public void performFly(){
		flyBehavior.fly();
		
	}
	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
}
