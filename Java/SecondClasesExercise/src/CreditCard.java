import java.time.LocalDate;

public class CreditCard {
	private String entity;
	private int number;
	private String titular;
	private LocalDate expireDate;
	private boolean active;
	
	public CreditCard() {}
	
	public CreditCard(String entity, int number, String titular, LocalDate exprireDate) {
		setEntity(entity);
		setNumber(number);
		setTitular(titular);
		setExpireDate(expireDate);
		active = true;
	}
	
	public void activate() {
		if(active == false)
			active = true;
		else
			System.out.println("La targeta ya está activada!!");
	}
	
	public void pay() {
		if(active == true)
			System.out.println("Pagando...");
		else
			System.out.println("No puedes pagar con una targeta desactivada,\nactiva la targeta primero.");
	}
	
	public void deactivate() {
		if(active==true)
			active = false;
		else
			System.out.println("Esta targeta ya está desactivada!");
	}
	
	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public LocalDate getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}
}
