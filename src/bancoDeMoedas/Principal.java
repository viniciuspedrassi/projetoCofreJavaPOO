package bancoDeMoedas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//criacao de variaveis para receber opcoes nos menus principais e de adicionar e remover, inicialização de um objeto da classe
		// moeda para receber os valores de novas moedas, etc.
		Scanner teclado = new Scanner(System.in);
		int opcao, tipoMoeda;
		Moeda nova = null;
		Cofrinho cofrinho = new Cofrinho();
		// menu inicial, com boas vindas ao usuario
		System.out.println("Bem vindo ao Banco do Marcus Vinicius.");
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		System.out.println("1 - ADICIONAR");
		System.out.println("2 - REMOVER");
		System.out.println("3 - LISTAR");
		System.out.println("4 - TOTAL CONVERTIDO");
		System.out.println("5 - ENCERRAR");
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		opcao = teclado.nextInt();
		
		//condicional do menu inicial e principal
		
		while (opcao !=0) {
			
			
			
			switch(opcao) {
			
			case 1:
				// condicoes do medoto adicionar e criação do menu de tipos de moedas para adicionar ou remover
				tipoMoeda=0;
					while (tipoMoeda>3 || tipoMoeda<=0) {
						System.out.println("1- REAL");
						System.out.println("2- DÓLAR");
						System.out.println("3- EURO");
						tipoMoeda = teclado.nextInt();					
					}
				nova =null;	
					if (tipoMoeda==1) {
						System.out.println("Digite um valor: ");
						float entrada = teclado.nextFloat();
						nova = new Real (entrada);
					}
					if (tipoMoeda==2) {
						System.out.println("Digite um valor: ");
						float entrada = teclado.nextFloat();
						nova = new Dolar (entrada);
					}
					if (tipoMoeda==3) {
						System.out.println("Digite um valor: ");
						float entrada = teclado.nextFloat();
						nova = new Euro (entrada);
					}
					cofrinho.adicionar(nova);
				break;
			case 2:
				// condicoes do metodo remover
				tipoMoeda=0;
				while (tipoMoeda>3 || tipoMoeda<=0) {
					System.out.println("1- REAL");
					System.out.println("2- DÓLAR");
					System.out.println("3- EURO");
					tipoMoeda = teclado.nextInt();					
				}
				nova =null;	
				if (tipoMoeda==1) {
					System.out.println("Digite um valor: ");
					float entrada = teclado.nextFloat();
					nova = new Real (entrada);
				}
				if (tipoMoeda==2) {
					System.out.println("Digite um valor: ");
					float entrada = teclado.nextFloat();
					nova = new Dolar (entrada);
				}
				if (tipoMoeda==3) {
					System.out.println("Digite um valor: ");
					float entrada = teclado.nextFloat();
					nova = new Euro (entrada);
				}
				cofrinho.remover(nova);
				break;
			case 3: 
				//execução do método listar
				cofrinho.listar();
				break;
			case 4: 
				//execução do método para somar e converter
				cofrinho.converter(nova);
				break;
			case 5:
				//execução do método encerrar para imprimir ao usuario na tela o fim do programa
				cofrinho.finalizar();
				System.exit(0);
				break; 
			default:
			System.out.println("Opção Inválida.");
				break;
			}
			
		
			
			
		
		
		
		
		
		
		
		
			
		System.out.println("------.Banco do Marcus Vinicius.------");
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		System.out.println("1 - ADICIONAR");
		System.out.println("2 - REMOVER");
		System.out.println("3 - LISTAR");
		System.out.println("4 - TOTAL CONVERTIDO");
		System.out.println("5 - ENCERRAR");
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		opcao = teclado.nextInt();
			
		}

	}
}
