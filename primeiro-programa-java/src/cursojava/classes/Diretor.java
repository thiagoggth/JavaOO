package cursojava.classes;

import cursosjava.interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso {
	
	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;
	private String login;
	private String senha;
	
	public Diretor(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public Diretor() {
		
	}
	
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	@Override
	public String toString() {
		return quebraLinha + "====== Diretores =====" + quebraLinha +
				"Nome  = " + nome + quebraLinha +  
				"idade = " + idade + quebraLinha + 
				"Data de Nascimento = " + dataNascimento + quebraLinha +
				"RG = " + registroGeral + quebraLinha + 
				"CPF = " + numeroCpf + quebraLinha + 
				"Nome do pai = " + nomePai + quebraLinha +
				"Nome da mae = " + nomeMae  + quebraLinha +
				"registroEducacao = " + registroEducacao + quebraLinha + 
				"tempoDirecao = " + tempoDirecao + quebraLinha +
				"titulacao = " + titulacao;
				
	}
	
	@Override
	public boolean Autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return login.equals("admin") && senha.equals("admin");
	}
	@Override
	public boolean Autenticar() {
		// TODO Auto-generated method stub
		return this.login.equals("admin")&&this.senha.equals("admin");
	}

}
