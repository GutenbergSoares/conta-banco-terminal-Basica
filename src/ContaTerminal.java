import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente");
        var nome = scanner.next();

        System.out.println("Digite o numero da sua conta");
        var numeroconta = scanner.nextInt();

        System.out.println("Digite o numero da sua agencia");
        var agencia = scanner.next();

        int saldo = 500;
        System.out.println("Ola, " + nome + " a sua Agencia e " + agencia + " e sua conta bancaria e " + numeroconta + " e seu saldo e de " + saldo );
        scanner.close();
    }
}
