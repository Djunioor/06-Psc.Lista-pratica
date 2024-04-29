import java.util.Scanner;


public class Exercicio3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int[] Inserir = new int[8];
    int[] positivo = new int[8];
    int[] negativo = new int[8];
    int indPositivo = 0;
    int indiNegativo = 0;
	
      for(int i = 0; i < Inserir.length; i++){
            System.out.print("Insira o número " + (i + 1) + " a seguir: ");
            Inserir[i] = input.nextInt();
      }
    	for(int i = 0; i < Inserir.length; i++){
            if (Inserir[i] >= 0) {
                positivo[indPositivo] = Inserir[i]; 
                indicePositivo++;
            }else {
                negativo[indNegativo] = Inserir[i]; 
                indiceNegativo++;
            }
        }
          
	 	if (indicePositivo == 8) {
            System.out.println("Insira números negativos!");
          
        	} else if (indiceNegativo == 8) {
            System.out.println("Insira números positivos!");
          
        	} else{
            System.out.println("Os números positivos são: ");
          
            for(int i = 0; i < indicePositivo; i++){
                System.out.print(positivo[i] + " ");
            }
            
            System.out.println("Os números negativos são: ");
            for(int i = 0; i < indiceNegativo; i++){
                System.out.print(negativo[i] + " ");
            }
        }
    
   	input.close();
    
  }
}
