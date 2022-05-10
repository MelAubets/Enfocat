
public class Empleado extends Persona{
	private int tipoContrato;
	private int sueldo;
	
	public Empleado(int tipoContrato, int sueldo, String string, String string2, String string3, int i) {
		super(string,string2,string3,i);
		this.tipoContrato = tipoContrato;
		this.sueldo = sueldo;
	}

	public void calcularSueldo(){}

	@Override
	public String toString() {
		return "Empleado [tipoContrato=" + tipoContrato + ", sueldo=" + sueldo + ", getNombres()=" + getNombres()
				+ ", getApellidos()=" + getApellidos() + ", getDocumento()=" + getDocumento() + ", getTipo()="
				+ getTipo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}