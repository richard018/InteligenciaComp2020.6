package com.company;

import java.util.Scanner;

public class Main {

    static String labirinto[][] = new String[5][5];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for(int i = 0; i < labirinto.length; i++){
            for(int j = 0; j < labirinto.length; j++){
                labirinto[i][j] = scanner.next();
            }
        }
        for(int i = 0; i < labirinto.length; i++){
            for(int j = 0; j < labirinto.length; j++){
                System.out.print(labirinto[i][j]);
            }
            System.out.println("");
        }
    }
}
