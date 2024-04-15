package bancoDeMoedas;

abstract public class Moeda {
	//criacao da classe abstrata que recebe uma variavel valor, e chamada dos metodos abstratas info e converter 
	double valor;

	Moeda(float valor) {
		super();
		this.valor = valor;
	}
	
	abstract void info ();
	
	abstract double converter();
	
	

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}
	

}