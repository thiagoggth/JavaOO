package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArrayJava {
	
	
	
	public static void main(String[] args) {
		String texto = "thiago, Augusto Mandela, goncalves, Silva";
		
		String [] valoresArray = texto.split(", ");
		
		//convertendo um array em uma lista:
		List<String> list = Arrays.asList(valoresArray);
		System.out.println("-----Lista-----");
		for (String nome : list) {
			System.out.println(nome);
		}
		
		
		//convertendo uma lista para um array:		
		String[] conversaoArray = list.toArray(new String[4]);
		System.out.println("-----Array-----");
		for (String string : conversaoArray) {
			
			System.out.println(string);
		}
	}

}
