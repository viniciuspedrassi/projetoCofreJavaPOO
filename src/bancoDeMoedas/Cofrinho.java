package bancoDeMoedas;

import java.util.ArrayList;


public class Cofrinho {
	//criacao de uma arraylist private com uso de set e and get para armazenamento das novas moedas cadastradas pelo usuario
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

	public ArrayList<Moeda> getListaMoedas() {
		return listaMoedas;
	}

	public void setListaMoedas(ArrayList<Moeda> listaMoedas) {
		this.listaMoedas = listaMoedas;
	}
	//criaçao do metodo adicionar para cada moeda nova
	public void adicionar (Moeda m) {
		listaMoedas.add(m);
	}
	//criacao do metodo remover para cada moeda retirada
	public void remover (Moeda m) {
		listaMoedas.remove(m);
	}
	//cricao do metodo listar, percorrendo a arraylist e executando o metodo info de cada objeto na lista.
	public void listar () {
		for (Moeda m : listaMoedas) {
			m.info();
		}
	}
	//criacao do metodo converter, percorrendo toda a lista, aplicando o metodo converter em cada moeda e retornando seu total em reais
	public  void  converter (Moeda m) {
		
			double total = 0;
	       
	        for(Moeda m1 : listaMoedas)
	        {
	            total += m1.converter();
	        }

	        System.out.println();
	        System.out.printf("Total em R$: %.2f \n\n" , total);
	    }
	
	public void finalizar () {
		System.out.println("Encerrando o programa...");
	}
					
	}
	
	



