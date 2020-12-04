package abstraction;

public class WashingMachine extends Appliance implements Programmable{

	@Override
	public void turnOn() {
		System.out.println("Put detergent and set the water temp");
		System.out.println("Press on button");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Press off button");
		
	}

	@Override
	public void setAlarm() {
		System.out.println("Set alarm on 1 hour delay");
		
	}

	@Override
	public void program() {
		System.out.println("Washing machine specific programming");
		
	}
	
}
