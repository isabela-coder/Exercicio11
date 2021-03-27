
package exercicio11;

import java.util.Scanner;


public class Exercicio11 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float diagMaior;
        float diagMenor;
        float area;
        
        System.out.println("Digite a diagonal maior");
        diagMaior = entrada.nextFloat();
        System.out.println("Digite a diagonal menor");
        diagMenor = entrada.nextFloat();   
        area = (diagMaior*diagMenor)/2;
        
        System.out.println("A area do losango é de"+area+" "+ "cm");
        
        
    }
    
}
