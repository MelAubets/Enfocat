import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		CreditCard creditCard = new CreditCard("Banco", 123456789, "Mel", LocalDate.EPOCH);
		
		creditCard.activate();
		creditCard.pay();
		creditCard.deactivate();
		creditCard.pay();
	}

}
