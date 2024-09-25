import java.util.Scanner;

public class EX2 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
    
        System.out.println("Digite o primeiro numero");
        double num = teclado.nextDouble();

        System.out.println("Digite o segundo numero");
        double num2 = teclado.nextDouble();

        System.out.println("Operação : * . / . - . +");
        String operacao = teclado.next();
        
        if (operacao.equals("/")){
            
            System.out.println(num / num2);
 
        }else if (operacao.equals("*")){

            System.out.println(num * num2);

        }else if (operacao.equals("-")){

            System.out.println(num - num2);
        
        }else if (operacao.equals("+")){

            System.out.println(num + num2 );
        
        }
        teclado.close();
    }
}
