import java.util.Scanner;

public class Exerc�cio008 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double media;
		int i = 0;
		double nota;
		int maiores = 0, menores = 0, iguais = 0;

		System.out.println("Digite a m�dia da turma");
		media = leitor.nextDouble();

		while (i < 50) {
			i = i + 1;
			System.out.println("Digite a nota do " + i + " � aluno");
			nota = leitor.nextDouble();
			if (nota > media) {
				System.out.println("Esse aluno est� acima da m�dia");
				maiores++;
			} else if (nota < media) {
				System.out.println("Esse aluno est� abaixo da m�dia");
				menores++;
			} else {
				System.out.println("Esse aluno est� na m�dia");
				iguais++;
			}

		}
		
		System.out.println("Na turma, existem " + maiores + " alunos com nota acima da m�dia, " + menores + " alunos com nota abaixo da m�dia e " + iguais + " alunos com nota igual � m�dia");
		leitor.close();

	}

}
