package bancoDeMoedas;

public class Real extends Moeda{
	//especificacao das classes filhas da moeda, com seu metodo converter utilizando o valor padrao multiplicado por um para definição da moeda real..

	Real(float valor) {
		super(valor);
	}

	
	
	@Override
	double converter() {
		double total = valor;
		System.out.println();
		System.out.println("R$ " + total);
		System.out.println();
		System.out.println();
		return total;
	}


	@Override
	void info() {
		System.out.println();
		System.out.printf("R$ %.2f \n\n ", valor);
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
