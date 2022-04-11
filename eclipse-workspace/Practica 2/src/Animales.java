public class Animales {

    // Atributos

    public String nombre = "";
    public String es = "";
    public int edad = 1;
    public String sexo = "";

    // Crear metodo constructor
    public Animales(String nombre, String es, int edad, String sexo){
        this.nombre = nombre;
        this.es = es;
        this.edad = edad;
        this.sexo = sexo;
    }

    // Funciones

    public void comer(){

        System.out.println(this.nombre + " esta comiendo");

    }
    public void dormir(){

        System.out.println(this.nombre + " esta dormiendo");

    }
    public void jugar(){

        System.out.println(this.nombre + " esta jugando");
    }
    public void necesidades(){

        System.out.println(this.nombre + " esta haciendo sus necesidades");

    }
}