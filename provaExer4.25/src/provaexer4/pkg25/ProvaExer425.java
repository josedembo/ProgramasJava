/*
 Exercício 4.25: Se m e n sao inteiros ımpares e m , n, entao existe um único inteiro r tal que |m − r| = |n − r|
 */
package provaexer4.pkg25;

/**
 *
 * @author José Dembo
 */
import java.util.Scanner;
public class ProvaExer425 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leitor = new Scanner(System.in);
        
        int n, m, auxi_troca;
        int s,t,r;
        int parte1, parte2;
        
        System.out.println("Informe o valor de n");
        n = leitor.nextInt();
        
        System.out.println("Informe o valor de m");
        m = leitor.nextInt();
        
        int a =1;
        
        while(a == 1){
            s = (m-1)/2;
            t = (n+1)/-2;
            r = s - t;
            parte1 = (m-r)%2;
            parte2 = (n-r)%2;
            
            if(parte1<0){
                parte1 *=-1;
            }else{
                if(parte2<0){
                    parte2*=-1;
                }
            }
            
            if(parte1 == parte2){
                System.out.println("Valor da prova: verdade");
                System.out.println("parte1 |m -r| = "+parte1);
                System.out.println("Parte2 |n -r| = "+parte2);
                System.out.println("Valor de r = "+r);
                a=2;
            }else{
                auxi_troca = m;
                m = n;
                n = auxi_troca;
            }
            
            
        }

        
    }
    
}
