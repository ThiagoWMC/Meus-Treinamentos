import java.util.Scanner;

public class EX1 {

    public static void main(String[] args) {
        System.out.println(""); 
        
        Scanner teclado = new Scanner (System.in);

        System.out.print("Digite um numero:");
        int num = teclado.nextInt();

        if (num > 0){
           
            System.out.println("Meu numero é positivo");
        
        }else if (num < 0) {

            System.out.println("Meu numero é negativo");
            
        }else { 
            System.out.println("Entao seu numero é 0");
            
        }
        teclado.close();
        
}
    
}