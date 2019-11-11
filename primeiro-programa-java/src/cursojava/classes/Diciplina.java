package cursojava.classes;

import java.util.Arrays;

//classe para todas as notas e diciplinas.
public class Diciplina {
	String quebraLinha = System.getProperty("line.separator"); 
	
	//attributs.
	private String diciplina;
	//cada diciplina devera ter 4notas no ano.
	private double[] notas = new double[4];
	
	//getters and setters methods.
	public String getDiciplina() {
		return diciplina;
	}
	public void setDiciplina(String diciplina) {
		this.diciplina = diciplina;
	}
	
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] nota) {
		this.notas = nota;
	}
	
	
	//my methods
	
	public double getMediaNotas() {
		double somaTotal = 0;
		
		for(int posicao = 0; posicao > notas.length; posicao ++) {
			somaTotal += notas[posicao];
		}
		
		return somaTotal / notas.length;
	}
	
	
	
	//===== java methods =====.
	
	@Override
	public String toString() {
		
		return quebraLinha +  diciplina + 
				quebraLinha +"======== notas ========" +
				quebraLinha + "nota 1 = "  + notas[0] + 
				quebraLinha + "nota 2 = "  + notas[1] + 
				quebraLinha + "nota 3 = "  + notas[2] +
				quebraLinha + "nota 4 = "  + notas[3];
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diciplina == null) ? 0 : diciplina.hashCode());
		result = prime * result + Arrays.hashCode(notas);
		result = prime * result + ((quebraLinha == null) ? 0 : quebraLinha.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diciplina other = (Diciplina) obj;
		if (diciplina == null) {
			if (other.diciplina != null)
				return false;
		} else if (!diciplina.equals(other.diciplina))
			return false;
		if (!Arrays.equals(notas, other.notas))
			return false;
		if (quebraLinha == null) {
			if (other.quebraLinha != null)
				return false;
		} else if (!quebraLinha.equals(other.quebraLinha))
			return false;
		return true;
	}
	
}
