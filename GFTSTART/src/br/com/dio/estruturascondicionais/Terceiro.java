package br.com.dio.estruturascondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Terceiro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // TODO: Leia o valor original do produto:
        double productValue = scanner.nextDouble();

        // TODO: Leia a porcentagem de desconto:
        double percentageDiscount = scanner.nextDouble();

        // TODO: Verifique se o desconto está dentro de um intervalo válido:
        if (percentageDiscount >= 1 && percentageDiscount <= 100) {
            // TODO: Calcule o valor final do produto:
            double calcDiscount = productValue * (percentageDiscount / 100);
            double valueTotal = productValue - calcDiscount;
            // Formata e exibe o valor com duas casas decimais
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println(df.format(valueTotal));
        } else {
            System.out.println("desconto invalido!");
        }
        scanner.close();
    }
}

