package logica;

/**
 *
 * @author Mao
 */
public class Cesar {

    private String charMin = "abcdefghijklmnopqrstuvwxyz";
    private String charMay = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private char[] desCifrado;

    public Cesar() {

    }

    public String cifrar(String entrada, int desp) {
        String salida = "";
        for (int i = 0; i < entrada.length(); i++) {
            if ((charMin.indexOf(entrada.charAt(i)) != -1) || (charMay.indexOf(entrada.charAt(i)) != -1)) {
                salida += (charMin.indexOf(entrada.charAt(i)) != -1) ? charMin.charAt(((charMin.indexOf(entrada.charAt(i))) + desp) % charMin.length()) : charMay.charAt((charMay.indexOf(entrada.charAt(i)) + desp) % charMay.length());
            } else {
                salida += entrada.charAt(i);
            }
        }
        return salida;
    }

    public char[] descifrar(String msj, int desp) {
        String[] temp = msj.split(""); 	//Dividimos en caracteres el String introducido
        desCifrado = new char[temp.length];//Asignamos el tamaño del código cifrado al 
        //String que almacenará el descifrado
        for (int i = 0; i < temp.length; i++) {
            int y = (int) (temp[i].charAt(0));	//Tomamos el valor ASCII del carácter cifrado
            int x = y - desp % 27;//Desciframos el valor ASCII

            if (x > 127) {
                int v = x / 127;//Calcula las veces que ha superado 127, ej: 300 se pasa 2 veces
                x = x - 128 * v;//Cerramos el bucle. Si el ASCII fuera 28 y n 1, y = 0 evitando errores
                desCifrado[i] = (char) (x);
            } else {
                desCifrado[i] = (char) (x);
            }

        }
        return desCifrado;
    }

}
