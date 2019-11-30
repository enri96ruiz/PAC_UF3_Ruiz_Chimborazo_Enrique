package hibernate;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Alumno alumno = new Alumno(1,"alvaro","española",39,"Hombre");
		Modulo modulo = new Modulo(1,"Lenguaje",10);
		Profesor profesor = new Profesor(20,"lucas", "Hombre");
		
		File fichero1 = new File ("src/hibernate/filewriter.txt");
		
		try {
			FileWriter writer = new FileWriter(fichero1);
			writer.write("El alumno "+alumno+modulo+profesor);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			System.out.println("no se ha podido escribir el fichero de texto");
		}
		
		
	}

}
