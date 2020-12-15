package chap07.exam;

public class TVFactory extends Factory implements IWorkingTogether{
	
	public TVFactory() {
		
	}
	
	public TVFactory(String name, int openHour, int closeHour){
		super(name, openHour, closeHour);
	}
	
	@Override
	public int makeProducts(char skill) {
		int skillValue=0;
		
		if(skill == 'A') {
			skillValue = 8;
		}
		else if(skill == 'B') {
			skillValue = 5;
		}
		else if(skill == 'C') {
			skillValue=3;
		}
		else {
			skillValue=1;
		}
		return (skillValue * getWorkingTime());
	}
	
	public int workTogether(IWorkingTogether partner) {
		return ((TVFactory)partner).makeProducts('C');
	}
}
