package cursojava.classes;

//super classe ou classe pai ou classe master.
public abstract class Pessoa {
	
	protected String nome;
	protected int idade;
	protected String dataNascimento;
	protected String registroGeral;
	protected String numeroCpf;
	protected String nomePai;
	protected String nomeMae;
	public String quebraLinha = System.getProperty("line.separator");
	
	

	
	//getter and setters methods.
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	//Retorna true caso seja de maior de 18 anos.
	public boolean pessoaMarioIdade() {
		return this.idade >= 18; 
	}
	
	
}
