import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        
        // Declaração das variáveis
        int numeroConta;
        String agencia, nomeCliente;
        double saldo;

        // Recebimento dos dados pelo usuário
        System.out.println("---------- Bem Vindo ao Banco ----------");

        System.out.println("Digite o número da conta: ");
        numeroConta = sc.nextInt();
        System.out.println("Digite o número da agência com dígito: ");
        agencia = sc.next();
        System.out.println("Digite o seu nome: ");
        // nextLine() utilizado para que o Scanner reconheca nomes compostos (com espaço)
        sc.nextLine();
        nomeCliente = sc.nextLine();
        System.out.println("Digite seu saldo: ");
        saldo = sc.nextDouble();
        
        // Impressão dos dados do usuário
        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua Agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");

        sc.close();
    }
}
