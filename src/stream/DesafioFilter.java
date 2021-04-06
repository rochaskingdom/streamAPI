package stream;

import java.util.List;
import java.util.function.Function;

public class DesafioFilter {

    public static void main(String[] args) {

        Produto p1 = new Produto("iPhone", 8200.99, 0.30, true);
        Produto p2 = new Produto("MacBook Pro", 1300.99, 0.3, true);
        Produto p3 = new Produto("Teclado", 120.99, 0.05, false);
        Produto p4 = new Produto("Mouse", 65.99, 0.10, false);
        Produto p5 = new Produto("Bicicleta", 3200.99, 0.3, false);
        Produto p6 = new Produto("Geladeira", 5400.99, 0.3, true);
        List<Produto> produtos = List.of(p1, p2, p3, p4, p5, p6);

        Function<Produto, String> promocao =
                produto -> "Aproveite! " + produto.nome + " por R$" + produto.preco;

        produtos.stream()
                .filter(produto -> produto.desconto >= 0.30)
                .filter(produto -> produto.frete)
                .filter(produto -> produto.preco >= 2000.0)
                .map(promocao)
                .forEach(System.out::println);
    }
}
