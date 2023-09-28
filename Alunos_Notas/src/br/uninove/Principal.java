package br.uninove;

//Crie uma estrutura representando um aluno de uma disciplina. Essa estrutura 
import java.util.ArrayList;
import java.util.Scanner;

//deve conter o número de matrícula do aluno, seu nome e notas de três provas.
//Agora, escreva um programa que leia e armazene os dados de cinco alunos e os armazena 
//Em seguida, exiba o nome e as notas do aluno que possui a 
//maior média geral dentre os cinco, além dos dados dos demais (nomes e média)
public class Principal {

    public static void main(String[] args) {

        ArrayList<Aluno> alunos = new ArrayList();
        Scanner sc = new Scanner(System.in);

        System.out.println("Comece a digitar os dados dos alunos:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Do " + i + "º aluno: ");
            //opção 1:
            String nome;
            int mat;
            float nota1, nota2, nota3;

            System.out.print(" - Nome: ");
            nome = sc.next();

            System.out.print(" - Matricula: ");
            mat = sc.nextInt();

            System.out.print(" - Nota 1: ");
            nota1 = sc.nextFloat();

            System.out.print(" - Nota 2: ");
            nota2 = sc.nextFloat();

            System.out.print(" - Nota 3: ");
            nota3 = sc.nextFloat();

            Aluno a = new Aluno(mat, nome, nota1, nota2, nota3);
            
            //ou...
//            a.setMatricula(mat);
//            a.setN1(nota1);
//            a.setN2(nota2);

            alunos.add(a);
        }

        float maiorMedia = alunos.get(0).getMedia();
        Aluno alunoMaiorMedia = alunos.get(0);

        for (Aluno al : alunos) { //foreach -> para cada
            if (al.getMedia() > maiorMedia) {
                alunoMaiorMedia = al;
            }
        }

        System.out.println("----------------------");
        System.out.println(" Aluno com a MAIOR média:");
        System.out.println(" - Nome: " + alunoMaiorMedia.getNome());
        System.out.println(" - Média: " + alunoMaiorMedia.getMedia());

        System.out.println("----------------------");
        System.out.println("Todos os alunos da lista:");

        for (Aluno alun : alunos) {
            System.out.println("------");
            System.out.println(" - Nome: " + alun.getNome());
            System.out.println(" - Média: " + alun.getMedia());

        }

    }
}
