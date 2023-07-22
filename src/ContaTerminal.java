import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao atemdimemto online de criação de contas!\n");

        System.out.println("Por gentileza insira seu nome completo: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Por gentileza insira a agência desejada: ");
        String agencia = scanner.next();
        System.out.println("Por gentileza insira o número da conta: ");
        Integer numero = scanner.nextInt();
        System.out.println("Por gentileza insira seu saldo: ");
        Double saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque!");

        scanner.close();
 }
}
