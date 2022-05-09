
public class Main {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car(60, 200);
		Car car3 = new Car(40,120);
		
		//Coche uno
		car1.setFuel(50);
		car1.setMaxSpeed(80);
		
		//Coche dos
		System.out.printf("%s %d %s %d", "Deposito", car2.getFuel(),
				"Velocidad maxima", car2.getMaxSpeed());
		
		//Coche tres
		final int maxFuel = car3.getFuel();
		
		for(int i=0; i<maxFuel;i++) {
			car3.drive();
		}
		
		car3.refuel(maxFuel);
		System.out.println("Has llenado el deposito, ahora dispones de "+ car3.getFuel()+" Litros de gasolina");
	}

}
