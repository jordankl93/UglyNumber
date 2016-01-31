/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uglynumber;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jordan-PC
 */
public class main {
    
    //Acha o menor multiplo de 2, 3 e 5
    public int menorMultiplo(int menorMultiplo2, int menorMultiplo3, int menorMultiplo5){
                
        if(menorMultiplo2 < menorMultiplo3 && menorMultiplo2 < menorMultiplo5)
            return menorMultiplo2;
        else
            if(menorMultiplo3 < menorMultiplo5)
                return menorMultiplo3;
            else
                return menorMultiplo5;
        
    }
    
    public int numerosPrimos(){
        int menor2 = 2, menor3 = 3, menor5 = 5;
        int menorAtual = 1;
        List<Integer> numerosPrimos = new ArrayList<>();
        
        numerosPrimos.add(menorAtual);
        
        for(menorAtual = 2; menorAtual < 1500; menorAtual++){
            
        }
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroFeio = 1;
        int countFeio = 1;
        int aux;

        while (countFeio <= 1500) {
            aux = numeroFeio;
            while (aux % 2 == 0) {
                aux = aux / 2;
            }
            while (aux % 3 == 0) {
                aux = aux / 3;
            }
            while (aux % 5 == 0) {
                aux = aux / 5;
            }

            if (aux == 1) {
                System.out.println("O numero " + numeroFeio + " eh feio! posicao = " + countFeio);
                countFeio++;
                numeroFeio++;
            } 
            else {
                numeroFeio++;
            }
        }

    }

}
