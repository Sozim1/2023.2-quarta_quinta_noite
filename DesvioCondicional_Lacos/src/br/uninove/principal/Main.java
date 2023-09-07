package br.uninove.principal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Desvio condicinal
        /*
            if (<condição lógica>) {
                  // trecho de código que será executado se o resultado for verdadeiro
            } else {
                  //trecho de código que será executado se o resultado for falso
            }
        */
        
        float nota1, nota2, nota3, media;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe as notas do(a) aluno(a): ");
        
        System.out.print(" - Nota 1: ");
        nota1 = sc.nextFloat();
        
        System.out.print("\n - Nota 2: ");
        nota2 = sc.nextFloat();
        
        System.out.print("\n - Nota 3: ");
        nota3 = sc.nextFloat();
        
        media = (nota1 + nota2 + nota3) / 3;
       
        System.out.println("\nMédia: " + media);
        
        if (media >= 6) {
            System.out.println("Aprovado!");
        } else {
            if (media < 4) {
                System.out.println("Reprovado!");
            } else {
                System.out.print("\nInforme a nota do exame: ");
                float exame = sc.nextFloat();
                if (exame >= 6) {
                    System.out.println("Aprovado!");
                } else {
                    System.out.println("Reprovado!");
                }
            }
            
        }
        
        /*
        Altere esse código para que se o aluno tirou 6 ou mais, ele está aprovado.
        Entretanto, se ele tirou entre 4 e 5.9 ele poderá realizar um exame (nova 
        nota a ser lida). 
        Se ele tirar mais que 6 no exame, está aprovado, caso contrário, reprovado.
        Se a média dele for menor que 4, ele não terá direito ao exame e está 
        automáticamente reprovado.
        >> 20.55 resolveremos
        */
    }
}
