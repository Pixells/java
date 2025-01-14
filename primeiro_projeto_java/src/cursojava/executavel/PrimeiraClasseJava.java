package cursojava.executavel;

public class PrimeiraClasseJava {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {
			
		int nota1 = 90;
		int nota2 = 69;
		
		/*Operadores relacionais*/
		if (nota1 == nota2) {
			System.out.println("As notas são iquais");
		}else {
			System.out.println("As notas não são iquais");
		}
		
		if (nota1 != nota2) {
			System.out.println("As notas são diferentes");
		}else {
			System.out.println("Notas são iquais");
		}
		
		if (nota1 > nota2) {
			System.out.println("A nota1 é maior que nota2");
		}else {
			System.out.println("As nota1 é menor que a nota2");
		}
		
		if (nota1 < nota2) {
			System.out.println("nota1 é menor que nota2");
		}else {
			System.out.println("nota1 é maior que a nota2");
		}
		
		if (nota1 >= nota2) {
			System.out.println("A nota1 é maior ou iqual a nota2");
		}else {
			System.out.println("As nota1 é menor ou iqual a nota2");
		}
		
		if (nota1 <= nota2) {
			System.out.println("nota1 é menor ou iqual a nota2");
		}else {
			System.out.println("nota1 é maior ou iqual a nota2");
		}
		
		
	}
}
