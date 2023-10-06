
public class Mammal {

	private int energy;
	
	public Mammal() {
		this.energy = 100;
	}
	
	public Mammal(int fullEnergy) {
		this.energy = fullEnergy;
	}
	
	public int displayEnergy() {
		System.out.print("Energy level: " + this.energy + "\n");
		return this.energy;
	}
	
	public int getEnergy() {
		return this.energy;
	}
	
	public void setEnergy(int newEnergy) {
		this.energy = newEnergy;
	}
}