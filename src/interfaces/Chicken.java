package interfaces;

public class Chicken extends Animal implements Edible, Commercializable{

	@Override
	public void makeSound() {
		System.out.println("Click");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeProfit() {
		System.out.println("Grow and sell eggs and meat");
		
	}

}
