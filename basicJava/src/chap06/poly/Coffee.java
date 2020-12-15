package chap06.poly;

public class Coffee extends Beverage {
	static int amount;
	
	public Coffee() {
		amount++;
	}
	
	public Coffee(String name) {
		super(name);
		amount++;
		calcPrice();
	}
	
	@Override
	public void calcPrice() {
		if(getName().equals("Americano")) {
			price = 1500;
		}
		else if(getName().equals("CafeLatte")) {
			price = 2500;
		}
		else if(getName().equals("Cappuccino")) {
			price = 3000;
		}
	}
}
