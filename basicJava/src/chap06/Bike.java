package chap06;

public class Bike extends Wheeler{
	Bike(String carName, int velocity, int wheelNumber) {
		super(carName, velocity, wheelNumber);
	}
	
	public void speedUp(int speed) {
		int velocity=getVelocity();
		velocity += speed;
		if(velocity>40) {
			setVelocity(40);
			System.out.println("자전거의 최고속도위반으로 속도를 " + getVelocity() + " 으로 내립니다.");
		}
		else {
			setVelocity(velocity);
			System.out.println("자전거의 현재 속도는 "+getVelocity()+" 입니다.");
		}
	}
	
	public void speedDown(int speed) {
		int velocity=getVelocity();
		velocity -= speed;
		if(velocity<10) {
			setVelocity(10);
			System.out.println("자전거의 최저속도위반으로 속도를 " + getVelocity() + " 으로 올립니다.");
		}
		else {
			setVelocity(velocity);
			System.out.println("자전거의 현재 속도는 "+velocity+" 입니다.");
		}
		
	}
}
