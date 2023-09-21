package br.uninove;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
//        Pessoa pessoas[] = new Pessoa[4];

//        for (int i = 0; i < 4; i++) {
//            pessoas[i] = new Pessoa();
//            
//            System.out.println("Da pessoa " + (i + 1) + " digite:");
//            System.out.print("\tNome: ");
//            
//            pessoas[i].nome = tec.nextLine();
//            
//            System.out.print("\tE-mail: ");
//            pessoas[i].email = tec.nextLine();
//            
//            System.out.print("\tIdade: ");
//            pessoas[i].idade = tec.nextInt();
//            
//            System.out.println("");
//            
//            tec.nextLine();
//        }
        ArrayList<Pessoa> pessoas = new ArrayList();

        for (int i = 0; i <= 5; i++) {
            Pessoa p = new Pessoa();
            p.nome = "Fulano";
            p.email = "bragnatino@issoqueetime.com.br";
            p.idade = 300;
            pessoas.add(p);
        }
    }
}
