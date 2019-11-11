package cursojava.executavel;

public class Matriz {
	
	public static void main(String[] args) {
		int notas [][] = new int [2][3];
		
		notas[0][0] = 10;
		notas[0][1] = 6;
		notas[0][2] = 8;
		
		notas[1][0] = 8;
		notas[1][1] = 6;
		notas[1][2] = 10;
		
		for (int[] is : notas) {
			for (int is2 : is) {
				System.out.println(is2);
			}
		}
		
	}

}
