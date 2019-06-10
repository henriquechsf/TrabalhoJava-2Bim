import java.util.Scanner;

// ler 10 produtos
// ao final permitir busca sequencial por produto

public class ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] produto = new String[10];
		
		for (int i = 0; i < produto.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º produto: ");
			produto[i] = sc.next();
		}//leitura dos dados
		
		System.out.println("Qual produto deseja buscar?: ");
		String prodBusca = sc.next();
		//ler produto a ser buscado
		
		for (int i = 0; i < produto.length; i++) {
			if (produto[i].equals(prodBusca)) {
				System.out.println("Produto encontrado!");
				return;
			}
		}
		System.out.println("Nada encontrado!");
		//busca sequencial
	}
}
