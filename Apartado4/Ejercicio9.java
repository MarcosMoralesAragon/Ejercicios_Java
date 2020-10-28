

public class Ejercicio9 {

	public static void main(String[] args) {
    
		double a;
		double b;
		double c;
		double comprobacion;
		double resultadoconmas;
		double resultadoconmenos;
		double resultadosina;
		double resultadosinb;
    
		System.out.print("Introduce el valor de a: ");
		a = Double.parseDouble(System.console().readLine());
    
		System.out.print("Introduce el valor de b: ");
		b = Double.parseDouble(System.console().readLine());
		
    System.out.print("Introduce el valor de c: ");
		c = Double.parseDouble(System.console().readLine());
    
		comprobacion = Math.pow((-b),2)-4*a*c;
    
		if (a==0 && b==0 && c==0) {
      
			System.out.println("Tiene infinitas soluciones");
      
    }else if (a==0 && b==0){
      
      System.out.println("No tiene solucion");
      
		} else if (a==0){
      
      resultadosina = (-(c))/b;
      System.out.println("Resultado de la operacion: "+resultadosina);
    
    } else if (b==0) {
      
      resultadosinb = Math.pow((-c/a),0.5);
      System.out.println("El resultado es: +/- "+resultadosinb);
      
    } else if (comprobacion<0) {
      
      System.out.println("La raiz es negativa, por lo cual el resultado es un numero imaginario");
    
    } else {
      
      resultadoconmas = (-b+Math.pow((comprobacion),0.5))/2*a;
      resultadoconmenos = (-b-Math.pow((comprobacion),0.5))/2*a;
      System.out.println("El resultado es: "+resultadoconmas+" y "+resultadoconmenos);
      
		}
	}


}

