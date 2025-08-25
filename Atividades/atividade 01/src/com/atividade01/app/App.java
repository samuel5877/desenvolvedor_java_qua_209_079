package com.atividade01.app;

import java.util.Scanner;

public class App {
   public static void main(String[] args) throws Exception {
         Scanner leia = new Scanner(System.in);

         //declaraçao de variaveis
         String nome, opcao, diagnostico;
         double peso, altura, imc;
         int saida = 0;

         //loop
         do{
            System.out.println("1 - calcule  IMC");
            System.out.println("2 - Sair do programa");
            System.out.println("3 - Escolha a opção");
            opcao = leia.nextLine();
            

            switch (opcao) {
                case "1":
                System.out.println("Informe seu nome:");
                nome = leia.nextLine();
                System.out.println("Informe seu peso em kg:");
                peso = leia.nextDouble();
                System.out.println("Informe sua altura em metros:");
                altura = leia.nextDouble();

                imc = peso / (altura*altura);
                

                System.out.println("O IMC de " + nome + "é" + String.format("%.2f", imc) + ".");

                //ternario
                diagnostico = (imc < 18.5) ? nome + " esta abaixo do peso."
                : (imc < 25) ? nome + " esta no peso ideal."
                : (imc <30) ? nome + " esta acima do peso." 
                :(imc < 35) ? nome + " esta obeso."
                :(imc < 40) ? nome + " esta com obesidade nivel II."
                :nome + " esta com obesidade morbida.";
                System.out.println(diagnostico);
                break;
                case "2":
                saida = Integer.parseInt(opcao);
                System.out.println("programa encerrado");
              
                    break;
            
                default:
                
                    System.out.println("Opção invalida");

            }
         }while (saida != 2);
         

         // fecha objeto scanner
         leia.close();

        }
       }


