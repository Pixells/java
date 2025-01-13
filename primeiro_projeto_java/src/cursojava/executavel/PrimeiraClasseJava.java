package cursojava.executavel;

public class PrimeiraClasseJava {
	
	/*Main é um metodo auto executavel em Java*/
	public static void main(String[] args) {
		
		/*Concatenação = Unir ou juntar dados*/
		String nome = "João Paulo";
		String sobrenome = "Carvalho";
		String cpf = "142.242.214-02";
		String telefone = "071 829424234";
		String endereco = "Vila Melo - ES";
		int idade = 25;
		
		String saida = "Meu nome é " + nome + " " + sobrenome + " meu cpf é " + cpf + " meu telefone é " + telefone + "e eu moro em " + endereco + " e minha idade é " + idade + " anos.";
		
		System.out.println(saida); 
	}
}
