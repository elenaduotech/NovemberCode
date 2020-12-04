package interfaces;

public class Tiger extends Animal implements Commercializable{

	@Override
	public void makeSound() {
		System.out.println("Roar");
		
	}

	@Override
	public void makeProfit() {
	System.out.println("Create a netflix movie and sell");
		
	}

}
