import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //TODO: Conhecer e importar a classe Scanner

            Scanner sc = new Scanner(System.in);
            int numero;
            String agencia, nomecliente;
            double saldo;
            
        //Exibir as mensagens para o nosso usuario
        // Obter pelo scanner os valores digitados no terminal
        System.out.print("Por favor, digite o nome do titular da conta!");
        nomecliente = sc.nextLine();
        System.out.print("Por favor, digite o número da Agência!");
        agencia = sc.nextLine();
        System.out.print("Por favor, digite o número da Conta!");
        numero = sc.nextInt();
        System.out.print("Por favor, digite o saldo inicial da Conta!");
        saldo = sc.nextDouble();

        sc.close();

        //Exibir a mensagem conta criada
        System.out.println("Olá "+nomecliente+", obrigado por criar uma conta em nosso banco, sua agência "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponivel para saque!");
    }
}
