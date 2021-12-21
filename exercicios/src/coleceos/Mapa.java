package coleceos;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1, "Roberto");
		usuarios.put(1, "Ricardo");//substitui se já existe.
		usuarios.put(1, "Ricardo");
		//1
		System.out.println(usuarios.size());
		
		usuarios.put(4, "Roberto");
		usuarios.put(2, "Rafaela");
		usuarios.put(3, "Rebeca");
		//1
		System.out.println(usuarios.isEmpty());
		
		//3
		System.out.println(usuarios.keySet()+"->3");
		System.out.println(usuarios.values()+"->4");
		System.out.println(usuarios.entrySet()+"->5");
		System.out.println(usuarios.containsKey(20)+"->6");
		System.out.println(usuarios.containsValue("Rebeca")+"->7");
		System.out.println(usuarios.get(2)+"->8");
		
		for(int chave: usuarios.keySet()){
			System.out.println(chave+"->9");
		}
		for(String nome: usuarios.values()){
			System.out.println(nome+"->10");
		}
		for(Entry<Integer, String> registro: usuarios.entrySet()){
			System.out.println(registro.getKey()+ " "+registro.getValue()+"->11");
		}
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(1, "Rebeca"));//retorna falso pq não existe esse registro
		
	}
}
