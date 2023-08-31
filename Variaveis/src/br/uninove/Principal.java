
import java.util.Scanner;

class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Informe seu sexo (apenas uma letra): ");
        char sexo = sc.nextLine().charAt(0);

        System.out.print("Você fuma? ");
        boolean fumante = sc.nextBoolean();

        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Informe seu saldo: R$ ");
        double saldoEmConta = sc.nextFloat();

        //exibição dos dados
        System.out.println("--------------------------------");
        System.out.println("Nome:  " + nome); //concatenação
        System.out.println("Sexo: " + sexo);
        System.out.println("Idade: " + idade);
        System.out.println("Saldo atual: " + saldoEmConta);
        System.out.println("Fuma? " + fumante);
    }
}
