
public class exercicio07 {
    public static void main(String[] args) {
        
        var scanner = new java.util.Scanner(System.in);

        double media = 0;
        double nota = 0;
        int quantidade = 0;
        boolean v = true;

        while(v){
            System.out.printf("Digite a sua " + (quantidade + 1) + "° nota: ");
            String resposta = scanner.nextLine();

            if(resposta.isBlank()){
                media = media / quantidade ;
                System.out.println("---------------- Média do aluno ----------------");
                System.out.printf("Média = %.2f.\n", media);
                System.out.println("Programa Encerrado.");
                break;
            }else{
                quantidade += 1;
                
                try{
                nota = Double.parseDouble(resposta);    
                media += nota;
                }catch(NumberFormatException e){
                    System.out.println("Reposta Inválida, digite um número.");
                }
            }

        }
    }
}

