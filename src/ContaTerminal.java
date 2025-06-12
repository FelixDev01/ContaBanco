import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, este é seu banco digital! \nDigite seu nome:");
        String nome = scanner.next();
        System.out.printf("Bom, %s, escreva os dados que vamos pedir porfavor.\n", nome);
        System.out.println("Digite o Numero da Conta: ");
        Integer conta = scanner.nextInt();
        System.out.println("Digite o Numero da Agencia: ");
        String agencia = scanner.next();
        System.out.println("Digite o Nome completo do cliente: ");
        String nomeConta = scanner.next();
        System.out.println("Digite o Saldo da Conta: ");
        Double saldo = scanner.nextDouble();
        scanner.close();
        System.out.println("========================================================================================================================================");
        System.out.printf("Olá %s, obrigado por criar sua conta no nosso banco! A sua conta é %s. A sua agencia é %s. Seu saldo disponivel é R$ %s", nome, conta, agencia, saldo);


    }
}