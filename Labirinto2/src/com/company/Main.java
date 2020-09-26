package com.company;

import java.util.Scanner;

public class Main {

    static String labirinto[][] = new String[5][5];
    static Scanner scanner = new Scanner(System.in);
    static private void moverCima(int x, int y) {
        int novaPosicao = x - 1;

        labirinto[novaPosicao][y];
        System.out.println("posição atualizada");
    }

    static private void moverBaixo(int x, int y) {
        int novaPosicao = x + 1;

        labirinto[novaPosicao][y];
        System.out.println("posição atualizada");
    }

    static private void moverEsquerda(int x, int y) {
        int novaPosicao = y - 1;

        labirinto[x][novaPosicao];
        System.out.println("posição atualizada");
    }

    static private void moverCima(int x, int y) {
        int novaPosicao = x + 1;

        labirinto[novaPosicao][y];
        System.out.println("posição atualizada");
    }

    static private void moverDireita(int x, int y) {
        int novaPosicao = y + 1;

        labirinto[x][novaPosicao];
        System.out.println("posição atualizada");
    }


    static private void buscar(int x1, int y1, int x2, int y2) {
        if (x1 < 0  y1 < 0  x2 > 4 || y2 > 5) {
            System.out.println("posição inválida");
        } else {
            moverCima(x1, y1);
            moverBaixo(x1, y1);
            moverEsquerda(x1, y1);
            moverDireta(x1, y1);
        }
    }

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
