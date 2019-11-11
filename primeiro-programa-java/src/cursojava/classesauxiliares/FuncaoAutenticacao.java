package cursojava.classesauxiliares;

import cursosjava.interfaces.PermitirAcesso;

//seg
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.Autenticar();
	}
	
	public FuncaoAutenticacao (PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}

}
