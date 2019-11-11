package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diciplina;		

public class ArrayVetor {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Thiago Augusto");
		aluno.setNomeEscola("Ada");
		
		Diciplina diciplina = new Diciplina();
		diciplina.setDiciplina("Curso de java OO");
		double[] notas = {8.8,9.9,7,6.5};
		diciplina.setNotas(notas);
		
		//adicionando a diciplina para o aluno.
		aluno.getDiciplinas().add(diciplina);
		
		//segunda diciplina
		
		double[] notas2 = {9.9,8,5.5,9.8};
		
		Diciplina diciplina2 = new Diciplina();
		diciplina2.setDiciplina("logica de programação");
		diciplina2.setNotas(notas2);
		
		aluno.getDiciplinas().add(diciplina2);
		
		//--------------------------------------------------------
		
		Aluno [] arrayAlunos = new Aluno[1];
		
		arrayAlunos[0] = aluno;
		
		for (Aluno alunoAtual : arrayAlunos) {
			System.out.println("Nome do aluno: " + alunoAtual.getNome());
			
			for (Diciplina d : alunoAtual.getDiciplinas()) {
				System.out.println(d.getDiciplina());
				
				for(double nota : d.getNotas()) {
					System.out.println("Nota = " + nota);
				}
				
			}
		}
		
		
	}

}
