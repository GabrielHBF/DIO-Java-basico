import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String numeroDaAgencia;
        String nomeCliente;
        BigDecimal sladoDaConta;
        String mensagem;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        numeroDaAgencia = scanner.next();
        System.out.println("Por favor, digite o número da Conta !");
        numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite seu nome!");
        nomeCliente = scanner.next();
        System.out.println("Por favor, digite o valor a ser depositado !");
        sladoDaConta = scanner.nextBigDecimal();
        mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo ", nomeCliente,numeroDaAgencia,numeroConta).concat(sladoDaConta + " já está disponível para saque");
       System.out.println(mensagem);
    }
}
