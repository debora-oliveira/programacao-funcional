package org.example.lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
        BinaryOperator<Double> soma = (x, y) -> {
            return x + y;
        };
        System.out.println(soma.apply(8.0, 6.0));
        BinaryOperator<Double> calc=(x,y) -> x * y;
        System.out.println(calc.apply(3.0, 9.0));
    }
}
