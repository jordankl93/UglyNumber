/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uglynumber;

/**
 *
 * @author Jordan-PC
 */
public class main {

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
