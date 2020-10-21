/**
 * Calcular el area de un triangulo
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio6 { 
  public static void main(String[] args) {
    
      String linea;
    
    System.out.print("Introduzca la base de su triangulo: ");
    linea = System.console().readLine();
    int base;
    base = Integer.parseInt(linea);
    
    System.out.print("Introduzca la altura de su triangulo: ");
    linea = System.console().readLine();
    int altura;
    altura = Integer.parseInt(linea);
    
    double area;
    area = (base * altura) / 2;
    
    System.out.println("La area final de su triangulo es: " + area);
    
  }
}
