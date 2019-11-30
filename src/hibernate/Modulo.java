package hibernate;

public class Modulo {
	int idalumno;
	String nombre;
	int codigo;
	public Modulo(int idalumno, String nombre, int codigo) {
		this.idalumno=idalumno;
		this.nombre=nombre;
		this.codigo=codigo;
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
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "Modulo [idalumno=" + idalumno + ", nombre=" + nombre + ", codigo=" + codigo + "]";
	}
	
}
