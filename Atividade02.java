package vetor01;
import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[] = new int[5];
		int soma = 0;
		for (int i=0; i<5; i++) {
			System.out.println("Informe um valor para o indice "+i+" do vetor");
			a[i]=ler.nextInt();
			soma += a[i];
		}if (soma>30) {
			System.out.println("A soma desse vetore é "+soma);
		}else {
			System.out.println("O valor da soma dos indices do vetor é menor igual a trinta");
		}ler.close();
	}
}