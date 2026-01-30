import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        String nome = "Rafael";
        String tipoDeConta = "Corrente";
        double saldo = 3.999;
        int opcao = 0;

        System.out.println("---------------------");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo da conta: " + saldo);
        System.out.println("\n---------------------");

        String menu = """
                DIGITE SUA OPÇAO
                1 - CONSULTAR SALDO
                2 - FAZER TRANSFERENCIA
                3 - RECEBER TRANSFERENCIA
                4 - SAIR
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}

