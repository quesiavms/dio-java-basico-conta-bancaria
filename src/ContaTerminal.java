import java.util.*;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta = 0;
        String nomeAgencia = "";
        String nomeCliente = "";
        float saldo = 0;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor digite o numero da sua conta: ");
        numeroConta = scanner.nextInt();
        System.out.print("Por favor digite o nome da Agencia: ");
        nomeAgencia = scanner.next();
        System.out.print("Por favor digite o nome do Cliente: ");
        nomeCliente = scanner.next();
        System.out.print("Por favor digite o seu saldo: ");
        saldo = scanner.nextFloat();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+nomeAgencia+", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque");
    }
}
