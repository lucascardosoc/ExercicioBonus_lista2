import java.util.Scanner;

public class Exerc�cio007 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int qtdeFeijoes=0;
		
		while(qtdeFeijoes!=1238) {
		System.out.println("CASTELO DA PRINCESA JAVARELLA");
		System.out.println("Para ter o direito de passar uma noite no castelo da princesa Javarella, � ness�rio acertar a quantidade de feij�es que est�o dentro de um jarro");
		qtdeFeijoes = leitor.nextInt();
		}
	
	System.out.println("Parab�ns! O jarro tinha exatamente 1238 feij�es! Voc� pode passar uma noite no castelo da Javarella");

	leitor.close();
	}
}
	


