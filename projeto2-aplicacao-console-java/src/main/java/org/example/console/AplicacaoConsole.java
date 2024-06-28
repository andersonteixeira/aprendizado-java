package org.example.console;

import java.util.Map;
import java.util.Scanner;

public class AplicacaoConsole {
	public static final String RESET = "\033[0m";
	public static final String RED = "\033[0;31m";
	public static final String GREEN = "\033[0;32m";
	public static final String YELLOW = "\033[0;33m";
	public static final String BLUE = "\033[0;34m";
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int escolha = -1;

		Map<String, Runnable> operacoes = Map.of(
				"1", () -> inverterString(scanner),
				"2", () -> contarVogais(scanner),
				"3", () -> somarDigitos(scanner),
				"4", () -> converterMaiusculas(scanner)
		);

		while (escolha != 0) {
			System.out.println(BLUE + "Escolha uma operação:" + RESET);
			System.out.println(YELLOW + "0 - Sair" + RESET);
			System.out.println(YELLOW + "1 - Inverter String" + RESET);
			System.out.println(YELLOW + "2 - Contar vogais" + RESET);
			System.out.println(YELLOW + "3 - Somar dígitos" + RESET);
			System.out.println(YELLOW + "4 - Converter para MAIÚSCULAS" + RESET);
			System.out.print(GREEN + "Digite a sua escolha: " + RESET);

			if (scanner.hasNextInt()) {
				escolha = scanner.nextInt();
				scanner.nextLine();  // Consumir a nova linha

				if (escolha != 0) {
					operacoes.getOrDefault(String.valueOf(escolha),
							() -> System.out.println(RED + "\n==========\nOpção inválida\n==========\n" + RESET)).run();
				}
			} else {
				System.out.println(RED + "Entrada inválida. Por favor, digite um número." + RESET);
				scanner.nextLine();  // Consumir a entrada inválida
			}
		}

		System.out.println(YELLOW + "Programa encerrado." + RESET);
		scanner.close();
	}

    private static void inverterString(Scanner scanner) {
        System.out.print(BLUE + "Digite uma string: " + RESET);
        String str = scanner.next();
        StringBuilder sb = new StringBuilder(str);
        System.out.println("\n==========\nString invertida: " + BLUE + sb.reverse() + RESET + "\n==========\n");
    }

	private static void contarVogais(Scanner scanner) {
		System.out.print("Digite uma string: ");
		String str = scanner.next();
		long count = str.chars()
				.filter(c -> "aeiouAEIOU".indexOf(c) != -1)
				.count();
		System.out.println("\n==========\nNúmero de vogais: " + BLUE + count + RESET + "\n==========\n");
	}

    private static void somarDigitos(Scanner scanner) {
        System.out.print("Digite um número: ");
        String input = scanner.nextLine();
        int soma = input.chars()
						.filter(Character::isDigit)
						.map(Character::getNumericValue)
						.sum();

        System.out.println("\n==========\nSoma dos dígitos: " + BLUE + soma + RESET + "\n==========\n");
    }

    private static void converterMaiusculas(Scanner scanner) {
        System.out.print("Digite uma string: ");
        String str = scanner.next();
        System.out.println("\n==========\nString em maiúsculas: " + BLUE + str.toUpperCase() + RESET + "\n==========\n");
    }
}
