package Streams;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CriandoStreams {
	public static void main(String[] args) {
		
		 Consumer <String> print = System.out::print;
		// Consumer <Integer> println = System.out::println;
		 
		 Stream<String> langs = Stream.of("Java ", "Lua ","JS\n");
		 langs.forEach(print);
		 
		 String[] maisLangs = {"Python ", "Lisp ", "Perl ","Go\n"};
		 
		 Stream.of(maisLangs).forEach(print);
		 
		 Arrays.stream(maisLangs).forEach(print);
		 Arrays.stream(maisLangs, 1, 3).forEach(print);
		 
		 List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		 
		 outrasLangs.stream().forEach(print);
		 outrasLangs.parallelStream().forEach(print); //executados de forma paralela
		 
		 //Stream.generate(()->"a").forEach(print);
		 //Stream.iterate(0,n -> n+1).forEach(println);
		 //laços infinitos gerados por stream	
	}
}
