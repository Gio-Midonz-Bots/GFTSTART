package Java.Iniciante.com.br;
import java.util.Scanner;
import java.util.Scanner;

public class PrimeiroDia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroInteiro = 20000000; //o _ vai ajudar na divisão do numero também tem short, byte para usar como valor inteiro;
        long numeroLong = 3;
        float numeroFloat = 354;
        double numeroDouble = 2.4;
        char stringChar = 'G';
        boolean logico = true;
        System.out.println("Valores Primitivos:\n inteiro:"+numeroInteiro+
                            "\n double:"+numeroDouble+
                            "\n char:"+stringChar);

        String nomeCompleto = "Georgia Midonz";
        System.out.println("Olá "+ nomeCompleto.toUpperCase());
        System.out.println("Informe sua idade " +nomeCompleto);
        int idade = sc.nextInt();
        if (idade >= 18){
            System.out.println(nomeCompleto.toUpperCase()+ " Vocé é maior de idade: "+idade);
        }else {
            System.out.println(nomeCompleto.toUpperCase()+ " Menor de idade: "+idade);
        }
        System.out.println("Projeto: Calculadora");
        System.out.println("Informe um numero: ");
        int numeroCalculador = sc.nextInt();
        for (int i = 0 ; i < 10; i++){
            int resultado = i * numeroCalculador;
            System.out.println(i + " * " +numeroCalculador + " = " + resultado);
        }
    }
}
