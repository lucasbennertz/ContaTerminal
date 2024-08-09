import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        String nome = ContaTerminal.PedirNome();
        String agencia = ContaTerminal.PedirAgencia();
        int numeroConta = ContaTerminal.PedirNumero();
        double saldo = ContaTerminal.PedirSaldo();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia
                + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }

    public static String PedirNome() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Olá, por gentileza nos diga seu nome: ");
        String cliente = leitor.next();
        return cliente;
    }

    public static String PedirAgencia() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Olá, por gentileza nos diga sua Agência(Ex: 000-0): ");
        String agencia = leitor.next();
        return agencia;
    }

    public static int PedirNumero() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Olá, por gentileza nos diga o número de sua conta(Ex: 0000): ");
        int numeroConta = leitor.nextInt();
        return numeroConta;
    }

    public static double PedirSaldo() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Olá, por gentileza nos diga seu saldo(Ex: 000.0): ");
        double saldo = leitor.nextDouble();
        return saldo;
    }
}
