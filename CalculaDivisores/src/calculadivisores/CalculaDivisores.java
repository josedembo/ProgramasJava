/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadivisores;

/**
 *
 * @author pedro
 */
import java.util.Scanner;

public class CalculaDivisores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero, quant_div =0;
        int divisores[];
        System.out.println("Informe um número");
        numero = leitor.nextInt();
        
        quant_div =  n_divisores(numero);
        
        System.out.println("quantidade de divisores = "+quant_div);
        
        divisores = divisores(quant_div, numero);
        
        System.out.println("Os divisores sao:");
        
       for(int i =0; i<quant_div;i++){
           System.out.print(divisores[i]+" ");
       }
        System.out.println();
    }
    
    
    // A funcao calcula a quantidade de  divisores do numero informado incluido 1 e o proprio numero
    public static int n_divisores(int k){
        int cont_div = 0;
        
        for(int i =1; i<=k;i++){
            if(k%i==0){
                cont_div +=1;
            }
        }
        return cont_div;
    }
    
    // A funcao calcula o quantidade de divisores excepto o proprio numero
    public static int n_divisoresIncom(int k){
        int cont_div = 0;
        
        for(int i =1; i<k;i++){
            if(k%i==0){
                cont_div +=1;
                if(i==k){
                System.out.print(" divisor: "+i+" \n");
                }else{
                    System.out.print(" divisor: "+i+" ");
                }
            }
        }
        return cont_div;
    }
    
    // essa funcao retorna os divisores do numero informado incluindo ele mesmo
    public static int[] divisores(int cont_div, int k){
        int[] divisores = new int[cont_div];
        int j =0;
        for(int i=1; i<=k;i++){
            if(k%i==0){
                divisores[j]=i;
                j+=1;
            }
        }
       /*
        for(int a = 0; a<cont_div;a++){
           System.out.print(divisores[a]+" ");
        }
        */
       
       return divisores;
        
    }
    
}
