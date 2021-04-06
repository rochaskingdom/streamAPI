package stream;

import java.util.Comparator;
import java.util.List;

public class MinMax {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Bia", 6.1);
        Aluno a3 = new Aluno("Gio", 8.1);
        Aluno a4 = new Aluno("Lua", 10);
        List<Aluno> alunos = List.of(a1, a2, a3, a4);

        Comparator<Aluno> melhorNota = Comparator.comparingDouble(aluno -> aluno.nota);
        Comparator<Aluno> piorNota = Comparator.comparingDouble(aluno -> aluno.nota);

        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(piorNota).get());

        System.out.println(alunos.stream().min(melhorNota).get());
        System.out.println(alunos.stream().max(piorNota).get());
    }
}
