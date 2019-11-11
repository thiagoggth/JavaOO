package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;

import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Thiago");
		aluno.setIdade(16);
		aluno.pessoaMarioIdade();
		
		Secretario secretario = new Secretario();
		secretario.setNome("Meliodas");
		secretario.setIdade(50);
		secretario.pessoaMarioIdade();
		
		
		Diretor diretor = new Diretor();
		diretor.setNome("Joao Paulo");
		diretor.setIdade(18);
		diretor.pessoaMarioIdade();
		
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.msgMaiorIdade());
		
		
	}

}
