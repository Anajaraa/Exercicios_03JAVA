//1. Soma dos Elementos Pares:
//   Escreva um programa que calcule a soma dos elementos pares de uma lista de inteiros.

import java.util.ArrayList;
import java.util.List;

public class Exercicios_Um {
    public static void main(String[] args) {


        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);


        int soma = somaDosPares(numeros);


        System.out.println("A soma dos elementos pares é: " + soma);
    }

    public static int somaDosPares(List<Integer> numeros) {
        int soma = 0;


        for (int numero : numeros) {

            if (numero % 2 == 0) {
                soma += numero;
            }
        }

        return soma;
    }
}
