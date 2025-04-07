public class App {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        Account a1 = new Account();
        
        System.out.println("Digite o número da conta: ");
        a1.accountNumber = scanner.nextInt();
        scanner.nextLine();
       
        System.out.println("Digite seu nome: ");
        a1.accountOwner = scanner.nextLine();
       
        System.out.println("Digite o saldo da conta: ");
        a1.balance = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Deseja ver os dados da conta ? [Sim/Não]");
        String respostaUsuario = scanner.nextLine();

        if(respostaUsuario.equals("Sim")){
            System.out.println("-------------------- Dados da Conta --------------------");
            System.out.printf("\tNúmero da conta = %d\n", a1.accountNumber);
            System.out.printf("\tNome do dono da conta = %s\n", a1.accountOwner);
            a1.printBalance();
            System.out.println("--------------------------------------------------------");

            System.out.println();
            System.out.println("PROGRAMA FINALIZADO.");
        }else{
            System.out.println("Certo, até a próxima.");
        }
    }
}

