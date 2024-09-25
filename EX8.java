import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EX8 {
    
    public static void main(String[] args) {
     
        Scanner teclado = new Scanner(System.in);
        
        List<Integer> numeros = new ArrayList<>();
        
        numeros.add(1);
        numeros.add(9);
        numeros.add(4);
        numeros.add(8);
       

       Collections.sort(numeros);

       System.out.println("Numeros " + numeros);
       
      
       teclado.close();
        
    }
    
}
