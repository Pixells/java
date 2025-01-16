package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {
	
		/* new Aluno() é uma instância (Criação de Objeto) */
		/* aluno1 é uma referência para o objeto aluno */
		Aluno aluno1 = new Aluno(); /* Aqui será o João */

		Aluno aluno2 = new Aluno(); /* Aqui será o Pedro */

		Aluno aluno3 = new Aluno(); /* Aqui será o Alex */
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);

	}
}
