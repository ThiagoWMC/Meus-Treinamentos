import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double num = teclado.nextDouble();

        System.out.println("1 - Dolar , 2 - Euro , 3 - Libra");
        
        
        
        int escolha = teclado.nextInt();
        System.out.println("----------");

        switch (escolha){
            
            case 1 : 
                System.out.print(num * 0.20);
                    
                break;
        
            case 2 :
                System.out.println(num * 0.18);

            case 3 : 
                System.out.println(num * 0.16);
            default:
                break;
        }

        teclado.close();
    }
}
