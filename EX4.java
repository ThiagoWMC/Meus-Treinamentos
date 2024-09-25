import java.util.Scanner;

public class EX4 {

    public static void main(String[] args) {
     
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua altura");
        double num = teclado.nextDouble();

        System.out.println("Digite seu peso");
        double num2 = teclado.nextDouble();

        double imc = (num)/Math.pow(num2, 2);

        if (imc < 18.5){

            System.out.println("Voce é um Frangolino");
        
        }else if (imc < 25.0 ){

            System.out.println("Voce ta gordinho em kkkk");

        }else if (imc < 30.0){
            
            System.out.println("Obesidade em gurizao");

        }else if (imc < 35.0){

            System.out.println("voce é uma bola em guri");

        }else if (imc >= 40.0 ){

            System.out.println("Risco de infarto pelo peso pow.. kkkkkk");
        }
        teclado.close();
    }
    
}
