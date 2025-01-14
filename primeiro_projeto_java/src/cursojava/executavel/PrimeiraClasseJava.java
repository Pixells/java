package cursojava.executavel;

public class PrimeiraClasseJava {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {

		int nota1 = 90;
		int nota2 = 20;
		int nota3 = 90;
		int nota4 = 90;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/*SWITCH CASE: Operações exatas*/
		int dia = 7;
		switch (dia) {
		case 1:
			System.out.println("domingo ");
			break;
			
		case 2:
			System.out.println("Segunda-feira ");
			break;
			
		case 3:
			System.out.println("Terça-feira ");
			break;
			
		case 4:
			System.out.println("Quarta-feira ");
			break;
			
		case 5:
			System.out.println("Quinta-feira ");
			break;
			
		case 6:
			System.out.println("Sexta-feira ");
			break;
			
		case 7:
			System.out.println("Sabado ");
			break;
			
		default: System.out.println("Outro dia qualquer ");
			break;
		}
		

	}
}
