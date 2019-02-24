/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author humbe
 */
public class Fila {
    
    int inicio;
    int fim;
    int tamanho;
    int cont;
    int f[];
    int opcao;
    int tempo = 0;
    Scanner entrada = new Scanner(System.in);
  

    public Fila() {

        inicio = fim = -1;

        tamanho = 100;

        f = new int[tamanho];

        cont = -1;

    }

    public boolean Vazia() {

        if (cont == -1) {
            inicio=fim=-1;
            return true;

        }

        return false;

    }

    public boolean Cheia() {

        if (cont == tamanho - 1) {

            return true;

        }

        return false;

    }

    
public void adicionar(int e) {
      
        if (!Cheia()) {

            if (inicio == -1) {

                inicio = 0;

            }

            Calendar data1 = Calendar.getInstance();

            int segundos1 = data1.get(Calendar.SECOND);

            fim++;

            f[fim] = e;

            cont++;
   
            tempo = ((tempo + segundos1) / cont);

            System.out.println(tempo);

        }

    }

    public void tempo_atendimento() {

        int res = (tempo * cont);

        System.out.println("Tempo de Espera aproximado na fila " + res + " segundos.");
        
    }

  
public void posicao_tempo(int senha) {

        int  pos = 0, tempo_posicao;
        
        for (int i = inicio; i <= fim; i++) {
            if (f[i] == senha) {
                pos = i;
            }

        }
        tempo_posicao = (pos - inicio) * tempo;
        System.out.println("Sua posição é: " + pos + " e seu tempo de espera é: " + tempo_posicao + " segundos.");

    }



    public void remover() {

        if (!Vazia()) {

            System.out.println("Tirando o elemento " + f[inicio] + " da fila.");

            inicio++;

            cont--;

        } else {

            System.out.println("A fila está vazia!");

        }

    }

    public void exibir_fila() {

        if (!Vazia()) {

            String elementos = "";

            for (int i = inicio; i <= fim; i++) {

                elementos += f[i] + " , ";

            }
   
            System.out.println("Os elementos da fila são: " + elementos);

        } else {

            System.out.println("Não há elementos na fila!");

        }
 
    }

    
public int exibir_menu() {

        System.out.println("***MENU*****");

        System.out.println("1- Colocar na Fila");

        System.out.println("2- Exibir elementos da Fila");

        System.out.println("3- Tirar elemento da Fila");

        System.out.println("4- Tempo de Espera da Fila");

        System.out.println("5- Seu tempo de Espera na Fila");

        System.out.println("6- Sair");

        System.out.print("Opção: ");

        opcao = entrada.nextInt();

        return opcao;

    }
}
