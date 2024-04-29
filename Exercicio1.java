/*Faça um programa que preencha um vetor com nove números inteiros
calcule e mostre os números primos e suas respectivas posições.
*/
import java.util.Scanner;

public class Exercicio1 {
  
  public static void main(String[] args) {
    Scanner input = new Scanner();
    
    int[] vetor = new int[9];
    
    for(int i = 0; i < numero.length i++){ 
      System.out.println("Digite o " + (i+1) + "a seguir ");
       nmero[i].input.nextInt();
    }
                         
      for(int i= 0 < numero.length; i++){ 
        for (int j = 1; <= numero[i];j++){ 
          if(numero[i] % j == 0){
            divisao++
          }
        }
        if(divisao <= 2){ 
   
      System.out.println("O numero" + numero[i] + "è primo");
          System.out.println("Sua posição é" + i);
        }
        divisao = 0;
      }
       input.close();
                         
	}
}

 