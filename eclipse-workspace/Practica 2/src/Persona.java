public class Persona {
	private static final int INFRAPESO = 0;
	private static final int PESO_IDEAL = 0;
	private static final int SOBREPESO = 0;
	//attributes//
	public String nombre;
	public int edad;
	public int DNI;
	public String sexo;
	public float peso;
	public float altura;
	
	public Persona() {
		nombre ="" ;
		edad = 0;
		sexo = "";
		peso = 0;
		altura = 0;	
	}
	public Persona(String nombre, int edad, String sexo) {
		nombre ="" ;
		edad = 0;
		sexo = "";
		peso = 0;
		altura = 0;	
	}
	public Persona(String nombre, int edad, String sexo, Float peso, Float altura) {
		nombre ="" ;
		edad = 0;
		sexo = "";
		peso = (float) 0;
		altura = (float) 0;	
	}	
	public static int calcularIMC(float peso, float altura){
		int IMC = (int) (peso/Math.pow(altura,2 ));
		return IMC;
	}
	public static boolean esMayorDeEdad(int edad) {
		String menor = "es menor de edad";
		if (edad < 18) {
			return esMayorDeEdad(edad);
		}
			else {
				return menor != null;
			}
		
	}
	public String comprobarSexo() {
		if (sexo != "M" && sexo != "F") {
			this.sexo = sexo;
			return sexo;
		}
		return sexo;
		
	}
	
	public String toString() {
		return toString();
	}

	public char generaLetraDNI(int res) {

		char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',

				'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',

				'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		return letras[res];
	}
	 public int calcularIMC() {

	        //Calculamos el peso de la persona

	        double pesoActual = peso / (Math.pow(altura, 2));

	        //Segun el peso, devuelve un codigo

	        if (pesoActual >= 20 && pesoActual <= 25) {

	            return PESO_IDEAL;

	        } else if (pesoActual < 20) {

	            return INFRAPESO;

	        } else {

	            return SOBREPESO;

	        }
	 }
} 