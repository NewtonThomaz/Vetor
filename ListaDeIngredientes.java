package vetor01;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeIngredientes {

	public static void main(String[] args) {
		String respA,respB,respC="", r1, r11, r2, r22;
		Scanner ler = new Scanner(System.in);

		ArrayList<String> ingredientes = new ArrayList<String>();
		ingredientes.add("Morango");
		ingredientes.add("Banana");
		ingredientes.add("Leite condensado");
		ingredientes.add("Leite Ninho");
		ingredientes.add("Nutella");


		do{System.out.println("Por R$ 20,00 um açai de 500ml com: "+ingredientes);

		System.out.println("Você adicionar algun ingrediente?");
		respA = ler.nextLine();
		if (respA.equals("Sim")) {
			do{
				System.out.println("O que voce deseja adicionar no seu pedido: ");
				r1 = ler.nextLine();
				ingredientes.add(r1);
				System.out.println("Você gostaria de adicionar mais ingredientes");
				r11 = ler.nextLine();
			}while(r11.equals("Sim"));
		}

		System.out.println("Você gostaria de retirar algum ingrediente?");
		respB = ler.nextLine();
		if (respB.equals("Sim")) {
			do{
				System.out.println("O que voce deseja retirar do seu pedido: ");
				r2 = ler.nextLine();
				ingredientes.remove(r2);
				System.out.println("Você gostaria de retirar mais ingredientes");
				r22 = ler.nextLine();
			}while(r22.equals("Sim"));}

		System.out.println("Seu açai custará R$ 36,98 tendo: "+ingredientes);
		System.out.println("Você deseja finalizar o pedido?");
		respC = ler.nextLine();
		}while (respC.equals("Não"));


		ler.close();

	}
}