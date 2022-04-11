import java.io.PrintStream;

public class Persona2 {
	String nombre;
	String apellido;
	String sexo;
	int edad;
	String accion;
	
	public Persona2(String Nombre, String Apellido, String Sexo, int Edad) {
		this.nombre = Nombre;
		this.apellido = Apellido;
		this.sexo = Sexo;
		this.edad = Edad;
		
	}

	PrintStream dormir(){
		PrintStream durmiendo;
		durmiendo = System.out.printf(nombre, apellido, "que tiene ", edad, "y es de sexo ", sexo, "esta durmiendo");
		return durmiendo;
	}
	PrintStream correr(){
		PrintStream corriendo;
		corriendo = System.out.printf(nombre, apellido, "que tiene ", edad, "y es de sexo ", sexo, "esta corriendo");
		return corriendo;
	}
	PrintStream comer(){
		PrintStream comiendo;
		comiendo = System.out.printf(nombre, apellido, "que tiene ", edad, "y es de sexo ", sexo, "esta comiendo");
		return comiendo;
	}
	PrintStream caminar(){
		PrintStream caminando;
		caminando = System.out.printf(nombre, apellido, "que tiene ", edad, "y es de sexo ", sexo, "esta caminando");
		return caminando;
	}
}
