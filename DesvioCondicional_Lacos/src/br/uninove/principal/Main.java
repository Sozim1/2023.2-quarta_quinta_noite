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
        
        // float nota1, nota2, nota3, media;
        Scanner sc = new Scanner(System.in);
        
        // System.out.println("Informe as notas do(a) aluno(a): ");
        
        // System.out.print(" - Nota 1: ");
        // nota1 = sc.nextFloat();
        
        // System.out.print("\n - Nota 2: ");
        // nota2 = sc.nextFloat();
        
        // System.out.print("\n - Nota 3: ");
        // nota3 = sc.nextFloat();
        
        // media = (nota1 + nota2 + nota3) / 3;
       
        // System.out.println("\nMédia: " + media);      
        
        // if (media >= 6) {
        //     System.out.println("Aprovado!");
        // } else {
        //     if (media < 4) {
        //         System.out.println("Reprovado!");
        //     } else {
        //         System.out.print("\nInforme a nota do exame: ");
        //         float exame = sc.nextFloat();
        //         if (exame >= 6) {
        //             System.out.println("Aprovado!");
        //         } else {
        //             System.out.println("Reprovado!");
        //         }
        //     }
            
        // }

      //------------------------Comparando Strings----------------
      
      String nome1, nome2;
      
      System.out.print("Informe o primeiro nome: ");
      nome1 = sc.next();
      
      System.out.print("Informe o segundo nome: ");
      nome2 = sc.next();
      
      System.out.println("Você digitou: " + nome1 + " e " + nome2);

      if (nome1.equals(nome2)) {
        System.out.println("Os nomes digitados são iguais!");
      } else {
        System.out.println("Os nomes digitados são diferentes!");
      }


      if (nome1.equalsIgnoreCase(nome2)) {
        System.out.println("Os nomes digitados são iguais, independente da caixa!");
      } else {
        System.out.println("Os nomes digitados são diferentes, independente da caixa!");
      }

      //Comparação com ternário:
      System.out.println(nome1.equals(nome2) ? "Nomes iguais" : "Nomes diferentes!");


      //------------- Operador Switch.. case ----------------
      int finalPlaca = 1;
      switch (finalPlaca) {
        case 1:
        case 2:
          System.out.println("Rodízio de segunda-feira");
          break;
        case 3:
        case 4:
          System.out.println("Rodízio de terça-feira");
          break;
        case 5:
        case 6:
          System.out.println("Rodízio de quarta-feira");
          break;
        case 7:
        case 8:
          System.out.println("Rodízio de quinta-feira");
          break;
        case 9:
        case 0:
          System.out.println("Rodízio de sexta-feira");
          break;
        default:
          System.out.println("Placa inválida!");
          break;
      }

      //---------------------- Laços ----------------------
      //Laços FOR: para i de 0 até n, faça


      //condição de início; condição de parada; condição de incremento
      for (int i = 10; i >= 0; i--) { //i++ é o mesmo que i = i + 1
         System.out.println("For: I = " + i);
      }

      System.out.println("----------------");
      
      int j = 0;
      while (j <= 10) {
        System.out.println("While: J = " + j);
        j++;
      }

      System.out.println("----------------");

      int k = 0;
      do {
        System.out.println("Do..While: K = " + k);
        k += 2; //é o mesmo que k = k + 2
      } while (k <= 20);

      /*
      Desafio: Use os três tipos de laços para criar um algoritmo que some
      n valores, sendo n, dado pelo usuário:
      Entrada: 5
      Saída: 1 + 2 + 3 + 4 + 5 = 15

      Entrada: 6
      Saída: 1 + 2 + 3 + 4 + 5 + 6 = 21
      ...
      */
    }
}