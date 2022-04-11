public class ManejaCadenas {

    public String reverso(String parametro){

        StringBuilder strb = new StringBuilder(parametro);
        parametro = strb.reverse().toString();
        return parametro;
    }

    public String eliminaVocales(String parametro){

        String Vocales = "";

        for (int i =0; i < parametro.length(); i++){

            if (parametro.charAt(i) == 'a' || parametro.charAt(i) == 'e' || parametro.charAt(i) == 'i' || parametro.charAt(i) == 'o'
                    || parametro.charAt(i) == 'u')  {

                continue;
            }

            Vocales += parametro.charAt(i);

        }
        return Vocales;

    }

    public int cuentaVocales(String parametro){

        int contarCaracter = 0;

        for (int i =0; i < parametro.length(); i++){

            if (parametro.charAt(i) == 'a' || parametro.charAt(i) == 'e' || parametro.charAt(i) == 'i' || parametro.charAt(i) == 'o'
                    || parametro.charAt(i) == 'u')  {

                contarCaracter++;
            }
        }

        return contarCaracter;

    }

    public int cuentaConsonantes(String parametro){

        int consonantes = 0;

        for (int i = 0; i < parametro.length(); i++){

            if (parametro.charAt(i) == 'a' || parametro.charAt(i) == 'e' || parametro.charAt(i) == 'i' || parametro.charAt(i) == 'o'
                    || parametro.charAt(i) == 'u')  {

                continue;
            }

            consonantes++;
        }

        return consonantes;
    }

    public int cuentaPalabras(String parametro){

        int palabras = 1;

        for (int i = 0;  i < parametro.length(); i++){

            if (parametro.charAt(i) == ' '){

                palabras += 1;

            }
        }
        if (parametro.equals("")){
            palabras -= 1;
        }

        return palabras;
    }
}