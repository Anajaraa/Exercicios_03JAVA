//5. Média de Valores Únicos:
//   Implemente um programa que calcule a média aritmética dos valores únicos em uma lista de números inteiros, ou seja, excluindo os valores duplicados da média

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicios_Cinco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite os números separados por espaço: ");
        String input = sc.nextLine();


        String[] numbers = input.split("\\s+");
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (String numberStr : numbers) {
            if (numberStr.matches("-?\\d+")) {
                int number = Integer.parseInt(numberStr);
                uniqueNumbers.add(number);
            }
        }


        double sum = 0;
        int count = 0;
        for (int number : uniqueNumbers) {
            sum += number;
            count++;
        }

        double average = count > 0 ? sum / count : 0;

        System.out.println("Valores únicos encontrados: " + uniqueNumbers);
        System.out.println("Média dos valores únicos: " + average);

        sc.close();
    }
}
