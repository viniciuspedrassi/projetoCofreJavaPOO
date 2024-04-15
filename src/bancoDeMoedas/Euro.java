package bancoDeMoedas;

public class Euro  extends Moeda{
	//especificacao das classes filhas da moeda, com seu metodo converter utilizando cambio de valores do euro.

	Euro(float valor) {
		super(valor);
	}

	@Override
	double converter() {
		double total = valor * 5.7;
		System.out.println();
		System.out.printf("€$ -> R$ %.2f \n\n " , total );

		return total;
	}


	@Override
	void info() {
		System.out.println();
		System.out.printf("€$ %.2f \n\n" , valor);
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
