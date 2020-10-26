/**
 * 
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio4 { 
  public static void main(String[] args) {
  
  System.out.println("Introduza su total de horas trabajadas:");
  int horas = Integer.parseInt(System.console().readLine());
  
  int horasextra;
  int totalconhorasextra;
  int totalsinhorasextra;
		
		totalsinhorasextra = horas*12;
		if (horas<0) {
			System.out.println(" Error, no puede trabajar horas negativas");
		} else {
			if (horas<=40) {
				System.out.println("Total a cobrar: "+totalsinhorasextra);
			} else {
				horasextra = horas-40;
				totalconhorasextra = horasextra*16+40*12;
				System.out.println("Total a cobrar: "+totalconhorasextra);
			}
		}
	}
  

  
}
