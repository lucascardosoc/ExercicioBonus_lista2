import java.util.Scanner;

public class Exercício007 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int qtdeFeijoes=0;
		
		while(qtdeFeijoes!=1238) {
		System.out.println("CASTELO DA PRINCESA JAVARELLA");
		System.out.println("Para ter o direito de passar uma noite no castelo da princesa Javarella, é nessário acertar a quantidade de feijões que estão dentro de um jarro");
		qtdeFeijoes = leitor.nextInt();
		}
	
	System.out.println("Parabéns! O jarro tinha exatamente 1238 feijões! Você pode passar uma noite no castelo da Javarella");

	leitor.close();
	}
}
	


