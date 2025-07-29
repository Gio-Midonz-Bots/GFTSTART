package br.com.dio.POO;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("qual é o nome?");
        String nome = sc.nextLine();
        pessoa.setNome(nome);

        System.out.println("qual é a sua idade?");
        int idade = sc.nextInt();
        pessoa.setIdade(idade);

        System.out.println("qual é o seu RG?");
        int RG = sc.nextInt();
        sc.nextLine();
        pessoa.setRG(RG);

        System.out.println("qual é o seu sexo?");
        String sexo = sc.nextLine();
        pessoa.setSexo(sexo);

        System.out.println(pessoa.toString());


    }

}
