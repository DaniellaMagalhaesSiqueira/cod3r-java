package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MinMax {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
		List <Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Comparator <Aluno> melhorNota = (al1, al2) -> {
			if (al1.nota>al2.nota) return 1; //retornando um o 1º parâmetro é maior do que o 2º
			if (al1.nota<al2.nota) return -1;//retornando um o 2º parâmetro é maior do que o 1º
			return 0;// os parâmetros são iguais
			
		};
		Comparator <Aluno> piorNota = (al1, al2) -> {
			if (al1.nota>al2.nota) return -1;
			if (al1.nota<al2.nota) return 1;
			return 0;
			
		};
		
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());
		
		System.out.println(alunos.stream().max(piorNota).get());
		System.out.println(alunos.stream().min(piorNota).get());
	}
}
