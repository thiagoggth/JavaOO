package cursojava.classes;

import cursosjava.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso{
	
	private String registro;
	private String nivelCargo;
	private String experiencia;
	private String login;
	private String senha;
	
	public Secretario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public Secretario() {
		//TODO Auto-generate constructor stub.
	}
	
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	@Override
	public String toString() {
		return quebraLinha + "==== Secretarios ====" + quebraLinha + 				
				"Nome  = " + nome + quebraLinha +  
				"idade = " + idade + quebraLinha + 
				"Data de Nascimento = " + dataNascimento + quebraLinha +
				"RG = " + registroGeral + quebraLinha + 
				"CPF = " + numeroCpf + quebraLinha + 
				"Nome do pai = " + nomePai + quebraLinha +
				"Nome da mae = " + nomeMae  + quebraLinha +
				"Registro = " + registro + quebraLinha +
				"Nivel do cargo = " + nivelCargo + quebraLinha +
				"Experiencia = " + experiencia; 
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
