
public class exercicio05 {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        
        System.out.println("Digite um numero de 1 a 7 e lhe retornaremos o dia correspondente a ele: ");
        int numero = scanner.nextInt();

        switch(numero){
            case 1 -> System.out.println("Dia = Domingo.");
            case 2 -> System.out.println("Dia = Segunda - Feira.");
            case 3 -> System.out.println("Dia = Terça - Feira.");
            case 4 -> System.out.println("Dia = Quarta - Feira.");
            case 5 -> System.out.println("Dia = Quinta - Feira.");
            case 6 -> System.out.println("Dia = Sexta - Feira.");
            case 7 -> System.out.println("Dia = Sábado.");
            default -> System.out.println("Opção Inválida.");
        }
    
    }
}
