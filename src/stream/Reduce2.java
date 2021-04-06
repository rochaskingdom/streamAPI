package stream;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Bia", 6.1);
        Aluno a3 = new Aluno("Gio", 8.1);
        Aluno a4 = new Aluno("Lua", 10);
        List<Aluno> alunos = List.of(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
        Function<Aluno, Double> nota = aluno -> aluno.nota;
        BinaryOperator<Double> somatorio = Double::sum;

        alunos.parallelStream()
                .filter(aprovado)
                .map(nota)
                .reduce(somatorio)
                .ifPresent(System.out::println);
    }
}
