
public class Persona {

	private String nombres;
	private String apellidos;
	private String documento;
	private int tipo;
	
	public Persona() {}
	
	public Persona(String nombres, String apellidos, String documento, int tipo) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.documento = documento;
		this.tipo = tipo;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
}
