/**
 * Programa que hace piramides de el caracter que le introduces
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio15 { 
  public static void main(String[] args) {
   
   System.out.println("Introduce el caracter con el que quieres hacer la piramide");
   System.out.println("");
   System.out.print("> ");
   String x = System.console().readLine();
   System.out.println ("");
   
   System.out.println ("SELECCIONE LA ORIENTACION DE LA PIRAMIDE");
   System.out.println ("-----------------------------------------");
   System.out.println ("1. ARRIBA");
   System.out.println ("2. ABAJO");
   System.out.println ("3. DERECHA");
   System.out.println ("4. IZQUIERDA");
   System.out.println ("-----------------------------------------");
   System.out.println("");
   System.out.print("> ");
   int direccion =Integer.parseInt(System.console().readLine());
   System.out.println ("");
   
   switch (direccion) {
     case 1:
     System.out.println("    " + x);
     System.out.println("   " + x + x + x);
     System.out.println("  "+ x + x + x + x + x);
     System.out.println(" " + x + x + x + x + x + x + x);
     System.out.println(x + x + x + x + x + x + x + x + x);
    break;
     
     case 2:
     System.out.println(x + x + x + x + x + x + x + x + x);
     System.out.println(" " + x + x + x + x + x + x + x);
     System.out.println("  "+ x + x + x + x + x);
     System.out.println("   " + x + x + x);
     System.out.println("    " + x);
    break;
    
     case 3:
     System.out.println(x);
     System.out.println(x + x + x);
     System.out.println(x + x + x + x + x);
     System.out.println(x + x + x + x + x + x + x);
     System.out.println(x + x + x + x + x + x + x + x + x);
     System.out.println(x + x + x + x + x + x + x);
     System.out.println(x + x + x + x + x);
     System.out.println(x + x + x);
     System.out.println(x);
    break;
    
     case 4:
     System.out.println("        " + x);
     System.out.println("      " + x + x + x);
     System.out.println("    " + x + x + x + x + x);
     System.out.println("  " + x + x + x + x + x + x + x);
     System.out.println(x + x + x + x + x + x + x + x + x);
     System.out.println("  " + x + x + x + x + x + x + x);
     System.out.println("    " + x + x + x + x + x);
     System.out.println("      " + x + x + x);
     System.out.println("        " + x);
    break;
    
    default :
     System.out.println("Error, introduzca otra vez la dirección");
    }
	}
}
