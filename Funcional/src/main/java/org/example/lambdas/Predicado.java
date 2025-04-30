package org.example.lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> ehCaro =
                prod -> (prod.preco - (prod.preco* prod.desconto) > 1000);
        Produto produto = new Produto("Notebook", 5700,0.10);
        System.out.println(ehCaro.test(produto));
    }
}
