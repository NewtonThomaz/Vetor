package vetor01;

import java.util.ArrayList;
import java.util.Random;

public class ExemploRandom {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		Random random = new Random();
		
		for (int i = 0; i < 5; i++) {
			int numerosAleatotio = random.nextInt(100);
			numeros.add(numerosAleatotio);
		}
		for (int numero : numeros) {
			System.out.println(numero);
		}
	}
}