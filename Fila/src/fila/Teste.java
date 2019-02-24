/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

import java.util.Scanner;

/**
 *
 * @author humbe
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  

        Scanner entrada = new Scanner(System.in);

        int elemento, opc;
        int senha=0;
        Fila f = new Fila();
        do {

            opc = f.exibir_menu();

            if (opc == 1) {
                senha++;
                System.out.print("Entrou na fila, sua senha é: "+senha);
                f.adicionar(senha);
                
            }
            
            if (opc == 2) {

                f.exibir_fila();

            }
            
            if (opc == 3) {

                f.remover();

                f.exibir_fila();

            }

            if (opc == 4) {

                f.tempo_atendimento();
                
            }
            
            if (opc == 5) {

                f.posicao_tempo(senha);

            }
            
            if (opc == 6) {

                System.out.println("Saindo do Sistema");

            }


        } while ((opc >= 1) && (opc < 6));
   

}




}
    

