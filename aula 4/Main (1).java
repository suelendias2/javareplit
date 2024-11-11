import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Dados do cliente
    String nome = "clarck kent";
    String tipoConta = "corrente";
    double saldo = 1500;
    int opcao = 0;

    System.out.println("********************");
    System.out.println("\n nome do cliente:" + nome);
    System.out.println("\n tipo da conta:" + tipoConta);
    System.out.println("Saldo atual:" + saldo);
    System.out.println("\n*******************");

    // menu cliente
    System.out.println("** digite sua opcao **");
    System.out.println("1- consultar saldo");
    System.out.println("2- transferir valor");
    System.out.println("3- receber valor");
    System.out.println("4- sair");

    Scanner leitura = new Scanner(System.in);
    while (opcao != 4) {
      // valor recebido do teclado
      opcao = leitura.nextInt();
      // opçoes
      if (opcao == 1) {
        System.out.println("O saldo e:" + saldo);
      } else if (opcao == 2) {
        System.out.println("Qual valor que deseja transferir?");
        double valor = leitura.nextDouble();
        if (valor > saldo) {
          System.out.println("saldo insuficiete");
        } else {
          saldo -= valor;
          System.out.println("o novo saldo e:" + saldo);
        }
      } else if (opcao == 3) {
        System.out.println("valor a receber:");
        double valor = leitura.nextDouble();
        saldo += valor;
        System.out.println("o novo saldo e:" + saldo);
      } else if (opcao != 4) {
        System.out.println("opção invalida");
      }
    }
    leitura.close();
    System.out.println("Saindo...");
  }
}