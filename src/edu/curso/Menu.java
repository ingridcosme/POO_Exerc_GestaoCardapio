package edu.curso;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		GestaoCardapio gc = new GestaoCardapio();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			menu();
			String textoMaiusculo = scan.nextLine().toUpperCase();
		    char letra = textoMaiusculo.charAt(0);

			switch(letra) {
				case 'C':
					gc.criar();
					break;
				case 'E':
					gc.exibir();
					break;
				case 'R':
					gc.excluir();
					break;
				case 'A':
					gc.atualizar();
					break;
				case 'L':
					gc.listar();
					break;
				case 'S':
					System.exit(0);
			}
		}
	}
	
	private static void menu() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\n\n=== O QUE VOCÊ DESEJA FAZER? ===\n\n");
		buffer.append("\t(C) Criar\t\n");
		buffer.append("\t(E) Exibir\t\n");
		buffer.append("\t(R) Remover\t\n");
		buffer.append("\t(A) Atualizar\t\n");
		buffer.append("\t(L) Listar\t\n");
		buffer.append("\t(S) Sair\t\n");
		buffer.append("====================================\n\n");

		System.out.println(buffer.toString());
	}

}