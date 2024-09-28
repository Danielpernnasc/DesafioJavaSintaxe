import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 237.48;
        String nome = "Mario Andrade";

        System.out.println("Digite sua agência: ");
        int agencia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite sua conta: ");
        String conta = scanner.nextLine();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
