import java.util.Scanner;

public class EquacaoDeQualquerGrau{

    public static void main(String[] args) {
    
        Scanner leitor = new Scanner(System.in);

        System.out.println("informe o grau da equacao");
        int grauDaEquacao = leitor.nextInt();
        int vetor;
        int coificientes[] = new int[grauDaEquacao];

    }


    public static int[] coificintes(int n){

        Scanner leitor = new Scanner(System.in);

        int[] vetor_coif = new int[n];
        
        System.out.println("Informe a seguir os valores dos coefincinetes\n comecando pelo coinfinciente da variavel de maior expoente ate o termo independente");
        for(int i =0; i<n;i++){

            System.out.println("R:");
             vetor_coif[i]=leitor.nextInt();
        }

        return vetor_coif;
    
    }
}