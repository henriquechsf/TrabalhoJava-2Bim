import java.util.Scanner;

// ler 10 produtos
// permitir usuario fazer busca pelos produtos cadastrados
//desenvolver função(método) para busca sequencial

public class ex06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] produto = new String[10];
		
		for (int i = 0; i < produto.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º produto: ");
			produto[i] = sc.next();
		}//leitura dos dados
		
		System.out.println("Qual produto deseja buscar?: ");
		String prodBusca = sc.next();
		//ler produto da busca
		
		boolean resultado = buscaSequencial(produto, prodBusca);
		
		if (resultado == true) {
			System.out.println("Produto encontrado!");
		} else {
			System.out.println("Nada encontrado!");
		}//verificar busca
		
	}
	
	public static boolean buscaSequencial(String[] produto, String prodBusca) {
		for (int i = 0; i < produto.length; i++) {
			if (produto[i].equals(prodBusca)) {
				return true;
			}
		}
		return false;
	}//método busca sequencial
	
}
