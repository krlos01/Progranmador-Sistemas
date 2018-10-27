package controller;

import util.Teclado;

public class ProgramacaoMultiplaEscolha {
	public static void main(String[] args) {
		int matr, numFinal;
		matr = Teclado.lerInt("Informe matrícula");
		numFinal = matr % 10;
		switch (numFinal) {
		case 0:
			System.out.println("pagamento em Janeiro");
			break;
		case 1:
			System.out.println("pagamento em Fevereiro");
			break;
		case 2:
			System.out.println("pagamento em Março");
			break;
		case 3:
			System.out.println("pagamento em Abril");
			break;
		default:
			System.out.println("pagamento em Maio");
		}
	}
}
