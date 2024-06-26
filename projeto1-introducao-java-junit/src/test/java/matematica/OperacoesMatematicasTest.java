package matematica;

import org.example.matematica.OperacoesMatematicas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OperacoesMatematicasTest {
	OperacoesMatematicas operacoesMatematicas = new OperacoesMatematicas();

	//Testes de sucesso
	@Test
	public void testSoma() {
		int a = 2;
		int b = 3;
		int resultado = operacoesMatematicas.somar(a, b);
		assertEquals(5, resultado);
	}

	@Test
	public void testSubtracao() {
		int a = 5;
		int b = 3;
		int resultado = operacoesMatematicas.subtrair(a, b);
		assertEquals(2, resultado);
	}

	@Test
	public void testMultiplicacao() {
		int a = 2;
		int b = 3;
		int resultado = operacoesMatematicas.multiplicar(a, b);
		assertEquals(6, resultado);
	}

	@Test
	public void testDivisao() {
		int a = 6;
		int b = 3;
		int resultado = operacoesMatematicas.dividir(a, b);
		assertEquals(2, resultado);
	}

	@Test
	public void testDivisaoPorZero() {
		int a = 6;
		int b = 0;
		assertThrows(ArithmeticException.class, () -> operacoesMatematicas.dividir(a, b));
	}

	//Testes de falha
	@Test
	public void testSomaFalha() {
		int a = 2;
		int b = 3;
		int resultado = operacoesMatematicas.somar(a, b);
		assertNotEquals(6, resultado, "A soma de 2 + 3 não deveria ser igual a 6");
	}

	@Test
	public void testSubtracaoFalha() {
		int a = 5;
		int b = 3;
		int resultado = operacoesMatematicas.subtrair(a, b);
		assertNotEquals(3, resultado, "A subtração de 5 - 3 não deveria ser igual a 3");
	}

	@Test
	public void testMultiplicacaoFalha() {
		int a = 2;
		int b = 3;
		int resultado = operacoesMatematicas.multiplicar(a, b);
		 assertNotEquals(9, resultado, "A multiplicação de 2 * 3 não deveria ser igual a 9");
	}

	@Test
	public void testDivisaoFalha() {
		int a = 6;
		int b = 3;
		int resultado = operacoesMatematicas.dividir(a, b);
		 assertNotEquals(4, resultado, "A divisão de 6 / 3 não deveria ser igual a 4");
	}
}
