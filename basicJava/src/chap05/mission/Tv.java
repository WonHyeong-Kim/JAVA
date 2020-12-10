package chap05.mission;

public class Tv {
	private String color;
	private boolean power;
	private int channel;
	Tv(/*String color, boolen power, int channel*/){
		this.color = "black";
		this.power = false;
		this.channel = 0;
	}
	public void power() {
		this.power = !this.power;
	}
	public void channelUp() {
		this.channel++;
	}
	public void channelDown() {
		this.channel--;
	}
	public void print() {
		System.out.println("color : "+this.color+"\tpower : "+this.power+"\tchannel : "+this.channel);
	}

}
