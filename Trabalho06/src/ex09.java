import java.util.Scanner;

// ler 10 numeros reis (float)
// buscar os números cadastrados
// utilizar busca binária

public class ex09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float[] numero = new float[10];
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			numero[i] = sc.nextFloat();
		}//leitura dos dados
		
		for (int i = 0; i < numero.length; i++) {
			for (int j = i + 1; j < numero.length; j++) {
				if (numero[i] > numero[j]) {
					float aux = numero[j];
					numero[j] = numero[i];
					numero[i] = aux;
				}
			}
		}//ordenar array numero
		
		System.out.println("Qual número deseja buscar?");
		float numeroBusca = sc.nextFloat();
		
		int meio;
		int inicio = 0;
		int fim = numero.length - 1;
		
		while (inicio <= fim) {
			meio = (inicio + fim) / 2;
			
			if (numeroBusca == numero[meio]) {
				System.out.println("Número encontrado!");
				return;	
			} else if (numeroBusca < numero[meio]) {
				fim = meio - 1;
			} else {
				inicio = meio + 1;
			}
		}
		System.out.println("Nada encontrado!");
		//busca binária
		
	}
}
