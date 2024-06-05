package vetor01;

import java.util.ArrayList;
import java.util.Random;

public class SomaDeNegativos {

	public static void main(String[] args) {
		int negativo = 0;
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		Random random = new Random();

		for (int i = 0; i < 5; i++) {
			int numerosAleatotio = random.nextInt();
			numeros.add(numerosAleatotio);
		}
		for(Integer numero: numeros) {
			System.out.println("Os números são "+numero);
			if (numero < 0) {
				negativo ++;
			}
		}
		System.out.println("A lista tem "+negativo+" números negativos.");

	}
}