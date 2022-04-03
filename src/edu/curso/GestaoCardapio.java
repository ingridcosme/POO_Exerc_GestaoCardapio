package edu.curso;

import java.util.Scanner;

public class GestaoCardapio {

	private Scanner scan = new Scanner(System.in);
	private String codigoProcurado;
	private int indice;		// Indica em qual posição deve ser guardada a próxima instância de Prato
	private Prato[] pratos;		// Matriz com 50 pratos
	
	public GestaoCardapio() {
		this.pratos = new Prato[50];
	}
	
	public void criar() {
		Prato prato = new Prato();
		
		System.out.println("Por favor, digite o CÓDIGO do prato: ");
		String codigo = scan.nextLine();
		prato.setCodigo(codigo);
		
		System.out.println("Por favor, digite o NOME do prato: ");
		String nome = scan.nextLine();
		prato.setNome(nome);
		
		System.out.println("Por favor, digite a quantidade de CALORIAS do prato: ");
		int calorias = Integer.parseInt(scan.nextLine());
		prato.setCalorias(calorias);
		
		System.out.println("Por favor, digite o PREÇO do prato: ");
		double preco = Double.parseDouble(scan.nextLine());
		prato.setPreco(preco);
		
		System.out.println("Por favor, digite os INGREDIENTES do prato: ");
		String ingredientes = scan.nextLine();
		prato.setIngredientes(ingredientes);
		
		prato.setId(indice);
		
		this.pratos[indice] = prato;
		this.indice++;
		
		System.out.println("Criado com sucesso!");
		
	}
	
	public void atualizar() {
		System.out.println("Digite o CÓDIGO do prato: ");
		codigoProcurado = scan.nextLine();
		
		int indiceProcurado = 0;
		for(Prato prato : this.pratos) {
			if(prato != null && prato.getCodigo().equals(codigoProcurado)) {
				break;
			}
			indiceProcurado++;
		}
		
		System.out.println("Digite o NOME do prato: ");
		String nome = scan.nextLine();
		this.pratos[indiceProcurado].setNome(nome);
		
		System.out.println("Digite a quantidade de CALORIAS do prato: ");
		int calorias = Integer.parseInt(scan.nextLine());
		this.pratos[indiceProcurado].setCalorias(calorias);
		
		System.out.println("Digite o PREÇO do prato: ");
		double preco = Double.parseDouble(scan.nextLine());
		this.pratos[indiceProcurado].setPreco(preco);
		
		System.out.println("Digite os INGREDIENTES do prato: ");
		String ingredientes = scan.nextLine();
		this.pratos[indiceProcurado].setIngredientes(ingredientes);
		
		System.out.println("Atualizado com sucesso!");
	}
	
	public void excluir() {
		System.out.println("Digite o CÓDIGO do(s) prato(s): ");
		codigoProcurado = scan.nextLine();
		
		int indiceProcurado = 0;
		for(Prato prato : this.pratos) {
			if(prato != null && prato.getCodigo().equals(codigoProcurado)) {
				this.pratos[indiceProcurado] = null;
			}
			indiceProcurado++;
		}
		
		System.out.println("Excluído(s) com sucesso!");
	}
	
	public void exibir() {
		System.out.println("Digite o CÓDIGO do(s) prato(s): ");
		codigoProcurado = scan.nextLine();
		
		System.out.println("\n==========================");
		for(Prato prato : this.pratos) {
			if(prato != null && prato.getCodigo().equals(codigoProcurado)) {
				System.out.println("\nCódigo: " + prato.getCodigo());
				System.out.println(prato.getNome());
				System.out.println("Ingredientes: " + prato.getIngredientes());
				System.out.println("Calorias: " + prato.getCalorias());
				System.out.printf("Preço R$ %4.2f \n", prato.getPreco());
			}
		}
		System.out.println("\n==========================");

	}
	
	public void listar() {
		System.out.println("====================================");
		System.out.println("Código \t\t Preço \t\t Prato");
		
		for(Prato prato : this.pratos) {
			if(prato != null) {
				System.out.printf("%s \t\t %4.2f \t\t %s \n", prato.getCodigo(), prato.getPreco(), prato.getNome());
			}
		}
		
		System.out.println("====================================");
		
	}
	
	public void menu() {
		
	}
	
}
