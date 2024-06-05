package vetor01;

import java.util.ArrayList;
import java.util.Random;

public class SomaDePares {

	public static void main(String[] args) {
		int somaPares = 0;

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		Random random = new Random();

		for (int i = 0; i < 5; i++) {
			int numerosAleatotio = random.nextInt(100);
			numeros.add(numerosAleatotio);
		}
		
		for(Integer numero: numeros) {
			System.out.println("Os números são "+numero);
			if (numero % 2 == 0) {
				somaPares += numero;
			}
		}
		System.out.println("A soma dos números é "+somaPares+".");		
	}
}