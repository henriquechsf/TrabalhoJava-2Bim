import java.util.Scanner;

//ler 10 n�meros
//colocar em ordem crescente com m�todo bolha
//listar as notas ordenadas

public class ex02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float[] nota = new float[10];
		
		for (int i = 0; i < nota.length; i++) {
			System.out.println("Digite a " + (i + 1) + "� nota: ");
			nota[i] = sc.nextFloat();
		}//leitura dos dados
		
		for (int i = 0; i < nota.length; i++) {
			for (int j = i + 1; j < nota.length; j++) {
				if (nota[i] > nota[j]) {
					float aux = nota[j];
					nota[j] = nota[i];
					nota[i] = aux;
				}
			}
		}//ordena��o tipo bolha
		
		for (int i = 0; i < nota.length; i++) {
			System.out.println(nota[i]);
		}//imprimir na tela
		
	}
}
