import java.util.Scanner;

//ler a nota de 10 alunos
//colocar em ordem crescente com método bolha
//listar as notas ordenadas na tela
//usar função(método) para ordenação

public class ex03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float[] nota = new float[10];
		
		for (int i = 0; i < nota.length; i++) {
			System.out.println("Digite a " + (i + 1) + "ª nota: ");
			nota[i] = sc.nextFloat();
		}//leitura dos dados
		
		nota = ordenar(nota);
		
		for (int i = 0; i < nota.length; i++) {
			System.out.println(nota[i]);
		}
		
	}
	
	public static float[] ordenar(float[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[i] > vetor[j]) {
					float aux = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = aux;
				}
			}
		}
		return vetor;
	}//metodo ordenação bolha
	
}
