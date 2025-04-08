public class App {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        
        boolean continuar = true;
        Account a1 = new Account();
        
        System.out.println("Digite o número da conta: ");
        a1.accountNumber = scanner.nextInt();
        scanner.nextLine();
       
        System.out.println("Digite seu nome: ");
        a1.accountOwner = scanner.nextLine();
       
        System.out.println("Digite o saldo da conta: ");
        a1.balance = scanner.nextDouble();
        scanner.nextLine();

        while(continuar){
            System.out.println("-------------------- Opções --------------------");
            System.out.printf("\t1 - Dados da conta\n\t2 - Saldo da conta.\n\t3 - Depósito.\n\t4 - Saque.\n\t5 - FINALIZAR PROGRAMA.\n");
            System.out.println("------------------------------------------------");
            System.out.println();
            System.out.println("Digite o número da opção que deseja utilizar.");
            int respostaUsuario = scanner.nextInt();
            scanner.nextLine();

            switch(respostaUsuario){
                case 1 -> a1.accountInformation();
                case 2 -> a1.printBalance();
                case 3 -> {
                    System.out.print("Valor do depósito = ");
                    double depositnumber = scanner.nextDouble();
                    scanner.nextLine();
                    a1.deposit(depositnumber);
                    System.out.println("Depósito de " + depositnumber + " reais realizado com sucesso.");
                    System.out.println();
                } 
                case 4 -> {
                    System.out.print("Valor do saque = ");
                    double withdrawnumber = scanner.nextDouble();
                    scanner.nextLine();
                    a1.withdraw(withdrawnumber);
                    System.out.println("Saque de " + withdrawnumber + " reais realizado com sucesso.");
                    System.out.println();
                }
                case 5 -> {
                    System.out.println("Programa finalizado");
                    continuar = false;
                }
                default -> {
                    System.out.println("Opção Inválida");
                }    
            };
        }
    }
}


