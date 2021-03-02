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
        int k, result =0;
        System.out.println("Informe um número");
        k = leitor.nextInt();
        
        result =  n_divisores(k);
        
        System.out.println("quantidade de divisores = "+result);
        
        
    }
    
    
    
    public static int n_divisores(int k){
        int cont_div = 0;
        
        for(int i =1; i<=k;i++){
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
    
    public static void divisores(int cont_div, int k){
        int[] divisores = new int[cont_div];
        int j =0;
        for(int i=1; i<=k;i++){
            if(k%i==0){
                divisores[j]=i; 
            }
             j+=1;
        }
        
        System.out.println("divisores");
        for(int a = 0; a<=cont_div;a++){
            System.out.print(divisores[a]+" ");
        }
    }
    
}
