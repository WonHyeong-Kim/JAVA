package chap07;

public class Chicken extends Animal implements Cheatable{
	public Chicken() {
		
	}
	public Chicken(int speed) {
		super(speed);
	}
	@Override
	public void run(int hours) {
		setDistance(getDistance()+(hours*getSpeed()));
	}
	public void fly() {
		setSpeed(getSpeed()*2);
	}

}
