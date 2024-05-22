package vetor01;
import java.util.Scanner;

public class DesafioJava {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[]= new int [5];
		int b[]= new int [5];
		int c[]= new int [10];
		
		for(int i=0; i<5; i++) {
			System.out.println("Informe um valor para o indice "+i+" do vetor A");
			a[i]= ler.nextInt();		
		}for(int i=0; i<5; i++) {
			System.out.println("Informe um valor para o indice "+i+" do vetor B");
			b[i]= ler.nextInt();
		}for(int i=0; i<5; i++) {
			c[i]=a[i];
		}for(int i=5; i<10; i++) {
			c[i]=b[(i-5)];
		}System.out.println("Os valores do vetor C são");
		for(int i=0; i<10; i++) {
			System.out.println("O indice "+i+" do vetor C é igual "+c[i]);
		}ler.close();
	}
}