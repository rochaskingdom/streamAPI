package stream;

import java.util.List;
import java.util.function.Consumer;

public class Map {

    public static void main(String[] args) {

        Consumer<String> print = System.out::println;

        List<String> marcas = List.of("BMW", "Audi", "Honda");
        marcas.stream().map(String::toUpperCase).forEach(print);

        System.out.println("\nUsando composição...");
        marcas.stream()
                .map(Utilitarios.maiuscula)
                .map(Utilitarios.primeiraLetra)
                .map(Utilitarios::grito)
                .forEach(print);
    }
}
