import java.util.Scanner;

// ler o nome e idade de 10 pessoas
// ordenar por idade em ordem decrescente com método bolha
// listar os nomes e idades ordenados na tela

public class ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] nome = new String[10];
		int[] idade = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o nome da " + (i + 1) + "ª pessoa: ");
			nome[i] = sc.next();
			System.out.println("Digite a idade da " + (i + 1) + "ª pessoa: ");
			idade[i] = sc.nextInt();
		}//leitura dos dados
		
		listarNomeIdade(nome, idade);
		//chamada do método
	}
	
	public static void listarNomeIdade(String[] nome, int[] idade) {
		for (int i = 0; i < idade.length; i++) {
			for (int j = i + 1; j < idade.length; j++) {
				if (idade[i] < idade[j]) {
					int aux = idade[j];
					idade[j] = idade[i];
					idade[i] = aux;
					
					String auxN = nome[j];
					nome[j] = nome[i];
					nome[i] = auxN;
				}
			}
		}//ordenar por idade
		
		for (int i = 0; i < idade.length; i++) {
			System.out.println(nome[i] + " " + idade[i]);
		}//imprime na tela
	}
	
}
