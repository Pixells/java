package cursojava.executavel;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {

		/* Criando uma opção de confirmação */
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros: ");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas: ");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero); // 4
		
		double resto = carroNumero % pessoaNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisão para pessoas deu " + divisao);
		} else {
			System.out.println("Não quis ver o resultado !");
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o RESTO da divisão?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "O resto da divisão é: " + resto);
		} else {
			System.out.println("Não quis ver o resultado !");
		}
		
	}
}
