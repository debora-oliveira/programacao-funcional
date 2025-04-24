package org.example.lambdas;

public class CalculoTeste {
    public static void main(String[] args) {
        Calculo soma = new Soma();
        Calculo multiplicacao = new Multiplicar();
        System.out.println(soma.executar(3,8));
        System.out.println(multiplicacao.executar(6,4));
    }
}
