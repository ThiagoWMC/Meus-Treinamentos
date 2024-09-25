import java.util.ArrayList;
import java.util.List;

public class prof {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("pedro");
        lista.add("Thiago");
        lista.add("Joao");
         
        lista.forEach((nome) -> {
            System.out.println(nome);
        });


        for(String n : lista){
        System.out.println(n);
    }
    }
    
}
