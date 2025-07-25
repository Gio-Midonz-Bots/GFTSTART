package br.com.dio.estruturascondicionais;

import java.util.Scanner;

public class Segundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        var option =0;
        while (option!=2){
        System.out.println("Informe a sua opição: ");
        System.out.println("1 - Informar dados do usuário");
        System.out.println("2 - Sair do Programa");
        option = scanner.nextInt();
        switch (option){
            case 1:
                System.out.println("Olá Usuário! Digite a sua altura");
                var height = scanner.nextDouble();
                System.out.println("Olá Usuário! Digite a seu peso");
                var weight = scanner.nextDouble();
                double calcIMC = weight/(height*height);
                System.out.println("SEU VALOR DO CALCULO IMC é= " + calcIMC);
                if (calcIMC <= 18.5){
                    System.out.println("Abaixo do peso");
                } else if (calcIMC <=24.9) {
                    System.out.println("Peso ideal");
                } else if (calcIMC <= 29.9) {
                    System.out.println("Levemente acima do peso");
                } else if (calcIMC <= 34.9) {
                    System.out.println("Obesidade Grau I");
                } else if (calcIMC <= 39.9) {
                    System.out.println("Obesidade Grau II (Severa)");
                }else {
                    System.out.println("Obesidade III (Mórbida)");
                }

                break;
            case 2:
            System.out.println("O programa encerrou. Obrigada!");
                break;
        }







        }
    }
 }

