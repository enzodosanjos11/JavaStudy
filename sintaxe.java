class Variaveis{
     //Variáveis: int e (short ou long int),float e (long float), double, boolean e a STRING é uma classe.
    public static void variaveisfun(){
    
    System.out.println("---------------- Variáveis --------------------");
    
    int numeroInteiro = 10;
    float numeroFloat = 10;
    double numeroDouble = 1000000000;
    boolean resposta = true;
    String nome = "Enzo";
 
    System.out.println("Numero inteiro: " + numeroInteiro + "\nNumero decimal: " + numeroFloat + "\nNumero double: " + numeroDouble + "\nVariável booleana: " + resposta + "\nString nome: " + nome);
    
    System.out.println();
    }
}

class Casting{

    public static void tiposDeCasting(){
    //Casting Implicito:
    System.out.println("---------------- Casting --------------------");
    System.out.println("Casting Implícito: ");
    
    int numeroInteiro = 10;
    double numeroDouble = numeroInteiro;

    System.out.println("Número Inteiro: " + numeroInteiro + "\nNúmero Double: " + numeroDouble);
    System.out.println();

    //Casting Explícito:
    System.out.println("Casting Explícito: ");
    
    double numeroDoubl = 10.20;
	int numeroInt = (int )numeroDoubl;

    System.out.println("Número Double: " + numeroDoubl + "\nNúmero Inteiro: " + numeroInt);
    
    System.out.println();
    }
}

class ExplicacaoString{

    public static void exemplo(){
    //String na prática:
    
    System.out.println("---------------- String --------------------");
    
    String nome = "Enzo Andrade dos Anjos";
    System.out.println("Nome do Desenvolvedor: "+ nome);

    nome = nome.toUpperCase();
    System.out.println("Nome do Desenvolvedor com letras MAIÚSCULAS: " + nome);
    System.out.println();
    }
}



public class sintaxe {
    public static void main (String[] args){

    Variaveis.variaveisfun();
    Casting.tiposDeCasting();
    ExplicacaoString.exemplo();












    }
}
