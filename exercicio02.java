
public class exercicio02 {
    public static void main(String[] args){
        var scanner = new java.util.Scanner(System.in); 
        
        System.out.printf("Digite a temperatura, em Fahrnheit, no momento em que está respondendo: ");
        double temperaturaFahrenheit = scanner.nextDouble();

        double temperaturaCelsius = ((temperaturaFahrenheit - 32) * 5) / 9;

        System.out.printf("Temperatura após conversão: %.2f", temperaturaCelsius);
    }
}
