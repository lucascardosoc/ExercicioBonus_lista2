import java.util.Scanner;

public class Exerc�cio009 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n;
		int elemento=0;
		int superior, inferior;
		double resultado = 0;
		System.out.println("Por favor, informe quantos elementos da sequ�ncia voc� deseja exibir");
		n = leitor.nextInt();
		
		while(elemento<n) {
			System.out.println("Calculando e exibindo o " + (elemento+1) + " elemento da sequ�ncia");
			inferior = n - elemento;
			elemento++;
			
			superior = elemento;
			int fat;
			fat = superior;
			while(superior>1) {
				superior = superior - 1;
				fat = superior * fat;
			}
			System.out.println("O fatorial do primeiro valor �: " + fat);
			superior = fat;
			
			fat = inferior;
			while(inferior>1) {
				inferior = inferior - 1;
				fat = inferior * fat;
			}
			System.out.println("O fatorial do divisor �: " + fat);
			inferior = fat;
			resultado = superior / (double)inferior;
			System.out.println("O resultado � " + resultado + "\n\n\n\n");
		}
		
		leitor.close();

	}

}
