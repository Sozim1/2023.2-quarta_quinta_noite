package projeto; //não coloque essa linha do replit

import java.util.Scanner;


class Principal {

    public static void main(String[] args) {

        String nomes[] = new String[6];

        nomes[0] = "Daniele";
        nomes[1] = "Emanuel";
        nomes[2] = "Bruno";
        nomes[3] = "Josefina";
        nomes[4] = "Joaquino";
        nomes[5] = "Tobias";

        for (int i = 0; i <= 5; i++) {
            System.out.println(i + 1 + "º nome: " + nomes[i]);
        }

        /*
        1. Faça um programa em Java que armazene 15 números inteiros em um vetor 
            e depois permita que o usuário digite um número inteiro para ser 
            buscado no vetor. Se for encontrado o programa deve imprimir a 
            posição desse número no vetor, caso contrário, deve imprimir 
            a mensagem: "Nao encontrado!"
         */
        //SOLUÇÃO
        
        //declatação do vetor de 15 posições:
        int tamanhoVetor, valorBuscado, aux;
 
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite tamanho do vetor desejado: ");
        tamanhoVetor = sc.nextInt();
        
        int valores[] = new int[tamanhoVetor];
        
        System.out.println("Comece a digitar os valores....");
        
        //leitura dos valores:
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Valor da " + (i + 1) + "ª posição: ");
            valores[i] = sc.nextInt();
        }
        
        //pergunta ao usuário qual valor a ser buscado:
        System.out.print("\nQual valor você quer buscar: ");
        valorBuscado = sc.nextInt();
        
        //iniamos a busca:
        aux = 0;
        for (int i = 0; i < tamanhoVetor; i++) {
            if (valores[i] == valorBuscado) {
                System.out.println("Encontrado na posição: " + (i + 1));
                aux++;
            }
        }
        
        if (aux == 0) {
            System.out.println("Não encontrei nenhuma vez o "  + valorBuscado);
        } else {
            System.out.println("Encontrei " + aux + " vezes o valor " + valorBuscado);
        }
    }
}
