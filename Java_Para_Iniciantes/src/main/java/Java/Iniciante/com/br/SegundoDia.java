package Java.Iniciante.com.br;

import java.util.Arrays;
import java.util.Scanner;

public class SegundoDia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] valores = {10, 15, 25, 2, 3, 54};
        String[] nomes = {"José", "Fernando", "Davi"};

        //se eu print o nome da lista ele vai retorna a refericia na memoria -> [I@7eda2dbb
        System.out.println(valores);

        //se eu percorrer a lista com forEach() ele retorna os valores dentro da lista
        for(int item: valores){
            System.out.println(item);
        }

        for(String item: nomes){
            System.out.println(item);
        }

        Arrays.sort(valores); // função de sort() organiza de menor para maior

        //A forma que o professor ensina -> [10, 15, 25, 2, 3, 54]
        System.out.println(Arrays.toString(valores));
        System.out.println(nomes.length);
        //ATENÇÃO: Arrays possui tamanho fixo e tipos primitivos e objetos
        // enquando ArrayList são dinamicas redimensiona-se automaticamente e armazenam apenas objetos
    }
}
