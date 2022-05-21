package Paradigma;

import java.util.function.BiPredicate;

public class FuncoesPuras {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> vereficarseEmaior =
                (parametro, valorComparacao) -> parametro > valorComparacao;
        System.out.println(vereficarseEmaior.test(13, 12));
        System.out.println(vereficarseEmaior.test(13, 12));
    }
}
