package cursojava.executavel;

public class PrimeiraClasseJava {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {

		/* Estrutura de repetição e parada com Break */
		
		for (int numero = 0; numero <= 10; numero ++) {
			if (numero == 3) {
				System.out.println("Achamos o número 3");
				System.out.println("Estou parando de executar...");
				break;
			}
		}
		
	}
}
