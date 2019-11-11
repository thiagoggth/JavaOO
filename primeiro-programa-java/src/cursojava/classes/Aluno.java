package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

import cursojava.constante.StatusAluno;

public class Aluno extends Pessoa {
	
	
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private List<Diciplina> diciplinas = new ArrayList<Diciplina>();
	 
	
	
	//creating getters and setters methods.
	public void setDiciplinas(List<Diciplina> diciplinas) {
		this.diciplinas = diciplinas;
	}
	
	public List<Diciplina> getDiciplinas() {
		return diciplinas;
	}
	
	public String getNome() {
		return super.nome;
	}
	public void setNome(String nome) {
		super.nome = nome;
	}
	public int getIdade() {
		return super.idade;
	}
	public void setIdade(int idade) {
		super.idade = idade;
	}
	public String getDataNascimento() {
		return super.dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		super.dataNascimento = dataNascimento;
	}
	public String getRegistroGeral() {
		return super.registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		super.registroGeral = registroGeral;
	}
	public String getNumeroCpf() {
		return super.numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		super.numeroCpf = numeroCpf;
	}
	
	public String getNomePai() {
		return super.nomePai;
	}
	public void setNomePai(String nomePai) {
		super.nomePai = nomePai;
	}
	
	public String getNomeMae() {
		return super.nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		super.nomeMae = nomeMae;
	}
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public String getSerieMatriculado() {
		return serieMatriculado;
	}
	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
		
	/*================= my methods ================*/
	
	
	public double getMediaNota() {
		
		double somaNotas = 0.0; 
		
		for (Diciplina diciplina : diciplinas) {
			somaNotas += diciplina.getMediaNotas();
			
		}

		
		return somaNotas / diciplinas.size();
	}
	
	
	public String getAprovado() {
		String resposta;
		double mediaNota = this.getMediaNota();
		
		if(mediaNota >= 5) {
			if(mediaNota >= 7) {
				resposta = StatusAluno.APROVADO;
			}else {
				resposta = StatusAluno.RECUPERACAO;
			}
		}else{
			resposta = StatusAluno.REPROVADO;
		}
		
		return resposta;
	}
	
	@Override
	public boolean pessoaMarioIdade() {
		
		
		return idade >=21;
	}
	
	public String msgMaiorIdade() {
		return this.pessoaMarioIdade() ? "Aluno maior idade" : "Aluno menor de idade";
	}

	/*========= Java Methods =========*/
	@Override
	public String toString() {
		return "Nome do aluno = " + nome + quebraLinha + 
				"Idade = " + idade + quebraLinha +
				"Data de nascimento = " + dataNascimento + quebraLinha + 
				"RG = " + registroGeral + quebraLinha + 
				"CPF = " + numeroCpf + quebraLinha + 
				"Nome do pai = " + nomePai + quebraLinha +
				"Nome da mãe = " + nomeMae + quebraLinha +
				"Data da matricula = " + dataMatricula + quebraLinha +
				"Nome da escola = " + nomeEscola + quebraLinha +
				"Cursando = " + serieMatriculado + quebraLinha +
				"diciplinas e notas: " + diciplinas + quebraLinha;
	}	
	
}
