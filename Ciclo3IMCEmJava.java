//PROGRAMA QUE MEDE O IMC DO USUÁRIO//
//AUTOR: DIEGO RESENDE ALVES - SISTEMA DE INFORMAÇÃO - UNIS - TRÊS PONTAS MG//250

package ciclo.pkg3.imc.em.java;
import java.util.Scanner;


public class Ciclo3IMCEmJava {

    
public static void main(String[] args) {
        double peso;
        double altura;
        
        Scanner leia = new Scanner (System.in);
        System.out.println("INFORME O SEU PESO: ");
        peso = leia.nextDouble();
        System.out.println("INFORME SUA ALTUA: ");
        altura = leia.nextDouble();
        
        double imc;
        imc = peso/(altura*altura);
        
        if(imc < 18.5){
        System.out.println("ABAIXO DO PESO");
            
        }
        
        else if (imc >= 18.6 && imc <= 24.9){
        System.out.println("PESO NORMAL");
            
        }
        
        else if(imc >= 25.0 && imc <= 29.9){
        System.out.println("PESO EM ECESSO");
            
            
        }
        
        else if(imc >= 30.0 && imc <= 34.9){
        System.out.println("OBESIDADE GRAU I");
            
            
        }
        
        else if(imc >= 35.0 && imc <= 39.9){
        System.out.println("OBESIDADE GRAU II");
            
            
        }
        
        else{
        System.out.println("OBESIDADE GRAU III");
          
        
        }
        
        System.out.println("SEU IMC É: " +imc);
        }
        // TODO code application logic here
    }
    

