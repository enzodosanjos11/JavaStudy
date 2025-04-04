public class exercicio03 {
    public static void main(String[] args) {
        
        var scanner = new java.util.Scanner(System.in);

        System.out.print("Escolha um número para x: ");
        int x = scanner.nextInt();
        
        if(x % 2 == 0){
            System.out.println("Valor de x (ANTIGO): " + x + "\nValor de x (ATUAL): " + (x + 5));
        }else{
            System.out.println("Valor de x (ANTIGO): " + x + "\nValor de x (ATUAL): " + x * 2);
        }
    }
}
