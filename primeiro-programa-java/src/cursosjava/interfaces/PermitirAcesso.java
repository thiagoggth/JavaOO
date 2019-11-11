package cursosjava.interfaces;

//In the interface only the method signature is implemented.
public interface PermitirAcesso {
	//signature of the methods.
	public boolean Autenticar();
	public boolean Autenticar(String login, String senha);
	
	
}
