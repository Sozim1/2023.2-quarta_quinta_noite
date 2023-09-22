package br.uninove;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Ponto pA = new Ponto();
        Ponto pB = new Ponto();
        Scanner tec = new Scanner(System.in);
        double distancia;
        
        System.out.print("X do ponto A: ");
        pA.x = tec.nextInt();
        System.out.print("Y do ponto A: ");
        pA.y = tec.nextInt();
        
        System.out.println("-----------------");
        
        System.out.print("X do ponto B: ");
        pB.x = tec.nextInt();
        System.out.print("Y do ponto B: ");
        pB.y = tec.nextInt();
        
        System.out.println("A: (" + pA.x + ", " + pA.y + ")");
        System.out.println("B: (" + pB.x + ", " + pB.y + ")");
        
        distancia = Math.sqrt(Math.pow((pB.x - pA.x), 2) + Math.pow((pB.y - pA.y), 2));

        System.out.printf("Distância entre eles: %.2f\n", distancia);
        
        
        System.out.println("-----------------");
        
        
        //Crie uma classe chamada retângulo. Essa estrutura deverá conter o ponto 
        //superior esquerdo e o ponto inferior direito do retângulo. Cada ponto é definido
        //por uma estrutura Ponto, a qual contém as posições X e Y. Faça um programa que 
        //declare e leia uma estrutura retângulo e exiba a área, o comprimento da 
        //diagonal.
        
        Retangulo ret = new Retangulo();
        Ponto a = new Ponto();
        Ponto b = new Ponto();
        ret.pA = a;
        ret.pB = b;
        //leitura dos dados do Retângulo:
        
        System.out.print("Informe o ponto X do canto SUPERIOR ESQUERDO: ");
        
        ret.pA.x = tec.nextInt();
        
        System.out.print("Informe o ponto Y do canto SUPERIOR ESQUERDO: ");
        ret.pA.y = tec.nextInt();
        
        System.out.println("");
        
        System.out.print("Informe o ponto X do canto INFERIOR DIREITO: ");
        ret.pB.x = tec.nextInt();
        
        System.out.print("Informe o ponto Y do canto INFERIOR DIREITO: ");
        ret.pB.y = tec.nextInt();
        
        //calculos:
        double base = Math.sqrt(Math.pow(ret.pB.x - ret.pA.x, 2) 
                + (Math.pow(ret.pB.y - ret.pB.y, 2)));
        
        double altura = Math.sqrt(Math.pow(ret.pA.x - ret.pA.x, 2) 
                + (Math.pow(ret.pA.y - ret.pB.y, 2)));
        
        double area = base * altura;
        
        double comprimento = (2 * base) + (2 * altura);
        
        double diagonal = Math.sqrt(Math.pow((ret.pB.x - ret.pA.x), 2) 
                + Math.pow((ret.pB.y - ret.pA.y), 2));
        
        System.out.println("------------------");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + comprimento);
        System.out.println("DIagonal: " + diagonal);
        
    }
}

//PARA SEMANA QUE VEM:
    //Crie uma estrutura representando um aluno de uma disciplina. Essa estrutura 
    //deve conter o número de matrícula do aluno, seu nome e notas de três provas.
    //Agora, escreva um programa que leia e armazene os dados de cinco alunos e os armazena 
    //Em seguida, exiba o nome e as notas do aluno que possui a 
    //maior média geral dentre os cinco, além dos dados dos demais (nomes e média)