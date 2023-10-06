
public class Bat extends Mammal{
	
	public Bat() {
		super(300);
	}
	
	public void fly() {
		super.setEnergy(getEnergy()-50);
		System.out.printf("Bat is in the air \n");
	}
	
	public void eatHumans() {
		super.setEnergy(getEnergy()+ 25);
		System.out.printf("Bat is Happy \n");
	}
	
	public void attackTown() {
		super.setEnergy(getEnergy()-100);
		System.out.printf("Bat attack Town \n");
	}
}
