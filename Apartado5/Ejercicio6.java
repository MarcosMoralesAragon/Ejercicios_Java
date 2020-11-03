/**
 * Muestra los primeros números del 320 al 160 contando de 20 en 20
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio6 { 
  public static void main(String[] args) {
   
   int  i = 320;
   
    do {
     System.out.println(i);
     i = (i - 20);
    } while (i>=160);
	}
}
