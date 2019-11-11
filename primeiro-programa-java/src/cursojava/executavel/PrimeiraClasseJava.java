package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diciplina;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constante.StatusAluno;


public class PrimeiraClasseJava {
	
	List<Aluno> alunos = new ArrayList<Aluno>();
	
	List<Aluno> alunosAprovados = new ArrayList<Aluno>();
	List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
	List<Aluno> alunosreprovados = new ArrayList<Aluno>();

	String quebraLinha = System.getProperty("line.separator");

	
	public static void main(String[] args) {
		//diretamente com o objeto.
		String login = JOptionPane.showInputDialog("Digite a seu login");
		String senha = JOptionPane.showInputDialog("Digite a sua senha");
		
	
		
		//validação de login e senha.
		if(new FuncaoAutenticacao(new Secretario(login, senha)).autenticar()) {
			
			PrimeiraClasseJava p1 = new PrimeiraClasseJava();
			try {
				p1.addAluno();
				p1.removerAluno();
				p1.repartirListaAlunos();
				p1.imprimirAlunosAprovados();
				p1.imprimirAlunosRecuperacao();
				p1.imprimirAlunosReprovados();
			}catch (Exception e) {
				//imprimindo erro!
				e.printStackTrace();
				JOptionPane.showMessageDialog(null,"Erro entre em contato com adiminstrador!");
			}
			
			
		}else {
			JOptionPane.showMessageDialog(null, "Acesso Negado!");
		}
		
	}
	
	//========= my functions ==========
	
	//funcção para adicionar novos alunos.
	public void addAluno() {		
		//adicionando novos alunos.
		int escolhaAddAluno = JOptionPane.showConfirmDialog(null, "Deseja adicionar um novo aluno? ");
		if (escolhaAddAluno == 0) {

			int continuarAddAlunos = 0;

			while (continuarAddAlunos == 0) {

				// getting user information.
				
				Aluno al = new Aluno();
				
				String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
				al.setNome(nome);
				
				String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
				al.setIdade(Integer.valueOf(idade));
				/*
				 * comentando para teste.
				String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno?");
				al.setDataNascimento(dataNascimento);
				
				
				String rg = JOptionPane.showInputDialog("Qual o RG do aluno?");
				al.setRegistroGeral(rg);
				
				String cpf = JOptionPane.showInputDialog("Qual o CPF do aluno?");
				al.setNumeroCpf(cpf);
				*/
				String nomePai = JOptionPane.showInputDialog("Qual nome do pai do aluno?");
				al.setNomePai(nomePai);
				
				String nomeMae = JOptionPane.showInputDialog("Qual nome da mãe do aluno?");
				al.setNomeMae(nomeMae);
				/*
				String dataMatricula = JOptionPane.showInputDialog("Qual a data da matricula aluno?");
				al.setDataMatricula(dataMatricula);
				
				String serie = JOptionPane.showInputDialog("Qual serie do aluno?");
				al.setSerieMatriculado(serie);
				
				String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola do aluno?");				
				al.setNomeEscola(nomeEscola);
				*/
				
				// adicionando dinamicamente materias e notas ao aluno.
				int escolhaAddDiciplina = JOptionPane.showConfirmDialog(null,
						"Deseja adcionar uma diciplina e sua nota");
				if (escolhaAddDiciplina == 0) {
					int continuarAddDiciplina = 0;
					int pos = 1;
					while (continuarAddDiciplina == 0) {
						String nomeDiciplina = JOptionPane.showInputDialog("Nome da diciplina " + pos + ": ");
						String notaDiciplina = JOptionPane.showInputDialog("Nota da diciplina" + pos + ":");
						Diciplina diciplina = new Diciplina();
						diciplina.setDiciplina(nomeDiciplina);
						//diciplina.setNotas(Double.parseDouble(notaDiciplina));

						al.getDiciplinas().add(diciplina);
						pos++;
						continuarAddDiciplina = JOptionPane.showConfirmDialog(null,
								"Deseja adcionar uma diciplina e sua nota");
					}
				}

				// removendo dinamicamente materias ao aluno.
				int escolhaRemoverDiciplina = JOptionPane.showConfirmDialog(null, "Deseja Remover uma diciplina");

				if (escolhaRemoverDiciplina == 0) {
					int continuarRemoverDiciplina = 0;

					while (continuarRemoverDiciplina == 0) {
						int qtdDiciplinas = al.getDiciplinas().size();
						String diciplinaRemover = JOptionPane.showInputDialog(al.getDiciplinas().toString()
								+ quebraLinha + quebraLinha + "Digite qual voce quer romver de 1 a " + qtdDiciplinas);
						al.getDiciplinas().remove(Integer.valueOf(diciplinaRemover).intValue() - 1);

						continuarRemoverDiciplina = JOptionPane.showConfirmDialog(null, "Deseja Remover uma diciplina");
					}
				}
				
				//adicionando a lista de alunos.
				alunos.add(al);
				continuarAddAlunos = JOptionPane.showConfirmDialog(null, "Deseja adicionar um novo aluno? ");
			}
		}
	}
	
	//função para remover alunos.
	public void removerAluno() {
		//penguntando se o usuario deseja remover um aluno.
		int escolhaRemoverAluno = JOptionPane.showConfirmDialog(null, "Deseja Remover um aluno?");

		if (escolhaRemoverAluno == 0) {
			/*
			 * Se a escolha for igual a sim:
			 * sera criado uma variavel para receber o valor da proxima pergunda
			 * para que entre na estrutura de repetição seu valor vai ser 0
			 * */
			int continuarRemoverAlunos = 0;
			boolean encontrou = false;
			
			//remover alunos ate que usuario selecione a opção nao.
			while (continuarRemoverAlunos == 0) {
				
				//variavel que ira receber o nome do aluno que usuario deseja remover.
				String procuraAlunoRemover = JOptionPane.showInputDialog("Entre com o nome do aluno: ");
				
				for (Aluno aluno : alunos) {
					/*
					 * percorrendo a lista de alunos
					 * e verificando se valor digitado
					 * é igual ao valor do nome atual do aluno.
					 */
					if(aluno.getNome().equalsIgnoreCase(procuraAlunoRemover)) {
						/*
						 * se o valor atual for igual ao digitado pelo usuario,
						 * entao o valor atual e removido da lista.
						 * e a varival "encontrou" ira receber true.
						 */
						
						alunos.remove(aluno);
						System.out.println("Sucesso!");
						encontrou = true;
						break;				
					} 
				}

				if(encontrou == false ) {
					/*
					 * se nao foi encontrado entao imprima na tela.
					 */
					System.out.println("Aluno nao encontrado!");
				}
				
				//reescrevendo o valor da variavel para ser verificado pelo while novamente.
				continuarRemoverAlunos = JOptionPane.showConfirmDialog(null, "Deseja Remover um aluno?");
			}
		}
	}
	
	//funcção para alterar um aluno.
	public void alterarAluno() {
		//altearar um aluno.
		int escolherAluno = JOptionPane.showConfirmDialog(null, "Deseja alterar um auluno");
		if (escolherAluno == 0) {
			
			int continuarAlterandoAluno = 0;
			boolean encontrou = false;
			
			//variavel que ira receber o nome do aluno que usuario deseja alterar.
			String procuraAlunoAlterar = JOptionPane.showInputDialog("Entre com o nome do aluno: ");

			while (continuarAlterandoAluno == 0) {
				
				for (Aluno aluno : alunos) {
					/*
					 * percorrendo a lista de alunos
					 * e verificando se valor digitado
					 * é igual ao valor do nome atual do aluno.
					 */
					if(aluno.getNome().equalsIgnoreCase(procuraAlunoAlterar)) {
						/*
						 * se o valor atual for igual ao digitado pelo usuario,
						 * entao o valor atual e reescrito da lista.
						 * e a varival "encontrou" ira receber true.
						 */
						
						String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
						aluno.setNome(nome);
						
						String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
						aluno.setIdade(Integer.valueOf(idade));
						
						System.out.println("Sucesso!");
						encontrou = true;
						break;				
					} 
				}
				
				if(encontrou == false) {
					System.out.println("O Aluno nao fui Encontrado!");
				}

				continuarAlterandoAluno = JOptionPane.showConfirmDialog(null, "Deseja alterar um auluno");
			}
		}
	}
	
	//função para imprimir todos os alunos na tela.
	public void imprimirAlunos() {
		//imprimindo todos os alunos.
		for (Aluno aluno : alunos) {
						
			System.out.println(aluno);
			System.out.println("Media = " + aluno.getMediaNota());
			System.out.println("O aluno esta: " + aluno.getAprovado());
			System.out.println("==========================================");
			
		}
	}
	
	//função para imprimir todos os alunos que estao aprovados.
	public void imprimirAlunosAprovados() {
		//imprimindo todos os alunos aprovados.
		boolean vazil = true;
		
		for (Aluno aluno : alunosAprovados) {
			if(aluno == null) {
				break;
			}else {
				vazil = false;
				break;
			}
		}
		
		if(vazil != true) {
			System.out.println("================ Listas dos Aprovados =================");
			for (Aluno aluno : alunosAprovados) {
				System.out.println(aluno);
				System.out.println("Media = " + aluno.getMediaNota());
				System.out.println("O aluno esta: " + aluno.getAprovado());
				System.out.println("==========================================");
				
			}			
		}else {
			System.out.println("Lista de aprovados Vazia!");
			System.out.println("==========================================");
		}
		
	}
	
	//função para imprimir todos os alunos que estao em recuperacao.
	public void imprimirAlunosRecuperacao() {
		//imprimindo todos os alunos em recuperacao.
		
		boolean vazil = true;
				
		for (Aluno aluno : alunosRecuperacao) {
			if(aluno == null) {
				break;
			}else {
				vazil = false;
				break;
			}
		}
		
		if(vazil != true) {
			
			System.out.println("================== Lista alunos em Recuperação =================");		
			for (Aluno aluno : alunosRecuperacao) {
				System.out.println(aluno);
				System.out.println("Media = " + aluno.getMediaNota());
				System.out.println("O aluno esta: " + aluno.getAprovado());
				System.out.println("==========================================");
				
			}
		}else {
			System.out.println("Lista de recuperação Vazia!");
			System.out.println("==========================================");
		}
		
		
	}
	
	//função para imprimir todos os alunos que estao Reprovados.
	public void imprimirAlunosReprovados() {
		
		//imprimindo todos os alunos Reprovados.
		
		boolean vazil = true;
		
		for (Aluno aluno : alunosreprovados) {
			if(aluno == null) {
				break;
			}else {
				vazil = false;
				break;
			}
		}
		
		if(vazil != true) {
			
			System.out.println("============== Lista dos Reprovados =================");
			for (Aluno aluno : alunosreprovados) {
				System.out.println(aluno);
				System.out.println("Media = " + aluno.getMediaNota());
				System.out.println("O aluno esta: " + aluno.getAprovado());
				System.out.println("==========================================");
				
			}			
		}else {
			System.out.println("Lista de reprovados vazia!");
			System.out.println("==========================================");
		}
		
		
	}
	

	
	//fazer uma lista dos alunos aprovados, reprovados e em recuperação.
	public void repartirListaAlunos() {
		
		for (Aluno aluno : alunos) {
			
			if(aluno.getAprovado().equalsIgnoreCase(StatusAluno.APROVADO))
				alunosAprovados.add(aluno);
			else if (aluno.getAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) 
				alunosRecuperacao.add(aluno);
			else 
				alunosreprovados.add(aluno);		
		}
	}
	
}
