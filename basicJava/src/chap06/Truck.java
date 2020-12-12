package chap06;

public class Truck extends Wheeler{
	Truck(String carName, int velocity, int wheelNumber) {
		super(carName, velocity, wheelNumber);
	}
	
	public void speedUp(int speed) {
		int velocity=getVelocity();
		velocity += speed*5;
		if(velocity>100) {
			setVelocity(100);
			System.out.println("트럭의 최고속도위반으로 속도를 " + getVelocity() + " 으로 내립니다.");
		}
		else {
			setVelocity(velocity);
			System.out.println("트럭의 현재 속도는 "+getVelocity()+" 입니다.");
		}
	}
	
	public void speedDown(int speed) {
		int velocity=getVelocity();
		velocity -= speed*5;
		if(velocity<50) {
			setVelocity(50);
			System.out.println("트럭의 최저속도위반으로 속도를 " + getVelocity() + " 으로 올립니다.");
		}
		else {
			setVelocity(velocity);
			System.out.println("트럭의 현재 속도는 "+getVelocity()+" 입니다.");
		}
		
	}
	
}
