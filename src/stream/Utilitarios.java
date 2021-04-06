package stream;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Utilitarios {

    public final static UnaryOperator<String> maiuscula = String::toUpperCase;
    public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
    public final static UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
    public final static Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s, 2);

    public static String grito(String n) {
        return n + "!!! ";
    }

}
