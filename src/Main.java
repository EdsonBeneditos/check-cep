import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        CheckCep checkCep = new CheckCep();

        System.out.println("Digite um numero de cep para consulta");
        var cep = reading.nextLine();

       try {
           Address newAddress = checkCep.searchAddress(cep);
           System.out.println(newAddress);
           FileGenerator gerator = new FileGenerator();
           gerator.saveJson(newAddress);
       } catch (RuntimeException | IOException e) {
           System.out.println(e.getMessage());
           System.out.println("Finalizando ah aplicação");
       }



    }
}
