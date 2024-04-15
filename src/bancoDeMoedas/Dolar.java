package bancoDeMoedas;

public class Dolar extends Moeda {
	//especificacao das classes filhas da moeda, com seu metodo converter utilizando cambio de valores do dolar..
	
	Dolar(float valor) {
		super(valor);
	}

	

	@Override
	double converter() {
		double total = valor * 5.3;
		System.out.println();
		System.out.printf("US$ -> R$ %.2f \n\n" , total);
		return total;
	}

	@Override
	void info() {
		System.out.println();
		System.out.printf("US$ %.2f \n\n" , valor);
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	


}
