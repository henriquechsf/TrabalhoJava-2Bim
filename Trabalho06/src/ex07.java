import java.util.Scanner;

// ler 10 produtos
// permitir usuario fazer busca pelos produtos cadastrados
//utilizar busca binária

public class ex07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] codProduto = new int[10];
		
		for (int i = 0; i < codProduto.length; i++) {
			System.out.println("Digite o código do " + (i + 1) + "º produto: ");
			codProduto[i] = sc.nextInt();
		}//leitura dos dados
		
		System.out.println("Qual cod do produto deseja buscar?");
		int codBusca = sc.nextInt();
		
		for (int i = 0; i < codProduto.length; i++) {
			for (int j = i + 1; j < codProduto.length; j++) {
				if (codProduto[i] > codProduto[j]) {
					int aux = codProduto[j];
					codProduto[j] = codProduto[i];
					codProduto[i] = aux;
				}
			}
		}//ordenar array codProduto
		
		int meio;
		int inicio = 0;
		int fim = codProduto.length - 1;
		
		while (inicio <= fim) {
			meio = (inicio + fim) / 2;
			
			if (codBusca == codProduto[meio]) {
				System.out.println("Produto encontrado!");
				return;
			} else if (codBusca < codProduto[meio]) {
				fim = meio - 1;
			} else {
				inicio = meio + 1;
			}
		}
		System.out.println("Código não encontrado!");
		// busca binária
	}
}
