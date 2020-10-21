/**
 * Creacion de un programa que calcula el precio final ( con iva), de objetos sin iva
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio7 { 
  public static void main(String[] args) {
    
  String linea;
      
      System.out.print("Introduzca el precio sin iva: ");
      linea = System.console().readLine();
      int precioSinIva;
      precioSinIva = Integer.parseInt(linea);
    
      double precioConIva;
      precioConIva = precioSinIva * 1.21;
    
      System.out.println("La factura final con iva es: " + precioConIva);
  
  }
}
