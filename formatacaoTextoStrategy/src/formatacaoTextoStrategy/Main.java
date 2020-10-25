package formatacaoTextoStrategy;

import java.util.Scanner;

import Interface.Programa;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Formatador formatador = new Formatador();

		System.out.println("Digite seu texto: ");
		String texto = scanner.nextLine();

		System.out.println("Qual tipo de formatacao? " + "\n" + "NEGRITO(1)" + "\n" + "ITALICO(2)" + "\n"
				+ "MAIUSCULO(3)" + "\n" + "MINUSCULO(4)");
		int opcaoEntrada = scanner.nextInt();

		TipoDeFormatacao tipoDeFormatacao = TipoDeFormatacao.values()[opcaoEntrada - 1];

		System.out.println("Seu texto: " + formatador.formata(texto, tipoDeFormatacao.escolheFormato()));

	}

}
