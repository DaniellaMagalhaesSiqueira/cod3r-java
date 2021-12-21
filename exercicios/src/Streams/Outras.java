package Streams;

import java.util.Arrays;
import java.util.List;

public class Outras {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Pedro", 6.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Maria", 10);//teve que implementar o equals e hach code na classe Aluno para que o distinct funcione
		
		List <Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
		
		System.out.println("distinct...");
		alunos.stream()
		.distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
		.distinct()
		.skip(2)//pular dois elementos - a ordem altera
		.limit(2)//pegar apenas 2 elementos - a ordem altera
		.forEach(System.out::println);
		
		
		System.out.println("\ntakeWhile");
		alunos.stream()
		.distinct()
		.takeWhile(a -> a.nota >= 7.0) // para até encontrar alguém que foi aprovado
		.forEach(System.out::println);
	}
}
