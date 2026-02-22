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
        System.out.println(Arrays.toString(valores)); // Isso aqui converte o conteúdo de um array (valores) em uma string legível e a imprime no console. Então toda vez que declarar uma Array depois converta em string legível
        System.out.println(nomes.length);
        //ATENÇÃO: Arrays possui tamanho fixo e tipos primitivos e objetos
        // enquando ArrayList são dinamicas redimensiona-se automaticamente e armazenam apenas objetos
        System.out.println("valor da lista indice 4: "+valores[4]);

        //Array Multidimensional
        //O difericial é os dois colçeites e as duas chaves e dividir
        String[][] cars = {{"BMW", "Tesla","Jeep","Fiat"}, {"1998","2000","2022","1983"}};
        //para imprimir utilize a deepToString()
        System.out.println(Arrays.deepToString(cars));

        //Constantes -> usamos final para declarar uma constante
        final double taxaJuros = 11.92;
        System.out.println(taxaJuros); //taxaJuros = 12;

        //Operadores ->
        //casting funçao
        double a = (double) 4 / (double)3;

        //Converte string em int -> utiliza Integer.parseInt()
        String valorProduto = "10";
        int valorTotal = Integer.parseInt(valorProduto) +2;
        System.out.println(valorTotal);

        //CLASS MAHT

        double value = Math.round(10.4);//round arrendoda o numero
        value = Math.ceil(12.6); // arrendoda para cima
        value = Math.floor(11.2); // arrendoda para baixo
        System.out.println(value);
        //Numero aleatorio
        int aleatorio = (int)Math.round(Math.random() * 100);
        System.out.println(aleatorio);

        //Projeto
        int[] my_Array1 = {
                1789, 2035,1899,1456,2013,
                1458, 2458, 1254,1472,2365,
                1456,2165,1457,2456
        };

        String[] my_Array2 = {
                "Java",
                "Python",
                "PHP",
                "Node",
                "C#",
                "C++",
                "Javascript",
                "Angular"
        };
        System.out.println("Array Original: "+Arrays.toString(my_Array1));
        Arrays.sort(my_Array1);
        System.out.println("Array Ordenada: "+Arrays.toString(my_Array1));

        System.out.println("Array Original: "+ Arrays.toString(my_Array2));
        Arrays.sort(my_Array2);
        System.out.println("Array Ordenada: "+ Arrays.toString(my_Array2));
    }
}

