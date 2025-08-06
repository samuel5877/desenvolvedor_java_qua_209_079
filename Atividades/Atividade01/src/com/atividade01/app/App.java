package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        String nome;
        int peso, opcao;
        double altura;

        System.out.println("1 - Registrar nova entrada. ");
          System.out.println("2 - Sair do programa. ");
          System.out.println("1 - Informe opção desejada: ");
          opcao = leia.nextInt();

          if (opcao == 1) {
            leia.nextLine();
            System.out.println("Informe o nome: ");
            nome = leia.nextLine();
            System.out.println("Informe o peso: ");
            peso = leia.nextInt();
            System.out.println("Informe a altura: ");
            altura = leia.nextDouble();
          }

           if () {
                System.out.println(nome + " está autorizado. ");
            }



        leia.close();
    
}

}
