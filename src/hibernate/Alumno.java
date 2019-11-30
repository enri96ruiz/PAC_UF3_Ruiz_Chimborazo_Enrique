package hibernate;

public class Alumno {
	int idalumno;
	String nombre;
	String nacionalidad;
	int edad;
	String sexo;
	public Alumno (int idalumno, String nombre, String nacionalidad, int edad, String sexo) {
		this.idalumno=idalumno;
		this.nombre=nombre;
		this.nacionalidad=nacionalidad;
		this.sexo=sexo;
	}
	public int getIdalumno() {
		return idalumno;
	}
	public void setIdalumno(int idalumno) {
		this.idalumno = idalumno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "Alumno [idalumno=" + idalumno + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", edad="
				+ edad + ", sexo=" + sexo + "]";
	}
	
}
