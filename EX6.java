import java.util.Scanner;

public class EX6{

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("1- triangulo ,2- circulo ,3- Retangulo");

        int escolha = teclado.nextInt();
        double altura;
        double base; 
        double raio;

        switch (escolha) {
            case 1:
                System.out.println("Vamos calcular a area do triangulo");
                System.out.println("");
                System.out.println("Digite altura");
                altura = teclado.nextDouble();
                System.out.println("Digite a base");
                base = teclado.nextDouble();
                System.out.println((altura*base)/2);
                break;
            case 2:
                System.out.println("Vamos calcular o curculo");
                System.out.println("");
                System.out.println("Digite Area");
                raio = teclado.nextDouble();
                System.out.println(Math.PI*Math.pow(raio,2));
                break;
            case 3:
                System.out.println("Vamos calcular a area do Retangulo");
                System.out.println("");
                System.out.println("Digite altura");
                altura = teclado.nextDouble();
                System.out.println("Digite a base");
                base = teclado.nextDouble();
                System.out.println(altura*base);
            break;
            default: 
                break;
        }
        teclado.close();    
    }
    }
    

