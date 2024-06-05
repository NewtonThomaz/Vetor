package vetor01;

import java.util.ArrayList;

public class Atividade05 {

	public static void main(String[] args) {
		int soma = 0;
		// Criando um ArrayList de números inteiros
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add (5);// Adicionando elementos ao ArrayList
		numeros.add (10);
		numeros.add (15);
		numeros.add (20);
		numeros.add (25);
		
		for(Integer numero: numeros) {
			soma += numero;
			System.out.println("os números armazenados são "+numero);
		}
		System.out.println(soma);		
	}
}