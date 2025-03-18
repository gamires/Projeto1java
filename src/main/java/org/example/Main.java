package org.example;

import java.util.Scanner;

public class Main {
    public static boolean isAlfabeto(char c) {
        return c >= 'a' && c <= 'z';
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        //colocar []
        char[] letrasList = new char[10];
        int[] numerosList = new int[10];
        int Q_elementos = 0;
    
    
        System.out.println("Digite seu prompt: ");
        String entrada = scanner.nextLine();
    
        while (entrada != "exit") {
            try {
                // Ele vai digitar o pronpt ex: Y = 3 ou y = 3
                entrada = scanner.nextLine().replaceAll(" ", "").toLowerCase(); 
                // aqui ele armazena na entrada a string digitada e remove as partes em branco agr esta assim y=3
    
    
                if(isAlfabeto(entrada.charAt(0))) { // analisa se o primeiro elemento da string e se for uma letra entao addiciona ao array de letras
                    if ((entrada.charAt(1) == '=')) { // analisa se o segundo elemento da string e se for um igual
                        for(int i = 2; i < entrada.length();i++){
                            char c = entrada.charAt(i);
                            if (!isAlfabeto(c)) { // Verifica se é número
                                int num = c - '0';// Converte o char para int
                                numerosList[Q_elementos] = num;
                                letrasList[Q_elementos] = entrada.charAt(0);
                                Q_elementos++;
                                break;
                            }
                        } 
                    } 
                }
                // analisa se o primeiro elemento da string e se for uma letra entao addiciona ao array de letras
                    
            
            
    
            System.out.println("Letras adicionadas: " + letrasList);
            System.out.println("Números adicionados: " + numerosList);
            // comtinua no VARS faltou so fazer a parte de printar o resultado pq esta em char e n sei como transformar de char p
    
        }
            catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            }
  }    
  scanner.close();
 }
}