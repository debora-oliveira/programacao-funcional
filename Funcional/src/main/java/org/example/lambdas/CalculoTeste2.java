package org.example.lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {
        Calculo soma = (x, y) -> {
            return x + y;
        };
        System.out.println(soma.executar(8,6));
        Calculo calc=(x,y) -> x * y;
        System.out.println(calc.executar(3,9));
    }
}
