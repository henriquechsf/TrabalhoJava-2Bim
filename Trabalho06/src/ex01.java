import java.util.Scanner;

// ler o nome e nota1 e nota2 de 5 alunos usando vetor para salvar os dados
// mostrar o nome do aluno
// a m�dia obtida
// se o aluno est� aprovado ou reprovado

public class ex01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] nome = new String[5];
		float[] nota1 = new float[5];
		float[] nota2 = new float[5];
		float[] media = new float[5];
		//variaveis
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Nome do aluno: ");
			nome[i] = sc.next();
			System.out.println("Nota 01: ");
			nota1[i] = sc.nextFloat();
			System.out.println("Nota 02: ");
			nota2[i] = sc.nextFloat();
			
			media[i] = (nota1[i] + nota2[i]) / 2;
		}//la�o para leitura dos dados
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Aluno: " + nome[i] + "\nM�dia: " + media[i]);
			
			if (media[i] >= 7) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}
			System.out.println("===================");
		}//la�o para imprimir na tela
		
	}
}
