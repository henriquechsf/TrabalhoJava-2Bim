import java.util.Scanner;

// ler 10 numeros reis (float)
// buscar os n�meros cadastrados
// utilizar busca bin�ria
// desenvolver fun��o(m�todo) para ordena��o e busca bin�ria

public class ex10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float[] numero	= new float[10];
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Digite o " + (i + 1) + "� n�mero: ");
			numero[i] = sc.nextFloat();
		}//leitura dos dados
		
		System.out.println("Qual n�mero deseja buscar?");
		float numeroBusca = sc.nextFloat();
		
		numero = ordenar(numero);
		
		boolean resultado = buscaBinaria(numero, numeroBusca);
		
		if (resultado) {
			System.out.println("N�mero encontrado!");
		} else {
			System.out.println("Nada encontrado!");
		}//verifica��o da busca
		
	}
	
	public static float[] ordenar(float[] num) {
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					float aux = num[j];
					num[j] = num[i];
					num[i] = aux;
				}
			}
		}
		return num;
	} //metodo ordenar
	
	public static boolean buscaBinaria(float[] num, float numBusca) {
		int meio;
		int inicio = 0;
		int fim = num.length - 1;
		
		while (inicio <= fim) {
			meio = (inicio + fim) / 2;
			
			if (numBusca == num[meio]) {
				return true;
			} else if (numBusca < num[meio]) {
				fim = meio - 1;
			} else {
				inicio = meio + 1;
			}
		}
		return false;
	} //metodo busca bin�ria
	
}
