
import entidades.Comparavel;
import java.util.Scanner;


public class Program {

   
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        System.out.println("Digite o valor para ser comparado");
        int num= read.nextInt();
        Comparavel comparar = new Comparavel(num);
        
      comparar.émaiorOuIgual(num);
      comparar.éMenorOuIgual(num);
      comparar.éDiferenteDe(num);
        
    }
    
}
