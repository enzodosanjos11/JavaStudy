public class Account {
    //Atributos, ou seja, as características que a classe possui.
    int accountNumber;
    String accountOwner;
    double balance;

    //Métodos, em outras palavras, são as ações que a classe possui.
    void accountInformation(){
        System.out.println("-------------------- Dados da Conta --------------------");
        System.out.printf("\tNúmero da conta = %d\n", accountNumber);
        System.out.printf("\tNome do dono da conta = %s\n", accountOwner);
        printBalance();
        System.out.println("--------------------------------------------------------");
        System.out.println();
    }
    
    void printBalance(){
        System.out.printf("\tSaldo = %.2f\n", balance);
        System.out.println();
    }


    void deposit(double depositnumber){
        if(depositnumber > 0){
            balance += depositnumber;
        }else{
            System.out.println("Valor inválido.");
            System.out.println();
        }

    }

    void withdraw(double withdrawnumber){
        if(withdrawnumber > balance && withdrawnumber < 0){
            System.out.println("Valor inválido.");
            System.out.println();
        }else{
            balance -= withdrawnumber;
        }
    }

}
