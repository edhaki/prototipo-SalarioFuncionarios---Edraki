package Empresa;
import java.util.Scanner;
/**
 *
 * @author Ederson .A Silva
 */
public class Main {


    public static void main(String[] args) {
    
    Scanner leitor = new Scanner(System.in);
        
    operario1 nutricionist = new operario1("Leticia", "Alves", 5678.32, 2022);
    operario2 agenteDeSaude = new operario2("Ederson", "Alves", 2178.28, 2022);
    
    System.out.println("Digite o Ano que está: ");
    nutricionist.setAno(leitor.nextInt());
    nutricionist.PorcentagemAnual(0);
    
    System.out.println("Digite o Ano que está: ");
    agenteDeSaude.setAno(leitor.nextInt());
    agenteDeSaude.PorcentagemAnual(0);
    
      
       
    }
    
}
