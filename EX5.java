import java.util.Scanner;

public class EX5{

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero , Plis");
        int num = teclado.nextInt();

        if (num <= 10){

            System.out.println("A");

        }else if (num <= 40){

            System.out.println("B");

        }else if (num <= 60){

            System.out.println("C");

        }else if (num <= 80){

            System.out.println("D");

        }else if (num <= 90){

            System.out.println("E");

        }else if (num <= 100){

            System.out.println("F");

        }
        teclado.close();
    }
    
}
