
public class Gorilla extends Mammal{
	
	public void throwSomething() {
		super.setEnergy(getEnergy()-5);
		System.out.printf("Gorilla has thrown rock \n");
	}
	
	public void eatBananas() {
		super.setEnergy(getEnergy() + 10);
		System.out.printf("Gorilla Happy \n");
	}
	
	public void climb() {
		super.setEnergy(getEnergy()-10);
		System.out.printf("Gorilla is on the tree \n");
	}
}
