import java.util.Locale;
import java.util.Scanner;

public class desafioHeroi {
    
    /**
    * @param args
    * @throws Exception
    */
   public static void main(String[] args) throws Exception {
      Scanner dado = new Scanner(System.in).useLocale(Locale.US);
        
      String nomeHeroi = dado.next();

      int quantidadeXp = dado.nextInt();
        if (quantidadeXp <= 1000) {
           System.out.println("O Herói de nome " + nomeHeroi + " está no nível de Ferro"); 
        }
        else if (quantidadeXp <= 2000) {
           System.out.println("O Herói de nome " + nomeHeroi + " está no nível de Bronze"); 
        }
        else if (quantidadeXp <= 6000) {
           System.out.println("O Herói de nome " + nomeHeroi + " está no nível de Prata"); 
        }
        else if (quantidadeXp <= 7000) {
           System.out.println("O Herói de nome " + nomeHeroi + " está no nível de Ouro"); 
        }
        else if (quantidadeXp <= 8000) {
           System.out.println("O Herói de nome " + nomeHeroi + " está no nível de Platina"); 
        }
        else if (quantidadeXp <= 9000) {
           System.out.println("O Herói de nome " + nomeHeroi + " está no nível de Ascendente"); 
        }
        else if (quantidadeXp <= 10000) {
           System.out.println("O Herói de nome " + nomeHeroi + " está no nível de Imortal"); 
        }else{
           System.out.println("O Herói de nome " + nomeHeroi + " está no nível de Radiante"); 
        }
   dado.close();    

    }
}    
