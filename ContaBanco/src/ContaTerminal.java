import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da agência:");
        int numero = scanner.nextInt();

        System.out.println("Digite a agência:");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente:");
        scanner.nextLine(); // esvaziando o buffer do teclado
        String cliente = scanner.nextLine();

        System.out.println("Digite o valor do saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
