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
            System.out.println("Não encontrei nenhuma vez o " + valorBuscado);
        } else {
            System.out.println("Encontrei " + aux + " vezes o valor " + valorBuscado);
        }

        /*
            2. Faça um programa em Java que leia N números inteiros ("N" deve ser lido)
            e imprima a lista de valores informando se cada posição armazena 
            um valor PAR ou ÍMPAR
        

            3. Faça um programa que leia um vetor vet de 10 elementos e obtenha um 
            vetor w cujos componentes são os fatoriais dos respectivos 
            componentes de vet.
        
 
            4. Construa um programa que leia dados para um vetor de 10 elementos 
            inteiros. Imprimir o maior e o menor, sem ordenar, o 
            percentual de números pares e a média dos elementos do vetor.

         */
        //RESOLUÇÕES
        //EX2:
        System.out.print("Informe quantos números serão lidos: ");
        int n = sc.nextInt();
        int vet[] = new int[n];
        System.out.println("Comece a digitar os valores do vetor...:");

        //Leitura dos dados do vetor
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor vet[" + i + "]: ");
            vet[i] = sc.nextInt();
        }

        //verificação par/impar de cada posição doo vetor
        for (int i = 0; i < n; i++) {
            if (vet[i] % 2 == 0) {
                System.out.println("[" + i + "] -> Valor: " + vet[i] + " -> PAR");
            } else {
                System.out.println("[" + i + "] -> Valor: " + vet[i] + " -> ÍMPAR");
            }
        }

        //EX3:
        int v[] = new int[10];
        int w[] = new int[10];
        System.out.println("Digite os valores do vetor a calcular o fatorial...:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor v[" + i + "]: ");
            v[i] = sc.nextInt();

            int fatorial = 1;
            if (v[i] == 1) {
                w[i] = 1;
            } else {
                for (int j = 1; j < v[i]; j++) {
                    fatorial *= j + 1;
                }
                w[i] = fatorial;
            }
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("v[" + i + "] = " + v[i] + " => w[" + i + "] = " + w[i]);
        }
        
        //EX4: 
        int k[] = new int[10];
        int menor, maior;
        float media = 0, pares = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor k[" + i + "]: ");
            k[i] = sc.nextInt();
        }
        
        maior = menor = k[0];
        
        for (int i = 0; i < 10; i++) {
            //busca do maior:
            if (k[i] > maior) {
                maior = k[i];
            }
            
            //busca do menor:
            if (k[i] < menor) {
                menor = k[i];
            }
            
            //contagem dos pares
            if (k[i] % 2 == 0) {
                pares++;
            }
            
            //soma para a média
            media += k[i];
        }
        
        media /= 10;
        
        System.out.println("Menor valor encontrado: " + menor);
        System.out.println("Maior valor encontrado: " + maior);
        System.out.println("Média dos valores: " + media);
        System.out.println("Porcentagem de valores pares: " + (pares / 10) * 100 + "%");
    }
}
