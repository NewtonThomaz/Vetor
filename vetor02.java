package vetor01;
import java.util.Scanner;

public class vetor02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int a[] = new int [5];
		for (int i=0; i<5; i++) {
			System.out.println("Informe um valor "+i+"..:");
			a[i]=ler.nextInt();
		}
		for(int i=0; i<5;i++) {
			System.out.println(a[i]);
		}
		ler.close();
	}



}


