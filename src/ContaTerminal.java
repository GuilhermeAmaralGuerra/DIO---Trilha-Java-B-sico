import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da sua conta: ");
        int numero = sc.nextInt();

        sc.nextLine();

        System.out.print("Digite a agência da sua conta: ");
        String agencia = sc.nextLine();

        System.out.print("Digite seu nome para o banco: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        sc.close();
    }
}
