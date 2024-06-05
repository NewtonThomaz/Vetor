package vetor01;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCarros {

	public static void main(String[] args) {
		Integer a;
		
		ArrayList<String> carros = new ArrayList<String>();
		
		Scanner ler = new Scanner(System.in);
		
		carros.add("1-Koenigsegg Jesko");
		carros.add("2-Bugatti Chiron");
		carros.add("3-Lamborghini Huracán");
		carros.add("4-Porsche 918 Spyder");
		carros.add("5-Pagani Huayra");
		carros.add("6-Mclaren Senna");		
		carros.add("7-Ferrari f40");
		carros.add("8-Toyota Supra mk4");
		carros.add("9-Chevrolet Camaro SS");		
		carros.add("10-Ford Mustang GT");
		
		System.out.println("Qual dos seguintes modelos você gostaria de ver?");
		for (String carro: carros) {
			System.out.println(carro);
		}
		a=ler.nextInt();
		
		System.out.println("A opção escolhida foi: "+carros.get(a-1));
		
		ler.close();
	}
}