package chap06.exam;

public class CellPhone {
	private String model;
	private double battery;
	
	public CellPhone() {
		
	}
	
	public CellPhone(String model) {
		this.model = model;
	}
	void call(int time) throws IllegalArgumentException{		
		if(time<0) {
			throw new IllegalArgumentException("통화시간입력 오류");
		}
		else {
			double callBattery = (double)time*0.5;
			if(battery-callBattery<0) {
				battery=0;
			}
			else {
				battery-=callBattery;
			}
			System.out.println("통화 시간 : "+time+"분");
		}
	}
	void charge(int time) {
		if(time<0) {
			throw new IllegalArgumentException("충전시간입력 오류");
		}
		else {
			double chargeBattery=time*3;
			if(chargeBattery+battery>100) {
				battery=100;
			}
			else {
				battery+=chargeBattery;
			}
			System.out.println("충전 시간 : " + time + "분");
		}
	}
	void printBattery() {
		System.out.println("남은 배터리 양 : " + this.battery);
	}
	public boolean equals(CellPhone otherObject) {
		return this.model.equals(otherObject.model);		
	}
}
