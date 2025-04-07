
public class exercicio04 {
    public static void main(String[] args) {
        
        var scanner = new java.util.Scanner(System.in);
        int multa;
        int velocidadePermitida = 90;
        
        System.out.println("Você passou por um radar, o qual registra sua velocidade e emiti a multa caso seja necessário: ");
        
        System.out.println("Digite a velocidade em que o carro estava: ");
        int velocidadeVeiculo = scanner.nextInt();
        
        int velocidadeConsiderada = velocidadeVeiculo + 7;

        System.out.println("Velocidade PERMITIDA: " + velocidadePermitida);
        
        if(velocidadeConsiderada > 90){
            multa = (velocidadeConsiderada - 90) * 10;
            System.out.println("Devido a velocidade que o veículo estava, você, condutor, receberá uma multa de R$" + multa);
        }else{
            System.out.println("Você etá liberado e sem multa, pois estava trafegando dentro do limite de velocidade.");
        }
    
    
    
    
    
    }
}
