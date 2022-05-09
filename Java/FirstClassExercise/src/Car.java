
public class Car {
	private int fuel;
	private int maxSpeed;
	
	public Car() {}
	
	public Car(int fuel, int maxSpeed) {
		setFuel(fuel);
		setMaxSpeed(maxSpeed);
	}
	
	public void refuel(int fuel) {
		setFuel(fuel);
	}
	
	public void drive() {
		setFuel(this.fuel = this.fuel-1);
		System.out.println("\nEstás conduciendo\n"+"Te quedan "+this.fuel+" litros de gasolina");
	}
	
	public int getFuel() {
		return fuel;
	}
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
}
