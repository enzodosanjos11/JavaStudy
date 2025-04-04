
public class exercicio01 {
    public static void main(String[] args){
        var scanner = new java.util.Scanner(System.in);

        System.out.println("Aqui, você aluno(a), poderá descobrir sua média a partir das suas 3 notas, por este motivo, digite suas notas:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double media= (nota1 + nota2 + nota3) / 3;

        System.out.printf("Média: %.2f\n", media);

    }
}
