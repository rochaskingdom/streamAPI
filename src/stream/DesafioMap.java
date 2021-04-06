package stream;

import java.util.List;

public class DesafioMap {

    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        nums.stream()
                .map(Integer::toBinaryString)
                .map(Utilitarios.inverter)
                .map(Utilitarios.binarioParaInt)
                .forEach(System.out::println);
    }
}
