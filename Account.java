

public class Account {
    //Atributos, ou seja, as características que a classe possui.
    int accountNumber;
    String accountOwner;
    Double balance;

    //Métodos, em outras palavras, são as ações que a classe possui.
    void printBalance(){
        System.out.printf("\tSaldo = %.2f\n", balance);
    }

}
