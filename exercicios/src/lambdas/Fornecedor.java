package lambdas;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
public class Fornecedor {
	public static void main(String[] args) {
		Supplier <List<String>> umaLista = () -> //n�o tem par�metro por isso tem par�nteses
		Arrays.asList("Ana", "Bia", "Lia", "Gui");
		System.out.println(umaLista.get());
	}
}
