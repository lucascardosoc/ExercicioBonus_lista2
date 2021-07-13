import java.util.Scanner;

public class Exercício008 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double media;
		int i = 0;
		double nota;
		int maiores = 0, menores = 0, iguais = 0;

		System.out.println("Digite a média da turma");
		media = leitor.nextDouble();

		while (i < 50) {
			i = i + 1;
			System.out.println("Digite a nota do " + i + " º aluno");
			nota = leitor.nextDouble();
			if (nota > media) {
				System.out.println("Esse aluno está acima da média");
				maiores++;
			} else if (nota < media) {
				System.out.println("Esse aluno está abaixo da média");
				menores++;
			} else {
				System.out.println("Esse aluno está na média");
				iguais++;
			}

		}
		
		System.out.println("Na turma, existem " + maiores + " alunos com nota acima da média, " + menores + " alunos com nota abaixo da média e " + iguais + " alunos com nota igual à média");
		leitor.close();

	}

}
