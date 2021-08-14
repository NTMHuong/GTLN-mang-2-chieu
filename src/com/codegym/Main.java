package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số dòng của ma trận:");
            m = sc.nextInt();
            System.out.println("Nhập vào số cột của ma trận:");
            n = sc.nextInt();
        } while (m < 1 || n < 1);

        int[][] arr = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.println("Nhap arr["+i+"]["+j+"] :" );
                arr[i][j] = sc.nextInt();
            }
        }

        int max = arr[0][0];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
