package chap07.exam;

public class CarFactory extends Factory implements IWorkingTogether{
	
	public CarFactory() {
		
	}
	
	public CarFactory(String name, int openHour, int closeHour){
		super(name, openHour, closeHour);
	}

	@Override
	public int makeProducts(char skill) {
		int skillValue=0;
		
		if(skill == 'A') {
			skillValue=3;
		}
		else if(skill == 'B') {
			skillValue=2;
		}
		else if(skill == 'C') {
			skillValue=1;
		}
		else {
			skillValue=0;
		}
		return (skillValue * getWorkingTime());
	}
	
	public int workTogether(IWorkingTogether partner) {
		return ((CarFactory)partner).makeProducts('B');
	}
}
