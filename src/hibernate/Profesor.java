package hibernate;

public class Profesor {
	public Profesor (int idprofesor, String nombre, String sexo) {
		this.idprofesor=idprofesor;
		this.nombre=nombre;
		this.sexo=sexo;
	}
	int idprofesor;
	String nombre;
	String sexo;
	public int getIdprofesor() {
		return idprofesor;
	}
	public void setIdprofesor(int idprofesor) {
		this.idprofesor = idprofesor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "Profesor [idprofesor=" + idprofesor + ", nombre=" + nombre + ", sexo=" + sexo + "]";
	}
	
	
}
