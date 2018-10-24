package controller;

import util.Teclado;

public class Operadores {

	public static void main(String[] args) {
	String nome;
	nome = Teclado.lertexto("digite o nome do aluno: ");
	int nota1;
	nota1 = Teclado.lerInt("digite nota 1: ");
			
	int nota2;
	nota2 = Teclado.lerInt("digite nota 2: ");
			
	int nota3;
	nota3 = Teclado.lerInt("digite nota 3: ");
	
	int nota4;
	nota4 = Teclado.lerInt("digite nota 4: ");
	
	int media = nota1 + nota2 + nota3 + nota4;
	media = media/4;
	
    System.out.println("A média é: "+ media);
    System.out.println("o nome é: "+ nome);
	}

}
