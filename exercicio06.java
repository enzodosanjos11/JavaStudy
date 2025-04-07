
public class exercicio06{
    public static void main(String[] args) {
        
        var scanner = new java.util.Scanner(System.in);
        int soma = 0;

        System.out.println("Escolha um número inteiro de sua preferência: ");
        int numeroUsuario = scanner.nextInt();

        for(int i = 0; i < (numeroUsuario + 1); i += 2){
            soma += i;    
        }
        
        System.out.println("A soma derivada dos números pares de 0 a " + numeroUsuario + " é igual a " + soma);
    }
}