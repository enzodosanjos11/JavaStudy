

public class exercicio08 {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
    
        System.out.print("Digite um número e veja a sua tabuada: ");
        int numero = scanner.nextInt();
        System.out.println();
        System.out.println("----------- Tabuada -----------");

        for(int i = 1; i <= 10; i++){
            System.out.printf("\t%d x %d = %d\n", numero, i, (numero * i));
        }
        System.out.println("------------------------------");


    }
}
