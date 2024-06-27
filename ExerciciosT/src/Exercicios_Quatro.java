//4. Remoção de Elementos Duplicados:
//   Escreva um método que remova todos os elementos duplicados de uma lista, mantendo apenas a primeira ocorrência de cada elemento.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Exercicios_Quatro {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));

        System.out.println("Lista original: " + lista);

        HashSet<Integer> elementosVistos = new HashSet<>();

        for (int i = 0; i < lista.size(); i++) {
            if (elementosVistos.contains(lista.get(i))) {
                lista.remove(i);
                i--;
            } else {
                elementosVistos.add(lista.get(i));
            }
        }

        System.out.println("Lista sem duplicatas: " + lista);
    }
}

