import org.example.console.AplicacaoConsole;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class AplicacaoConsoleTest {

	@Test
	public void testeInverterString() {
		String input = "abcd";
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());

		Scanner scanner = new Scanner(inputStream);
		assertEquals("dcba", AplicacaoConsole.inverterString(scanner));
	}

	@Test
	public void somar() {
		String input = "23";
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());

		Scanner scanner = new Scanner(inputStream);
		assertEquals(5, AplicacaoConsole.somarDigitos(scanner));
	}

	@Test
	public void somarDigitosComEntradaInvalida() {
		String input = "abc";
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
		Scanner scanner = new Scanner(inputStream);

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream));

		int result = AplicacaoConsole.somarDigitos(scanner);
		assertEquals(0, result);
	}

	@Test
	public void converterMaiusculas() {
		String input = "abcde";
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());

		Scanner scanner = new Scanner(inputStream);
		assertEquals("ABCDE", AplicacaoConsole.converterMaiusculas(scanner));
	}
}
