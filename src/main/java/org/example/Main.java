package org.example;

public class Main {
    public static void main(String[] args) {
        try{
            int a = 0;
        }

        catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}