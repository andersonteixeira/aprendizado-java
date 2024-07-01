package org.example.console;

import java.util.Map;
import java.util.Scanner;

public class AplicacaoConsole {
	public static final String RESET = "\033[0m";
	public static final String RED = "\033[0;31m";
	public static final String GREEN = "\033[0;32m";
	public static final String YELLOW = "\033[0;33m";
	public static final String BLUE = "\033[0;34m";
	private static int escolha = 1;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Map<String, Runnable> operacoes = Map.of(
				"1", () -> {
					String inverse = inverterString(scanner);
					System.out.println("\n==========\nString invertida: " + inverse + RESET + "\n==========\n");
				},
				"2", () -> {
				long count = contarVogais(scanner);
				System.out.println("\n==========\nNúmero de vogais: " + BLUE + count + RESET + "\n==========\n");
				},
				"3", () -> {
				int somar = somarDigitos(scanner);
				if(somar != 0) {
					System.out.println("\n==========\nSoma dos dígitos: " + BLUE + somar + RESET + "\n==========\n");
				} else {
					System.out.println(RED + "Entrada inválida. Por favor, digite um número." + RESET);
				}
					},
				"4", () -> {
					String maiuscula = converterMaiusculas(scanner);
					System.out.println("\n==========\nString em maiúsculas: " + BLUE + maiuscula + RESET + "\n==========\n");
				}
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
				scanner.nextLine();

				if (escolha != 0) {
					operacoes.getOrDefault(String.valueOf(escolha),
							() -> System.out.println(RED + "\n==========\nOpção inválida\n==========\n" + RESET)).run();
				}
			} else {
				System.out.println(RED + "Entrada inválida. Por favor, digite um número." + RESET);
				scanner.nextLine();
			}
		}

		System.out.println(YELLOW + "Programa encerrado." + RESET);
		scanner.close();
	}

    public static String inverterString(Scanner scanner) {
        System.out.print(BLUE + "Digite uma string: " + RESET);
        String str = scanner.next();
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

	public static long contarVogais(Scanner scanner) {
		System.out.print("Digite uma string: ");
		String str = scanner.next();
		long count = str.chars()
				.filter(c -> "aeiouAEIOU".indexOf(c) != -1)
				.count();
		return count;
	}

    public static int somarDigitos(Scanner scanner) {
        System.out.print("Digite um número: ");
		String input = scanner.nextLine();
		int soma = 0;
		if (!input.matches("\\d+")) {
			return 0;
		}
		for (char c : input.toCharArray()) {
			soma += Character.getNumericValue(c);
		}
		return soma;
	}

    public static String converterMaiusculas(Scanner scanner) {
        System.out.print("Digite uma string: ");
        String str = scanner.next();

        return str.toUpperCase();
    }
}
