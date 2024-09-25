import java.util.Scanner;

public class EX3 {
    

    public static void main(String[] args) {
       
        System.out.println("Digite o Ano");
        Scanner teclado = new Scanner(System.in);
        
        int ano = teclado.nextInt();

        if((ano % 4 == 0 || ano % 400 == 0) && ano % 100 != 0){

            System.out.println(ano + " é Bissexto");

        }else{

            System.out.println(ano + " Não é Bissexto");
        }
        teclado.close();
    }
}
