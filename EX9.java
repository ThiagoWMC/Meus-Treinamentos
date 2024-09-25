import java.util.Scanner;

public class EX9 {
    
public static void main(String[] args) {
   
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite sua idade: ");
    int num = teclado.nextInt();

    if (num <= 12){
        System.out.println("Voce é uma criança.. kkk ");

    }else if (num <= 17){

        System.out.println("Vcoe é um adolencente.. ");

    }else if (num <= 99){

        System.out.println("Voce é um adulto ...");

    }
    teclado.close();
}

}

