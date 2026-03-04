package Java.Iniciante.com.br;

import java.util.Scanner;

public class TerceiroDia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i <= 5; i++){
            System.out.println("Digite um número:");
            int numero = sc.nextInt();

                if (numero >=0 && numero <= 9){
                    System.out.println("Este número tem 1 digito");
                } else if (numero >= 10 && numero <=99) {
                    System.out.println("Este número tem 2 digito");
                } else if (numero >= 100 && numero <= 999) {
                    System.out.println("Este número tem 3 digito");
                } else if (numero >= 1000 && numero <= 9999) {
                    System.out.println("Este número tem 4 digito");
                }else {
                    System.out.println("Este número tem 5 digito ou mais");
                }
            }




    }
}
