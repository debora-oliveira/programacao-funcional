package org.example.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Bia","Rory","Dean","Ana");
        System.out.println("For each tradicional:");
        for (String nome: aprovados){
            System.out.println(nome);
        }
        System.out.println("\nLambda:");
        aprovados.forEach(nome -> System.out.println(nome));

        System.out.println("\nMethod reference:");
        aprovados.forEach(System.out::println);

        System.out.println("\n #2 Lambda:");
        aprovados.forEach(nome -> imprimir(nome));

        System.out.println("\n #2 Method reference:");
        aprovados.forEach(ForEach::imprimir);
    }
    static void imprimir(String nome){
        System.out.println("Meu nome é: "+nome);
    }
}
