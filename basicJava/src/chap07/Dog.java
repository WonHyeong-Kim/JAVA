package chap07;

public class Dog extends Animal {
	public Dog() {
		
	}
	public Dog(int speed) {
		super(speed);
	}
	@Override
	public void run(int hours) {
		setDistance(getDistance()+(hours*getSpeed()/2.0));
	}
}
