package cursojava.executavel;

public class PrimeiraClasseJava {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {

		/* Estrutura de repetição WHILE e DO WHILE */
		int numero = 0;

		while (numero <= 10) { /* Verifica e depois executa o código */
			System.out.println("O numéro atual é: " + numero);
			numero++;
		}

		/*------------------------------------------------------------*/
		int numero2 = 0;

		do { /* Primeiro executa e depois ele verifica */

			System.out.println("O numéro atual é: " + numero2);
			numero2++;

		} while (numero2 <= 60);
	}
}
