package stream;

import java.util.List;

public class Outros {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Bia", 6.1);
        Aluno a3 = new Aluno("Gio", 8.1);
        Aluno a4 = new Aluno("Lua", 10);
        Aluno a5 = new Aluno("Ana", 7.1);
        Aluno a6 = new Aluno("Maria", 6.1);
        Aluno a7 = new Aluno("Gio", 8.1);
        Aluno a8 = new Aluno("Thais", 10);
        List<Aluno> alunos = List.of(a1, a2, a3, a4, a5, a6, a7, a8);

        System.out.println("distinct...");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit");
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\ntakeWhile");
        alunos.stream()
                .distinct()
                .takeWhile(aluno -> aluno.nota >= 7)
                .forEach(System.out::println);

    }
}
