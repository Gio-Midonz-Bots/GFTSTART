package br.com.dio.estruturascondicionais;

import java.util.Scanner;

public class Primeiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá Usuário! Digite um número");
        var number = scanner.nextInt();
        for(int i = 0;i<=10;i++){
            var calc = number * i;
            System.out.println("\n"+number + " X "+ i + " = "+ calc);
        }
    }
}
