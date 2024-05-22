package vetor01;
import java.util.ArrayList;
import java.util.Arrays;

public class Exemplo03 {

	public static void main(String[] args) {
		String[] disciplinas = {"matemática","filosofia","história","física"};
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
		novaLista.add("geografia");
		novaLista.add("Língua Inglesa");
		
		for(String i: novaLista) {
			System.out.println("Disciplinas: " +i);
		}
	}
}