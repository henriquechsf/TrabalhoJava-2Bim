import java.util.Scanner;

// ler modelo, marca e valor de 10 veículos
// ao final permitir buscar veículos cadastrados
// utilizar busca sequencial por modelo

public class ex08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] modelo = new String[10];
		String[] marca = new String[10];
		float[] valor = new float[10];
		
		for (int i = 0; i < modelo.length; i++) {
			System.out.println("Digite o modelo do " + (i + 1) + "º veículo: ");
			modelo[i] = sc.next();
			System.out.println("Digite a marca do " + (i + 1) + "º veículo: ");
			marca[i] = sc.next();
			System.out.println("Digite o valor do " + (i + 1) + "º veículo: ");
			valor[i] = sc.nextFloat();
		}//leitura dos dados
		
		System.out.println("Qual modelo de veículo deseja buscar?");
		String modeloBusca = sc.next();
		
		for (int i = 0; i < modelo.length; i++) {
			if (modelo[i].equals(modeloBusca)) {
				System.out.println("Modelo encontrado!: ");
				System.out.println("Modelo: " + modelo[i] + "\nMarca: " + marca[i] + "\nValor R$" + valor[i]);
				return;
			}
		}
		System.out.println("Nada encontrado!");
	}
}
