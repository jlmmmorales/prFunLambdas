package prFunLambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Funciones {
	
	static MiFuncion fun = (int x, int y) -> x + y;
	
	public static int fun(int x, int y) {
		return x * y;
	}
	
/*	public void ejecuta() {
		System.out.println(fun.aplica(3, 6));
		System.out.println(fun(3, 6));
	}
*/	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// uso	de	una	lambda p'9
		System.out.println(fun.aplica(3,6));
		System.out.println(fun(3,6));
		
		//Inferencia de tipos en lambda p'10
		MiFuncion f1 = (x, y) -> x + y;
		MiFuncion f2 = (x, y) -> x - y;
			
		System.out.println(f1.aplica(2,3));
		pasaLambda(f2);
		pasaLambda((x, y) -> x + y);
		
		//Lambdas con bloques p'12
		MiFuncion max = (x, y) -> { int z = x;
									if (x < y) {
										z = y;
									}
									return z; };
									
		System.out.println(max.aplica(2,3));
		
		//Una lambda para Comparator
		List<String> lista = Arrays.asList("hola", "amigos", "que2", "que1", "tal");
		Comparator<String> comp = (s1,s2) -> Integer.compare(s1.length(), s2.length());
		Collections.sort(lista, comp);
		//lista.sort(comp);
		System.out.println(lista);
		
		List<String> lista2 = Arrays.asList("hola", "amigos", "que2", "que1", "tal");
		Comparator<String> comp2 = (s1,s2) -> s1.compareToIgnoreCase(s2);
		Collections.sort(lista2, comp2);
		System.out.println(lista2);

	}
	
	public static void pasaLambda(MiFuncion f){
		System.out.println(f.aplica(5, 6));
	}

}
