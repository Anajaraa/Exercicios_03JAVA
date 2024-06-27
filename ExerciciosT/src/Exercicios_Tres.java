//3. Ordenação de Lista de Números:
//   Implemente um algoritmo de ordenação (por exemplo, Bubble Sort) para ordenar uma lista de números inteiros em ordem crescente.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicios_Tres {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(2);
        lista.add(3);
        lista.add(9);
        lista.add(1);
        lista.add(10);
        lista.add(7);
        lista.add(8);
        lista.add(4);
        lista.add(6);

        System.out.println("Lista Original: " + lista);

        System.out.println("""
                    
                    🧑‍💻🧑‍💻🧑‍💻🧑‍💻🧑‍💻🧑‍💻🧑‍💻🧑‍💻🧑‍💻🧑‍💻🧑‍💻🧑‍💻🧑‍💻🧑‍💻🧑‍💻🧑‍💻🧑‍💻🧑‍💻🧑‍💻🧑‍💻🧑‍💻🧑‍💻
                    
                    Digite 1 para Ordenar em Ordem Crescente;
                    
                    Digite 2 para Ordenar em Ordem Decrescente;               
                    
                    
                    👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍
                    
                """);

        int opcao = userInput.nextInt();

        switch (opcao) {
            case 1:
                bubbleCrescente(lista);
                System.out.println("Lista Ordenada em Ordem Crescente: " + lista);

                break;
            case 2:
                bubbleDecrescente(lista);
                System.out.println("Lista Ordenada em Ordem Decrescente: " + lista);

                break;
            default:
                System.out.println("Opção inválida");
        }

        userInput.close();
    }

    public static ArrayList<Integer> bubbleCrescente(ArrayList<Integer> numeros) {
        //Bubble Sort
        for (int i = 0; i < numeros.size(); i++) {

            for (int j = 0; j < numeros.size(); j++) {

                if (numeros.get(i) < numeros.get(j)) {

                    int temp = numeros.get(i);
                    numeros.set(i, numeros.get(j));
                    numeros.set(j, temp);
                }

            }
        }

        return numeros;
    }

    public static ArrayList<Integer> bubbleDecrescente(ArrayList<Integer> numeros) {
        //Bubble Sort
        for (int i = 0; i < numeros.size(); i++) {

            for (int j = 0; j < numeros.size(); j++) {

                if (numeros.get(i) > numeros.get(j)) {

                    int temp = numeros.get(i);
                    numeros.set(i, numeros.get(j));
                    numeros.set(j, temp);
                }
            }
        }

        return numeros;
    }
}
