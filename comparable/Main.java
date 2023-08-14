package comparable;

public class Main {
    public static void main(String[] args) {
    
    	Comparable num1 = new Numero(10);
    	Comparable num2 = new Numero(12);
    
    	int mayor = num1.esMayor(num2);
    
    	if (mayor == 1) {
    	    System.out.println(num1.getValor() + " es mayor que " + num2.getValor());
    	} else if (mayor == -1) {
    	    System.out.println(num1.getValor() + " es menor que " + num2.getValor());	
    	} else {
    	    System.out.println("Son iguales");
    	}
    }
}    	
    
    
