package br.uninove;  //no repli.it ou onlinegdc não precisa dessa linha!

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        String nomesCompletos[][] = new String[3][2]; //representa uma matriz 3x3

        nomesCompletos[0][0] = "Bruno";
        nomesCompletos[0][1] = "True";

        nomesCompletos[1][0] = "Leandro";
        nomesCompletos[1][1] = "Vinicius";

        nomesCompletos[2][0] = "Daniel";
        nomesCompletos[2][1] = "Mota Fernandes";

        for (int i = 0; i <= 2; i++) {
            System.out.print("Nome armazenado na linha " + i + ": ");
            //Pega a posição i (linha), a coluna do nome (0) e concatena com a coluna do sobrenome (1)
            System.out.println(nomesCompletos[i][0] + " " + nomesCompletos[i][1]);
        }

        /*
            Faça um programa que leia os elementos de uma matriz do tipo inteiro
            com tamanho 3 X 3 e imprima os elementos multiplicando-os por 2.  
         */
        Scanner sc = new Scanner(System.in);

        int m[][] = new int[3][3];
        System.out.println("Comece a digitar os valores.....");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Valor da posição " + (i) + "-" + (j) + ": ");
                m[i][j] = sc.nextInt();
                m[i][j] *= 2; //é o mesmo que m[i][j] = m[i][j] * 2;
            }
        }

        System.out.println("Nova matriz...:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t" + m[i][j]);
            }
            System.out.println("");
        }

    }
}
