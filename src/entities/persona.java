package entities;

public class persona {
	String nombre;
	String apellido;
	String altura;
	String nacionalidad;
	public persona(String nombre, String apellido, String altura, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.altura = altura;
		this.nacionalidad = nacionalidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
}