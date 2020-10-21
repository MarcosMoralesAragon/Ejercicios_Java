/**
 * ¿Se puede representar un string que contiene char?
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio8 { 
  public static void main(String[] args) {

    char uno = 'H';
    char dos = 'o';
    char tres = 'l';
    char cuatro = 'a';
    char cinco = 'p';
    
    String palabra = uno + "" + dos + "" + tres + "" + cuatro + "" + cinco;
    
    //Despues de varios fallos descubri que al separar los char con unas comillas
    //El sistema dejaba de fallar y compilaba con exito.
    
    System.out.println(palabra);
    
  }
}
