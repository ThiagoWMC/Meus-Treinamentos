import java.util.Scanner;

public class aula {
    
    public static void main(String[] args) {
        
            Scanner teclado = new Scanner(System.in);
       
        // inicio do programa indicando o que ele é 
            System.out.println("Olá , Seu Sistema de troco !");

             System.out.println("");

        // Aqui é sobre aonde o usuario irá  digitar o valor total da compra 

             System.out.println("Digite o valor total da compra ");
                double valorCom = teclado.nextDouble();

        // O usuario devera escrever o valor total recebido  de pagamento

            System.out.println("Digite o valor recebido de pagamento");
                double valorRec = teclado.nextDouble();

        // calculo sobre  Valor de compra - o valor recebido e colocado em troco 
                double troco = valorCom - valorRec;
       
        // São as cedulas e os valores em moedas 
                int [] cedulas = {100, 50, 20, 10, 5, 2, 1,};
        
                double [] moedas = { 0.50, 0.25, 0.10 , 0.05 , 0.01};
        
        // identifica se o valor do troco foi menor que o valor total da compra   
        if ( troco > 0 ){
            System.out.println("Valor Recebido e menor que o valor de compra !!!");

        // se o valor do troco foi igual da compra esse Else if irá aparecer na tela
        }else if (troco == 0) {
            System.out.println("Não a troco a Devolver !!");

            // se inicia o troco , identificando quantas cédulas e Moedas precisa ser retornado 
        }else {
             System.out.println("Moedas e Cédulas á Devolver");
        
            // laço for para ver quantidade de moedas e idetificando e resultado da divisao é convertido para um inteiro
            // imprime a quantidade e o valor das moedas
            for (double cedula : cedulas) {
                int quantidade = (int) (troco / cedula);
                if (quantidade < 0) {
                    System.out.println(quantidade + " cédulas de R$ " + cedula);
                    troco -= quantidade * cedula;
                }
            } 
            for (double moeda : moedas ) {
                int quantidade = (int) (troco / moeda);
                if (quantidade < 0){
                    System.out.println(quantidade + " Moeda de R$  " + moeda);
                    troco -= quantidade * moeda;
                }
            }
         } 
    }  
}

