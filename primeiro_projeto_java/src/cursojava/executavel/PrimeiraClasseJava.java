package cursojava.executavel;

public class PrimeiraClasseJava {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {

		/* Estrutura de repetição FOR e o Continue */
		
		for (int numero = 0; numero <= 10; numero ++) {
			if (numero == 3 || numero == 6 || numero == 9) {
				System.out.println("Achamos o número " + numero);
				continue;
			}
			
			System.out.println("Processando laço de repetição ");
		}
	}
}
