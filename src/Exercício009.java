import java.util.Scanner;

public class Exercício009 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n;
		int elemento=0;
		int superior, inferior;
		double resultado = 0;
		System.out.println("Por favor, informe quantos elementos da sequência você deseja exibir");
		n = leitor.nextInt();
		
		while(elemento<n) {
			System.out.println("Calculando e exibindo o " + (elemento+1) + " elemento da sequência");
			inferior = n - elemento;
			elemento++;
			
			superior = elemento;
			int fat;
			fat = superior;
			while(superior>1) {
				superior = superior - 1;
				fat = superior * fat;
			}
			System.out.println("O fatorial do primeiro valor é: " + fat);
			superior = fat;
			
			fat = inferior;
			while(inferior>1) {
				inferior = inferior - 1;
				fat = inferior * fat;
			}
			System.out.println("O fatorial do divisor é: " + fat);
			inferior = fat;
			resultado = superior / (double)inferior;
			System.out.println("O resultado é " + resultado + "\n\n\n\n");
		}
		
		leitor.close();

	}

}
