
public class Cuenta {
	//Attributes//
		public String titular;
		public Float cantidad;
		
	public Cuenta(String titular){
			this.titular=titular;
	}
	public Cuenta(Float cantidad) {
		
	}
	//metodo
	public void getIntroducirC() {	
		if( cantidad > 0) {
			return;
		}
		
	}
	public void setIntroducirC(Float Ncantidad) {
		cantidad = Ncantidad;
	}
	
}

